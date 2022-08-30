package erlan.db.repository.jashtarIshteri;

import erlan.model.entity.jashtarIshteri.EnterprisingYouth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnterprisingYouthRepository extends JpaRepository<EnterprisingYouth, Long> {
}