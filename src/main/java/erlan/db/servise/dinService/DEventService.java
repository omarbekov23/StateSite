package erlan.db.servise.dinService;

import erlan.model.entity.din.DEvents;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface DEventService {
    DEvents saveDEvents(DEvents dEvents);

    DEvents update(DEvents dEvents, Long id);

    ResponseEntity<?> deleteById(Long id);

    List<DEvents> getAll();
}
