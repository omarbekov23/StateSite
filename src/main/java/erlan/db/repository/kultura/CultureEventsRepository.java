package erlan.db.repository.kultura;

import erlan.model.entity.Kultura.CultureEvents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CultureEventsRepository extends JpaRepository<CultureEvents, Long> {
}