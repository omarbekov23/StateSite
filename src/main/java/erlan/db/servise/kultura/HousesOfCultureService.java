package erlan.db.servise.kultura;

import erlan.model.entity.Kultura.HousesOfCulture;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface HousesOfCultureService {
    HousesOfCulture saveHousesOfCulture(HousesOfCulture houses);

    HousesOfCulture update(HousesOfCulture houses, Long id);

    ResponseEntity<?> deleteById(Long id);

    List<HousesOfCulture> getAll();
}
