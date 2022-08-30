package erlan.db.servise.aiylCharba;

import erlan.model.entity.aiylCharba.GrainGrowing;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface GrainGrowingService {

    GrainGrowing saveGrainGraving(GrainGrowing grainGrowing);

    GrainGrowing update(GrainGrowing grainGrowing, Long id);

    ResponseEntity<?> deleteById(Long id);

    List<GrainGrowing> getAll();

}
