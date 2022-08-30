package erlan.db.servise.bashkyBet;

import erlan.model.Tazalyk;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface TazalykService {
    Tazalyk saveTazalyk(Tazalyk tazalyk);

    Tazalyk update(Tazalyk tazalyk, Long id);

    ResponseEntity<?> deleteById(Long id);

    List<Tazalyk> getAll();
}
