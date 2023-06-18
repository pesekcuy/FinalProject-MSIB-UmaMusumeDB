package comp.finalproject.umamusumedb.service;

import comp.finalproject.umamusumedb.dto.UserDto;
import comp.finalproject.umamusumedb.entity.Uma;
import comp.finalproject.umamusumedb.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UmaService {
    void saveUser(UserDto userDto);
    User findUserByEmail(String email);
    List<UserDto> findAllUsers();

    List<Uma> getAllUmas();
    void saveUma(Uma uma);
    Uma getUmaById(long id);
    void deleteUmaById(long id);
}
