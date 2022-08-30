package erlan.db.servise.bashkyBet;

import erlan.model.Ataktuular;
import org.springframework.http.ResponseEntity;

public interface AtaktuularService {

    Ataktuular save(Ataktuular ataktuular);

    Ataktuular update(Ataktuular ataktuular, Long id);

    ResponseEntity<?> deleteById(Long id);
}
