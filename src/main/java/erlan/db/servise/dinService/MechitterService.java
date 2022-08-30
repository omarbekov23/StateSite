package erlan.db.servise.dinService;

import erlan.model.entity.din.Mechitter;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface MechitterService {
    Mechitter saveMechitter(Mechitter mechitter);

    Mechitter update(Mechitter mechitter, Long id);

    ResponseEntity<?> deleteById(Long id);

    List<Mechitter> getAll();
}
