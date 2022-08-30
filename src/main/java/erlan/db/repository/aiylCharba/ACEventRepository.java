package erlan.db.repository.aiylCharba;

import erlan.model.entity.aiylCharba.ACEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ACEventRepository extends JpaRepository<ACEvent,Long> {

}
