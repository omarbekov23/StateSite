package erlan.db.repository.din;

import erlan.model.entity.din.Hadj;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HadjRepository extends JpaRepository<Hadj, Long> {
}