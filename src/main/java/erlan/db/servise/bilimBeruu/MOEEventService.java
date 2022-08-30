package erlan.db.servise.bilimBeruu;

import erlan.model.entity.bilimBeruu.MOEEvent;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface MOEEventService {

    MOEEvent saveEvent(MOEEvent event);

    MOEEvent update(MOEEvent event, Long id);

    ResponseEntity<?> deleteById(Long id);

    List<MOEEvent> getAll();
}
