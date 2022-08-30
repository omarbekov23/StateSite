package erlan.db.servise.aiylCharba;

import erlan.model.entity.aiylCharba.ACEvent;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ACEventService {

    ACEvent saveAsEvent(ACEvent acEvent);

    ACEvent update(ACEvent acEvent,Long id);

    ResponseEntity<?> deleteById(Long id);

    List<ACEvent> getAll();

}
