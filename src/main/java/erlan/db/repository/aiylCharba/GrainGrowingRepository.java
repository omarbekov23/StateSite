package erlan.db.repository.aiylCharba;

import erlan.model.entity.aiylCharba.GrainGrowing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrainGrowingRepository extends JpaRepository<GrainGrowing, Long> {
}