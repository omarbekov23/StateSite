package erlan.db.servise.salamattykdySaktoo;

import erlan.model.entity.salamattykSaktoo.Hospitals;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface HospitalsService {
    Hospitals saveHospitals(Hospitals hospitals);

    Hospitals update(Hospitals hospitals, Long id);

    ResponseEntity<?> deleteById(Long id);

    List<Hospitals> getAll();
}
