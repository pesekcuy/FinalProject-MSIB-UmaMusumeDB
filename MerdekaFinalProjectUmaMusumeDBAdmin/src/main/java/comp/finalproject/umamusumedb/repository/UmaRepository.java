package comp.finalproject.umamusumedb.repository;

import comp.finalproject.umamusumedb.entity.Uma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UmaRepository extends JpaRepository<Uma, Long> {
}
