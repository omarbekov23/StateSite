package erlan.db.repository.din;

import erlan.model.entity.din.Prayer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrayerRepository extends JpaRepository<Prayer, Long> {
}