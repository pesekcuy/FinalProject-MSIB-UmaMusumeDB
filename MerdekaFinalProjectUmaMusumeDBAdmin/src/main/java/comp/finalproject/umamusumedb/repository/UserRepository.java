package comp.finalproject.umamusumedb.repository;


import comp.finalproject.umamusumedb.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}