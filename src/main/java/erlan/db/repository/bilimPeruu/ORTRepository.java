package erlan.db.repository.bilimPeruu;

import erlan.model.entity.bilimBeruu.ORT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ORTRepository extends JpaRepository<ORT, Long> {
}