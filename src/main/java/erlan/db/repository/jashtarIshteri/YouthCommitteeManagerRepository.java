package erlan.db.repository.jashtarIshteri;

import erlan.model.entity.jashtarIshteri.YouthCommitteeManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface YouthCommitteeManagerRepository extends JpaRepository<YouthCommitteeManager, Long> {
}