package erlan.db.repository.jashtarIshteri;

import erlan.model.entity.jashtarIshteri.YouthInitiatives;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface YouthInitiativesRepository extends JpaRepository<YouthInitiatives, Long> {
}