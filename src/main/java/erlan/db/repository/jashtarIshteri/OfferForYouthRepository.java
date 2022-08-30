package erlan.db.repository.jashtarIshteri;

import erlan.model.entity.jashtarIshteri.OfferForYouth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfferForYouthRepository extends JpaRepository<OfferForYouth, Long> {
}