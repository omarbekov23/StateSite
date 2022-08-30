
package erlan.db.repository.din;

import erlan.model.entity.din.Ait;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AitRepository extends JpaRepository<Ait, Long> {
}