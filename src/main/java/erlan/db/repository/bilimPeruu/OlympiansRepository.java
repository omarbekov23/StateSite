package erlan.db.repository.bilimPeruu;

import erlan.model.entity.bilimBeruu.Olympians;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OlympiansRepository extends JpaRepository<Olympians, Long> {
}