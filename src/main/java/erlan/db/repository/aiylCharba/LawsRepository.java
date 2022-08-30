package erlan.db.repository.aiylCharba;

import erlan.model.entity.aiylCharba.Laws;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LawsRepository extends JpaRepository<Laws, Long> {
}