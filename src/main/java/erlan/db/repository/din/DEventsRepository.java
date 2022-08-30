package erlan.db.repository.din;

import erlan.model.entity.din.DEvents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DEventsRepository extends JpaRepository<DEvents, Long> {
}