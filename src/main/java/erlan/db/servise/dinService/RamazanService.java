package erlan.db.servise.dinService;

import erlan.model.entity.din.Ramazan;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface RamazanService {
    Ramazan saveRamazan(Ramazan ramazan);

    Ramazan update(Ramazan ramazan, Long id);

    ResponseEntity<?> deleteById(Long id);

    List<Ramazan> getAll();
}
