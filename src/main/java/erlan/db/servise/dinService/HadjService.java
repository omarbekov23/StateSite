package erlan.db.servise.dinService;

import erlan.model.entity.din.Hadj;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface HadjService {
    Hadj saveHadj(Hadj hadj);

    Hadj update(Hadj hadj, Long id);

    ResponseEntity<?> deleteById(Long id);

    List<Hadj> getAll();
}
