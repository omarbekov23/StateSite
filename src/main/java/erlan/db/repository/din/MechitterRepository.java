package erlan.db.repository.din;

import erlan.model.entity.din.Mechitter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MechitterRepository extends JpaRepository<Mechitter, Long> {
}