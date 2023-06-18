package comp.finalproject.umamusumedb.service;


import comp.finalproject.umamusumedb.dto.UserDto;
import comp.finalproject.umamusumedb.entity.Role;
import comp.finalproject.umamusumedb.entity.Uma;
import comp.finalproject.umamusumedb.entity.User;
import comp.finalproject.umamusumedb.repository.RoleRepository;
import comp.finalproject.umamusumedb.repository.UmaRepository;
import comp.finalproject.umamusumedb.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UmaServiceImpl implements UmaService {

    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private UmaRepository umaRepository;
    private PasswordEncoder passwordEncoder;

    public UmaServiceImpl(UserRepository userRepository,
                          RoleRepository roleRepository,
                          UmaRepository umaRepository,
                          PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.umaRepository = umaRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void saveUser(UserDto userDto) {
        User user = new User();
        user.setName(userDto.getFirstName() + " " + userDto.getLastName());
        user.setEmail(userDto.getEmail());
        // encrypt the password using spring security
        user.setPassword(passwordEncoder.encode(userDto.getPassword()));

        Role role = roleRepository.findByName("ROLE_USER");
        if(role == null){
            role = checkRoleExist();
        }
        user.setRoles(Arrays.asList(role));
        userRepository.save(user);
    }

    @Override
    public User findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public List<UserDto> findAllUsers() {
        List<User> users = userRepository.findAll();
        return users.stream()
                .map(this::mapToUserDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<Uma> getAllUmas() {
        return umaRepository.findAll();
    }

    @Override
    public void saveUma(Uma uma) {
        this.umaRepository.save(uma);
    }

    @Override
    public Uma getUmaById(long id) {
        Optional<Uma> optional = umaRepository.findById(id);
        Uma uma = null;
        if (optional.isPresent()) {
            uma = optional.get();
        } else {
            throw new RuntimeException("Uma not found for id " + id);
        }
        return uma;
    }

    @Override
    public void deleteUmaById(long id) {
        this.umaRepository.deleteById(id);
    }

    private UserDto mapToUserDto(User user){
        UserDto userDto = new UserDto();
        String[] str = user.getName().split(" ");
        userDto.setFirstName(str[0]);
        userDto.setLastName(str[1]);
        userDto.setEmail(user.getEmail());
        return userDto;
    }

    private Role checkRoleExist(){
        Role role = new Role();
        role.setName("ROLE_USER");
        return roleRepository.save(role);
    }
}