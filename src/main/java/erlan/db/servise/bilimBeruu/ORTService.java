package erlan.db.servise.bilimBeruu;

import erlan.model.entity.bilimBeruu.ORT;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ORTService {
    ORT saveORT(ORT ort);

    ORT update(ORT ort, Long id);

    ResponseEntity<?> deleteById(Long id);

    List<ORT> getAll();
}
