package erlan.db.repository.aiylCharba;

import erlan.model.entity.aiylCharba.AnimalHusbandry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalHusbandryRepository extends JpaRepository<AnimalHusbandry, Long> {
}