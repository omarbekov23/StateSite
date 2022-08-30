package erlan.db.repository.kultura;

import erlan.model.entity.Kultura.CulturalFigures;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CulturalFiguresRepository extends JpaRepository<CulturalFigures, Long> {
}