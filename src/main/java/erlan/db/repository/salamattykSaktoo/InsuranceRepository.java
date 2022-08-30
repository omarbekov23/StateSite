package erlan.db.repository.salamattykSaktoo;

import erlan.model.entity.salamattykSaktoo.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InsuranceRepository extends JpaRepository<Insurance, Long> {
}