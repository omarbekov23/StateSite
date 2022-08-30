package erlan.db.repository.bilimPeruu;

import erlan.model.entity.bilimBeruu.MOEEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MOEEventRepository extends JpaRepository<MOEEvent, Long> {
}