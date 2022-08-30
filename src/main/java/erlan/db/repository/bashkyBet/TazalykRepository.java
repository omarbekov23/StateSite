package erlan.db.repository.bashkyBet;

import erlan.model.Tazalyk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TazalykRepository extends JpaRepository<Tazalyk, Long> {
}