package erlan.db.repository.din;

import erlan.model.entity.din.Ethics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EthicsRepository extends JpaRepository<Ethics, Long> {
}