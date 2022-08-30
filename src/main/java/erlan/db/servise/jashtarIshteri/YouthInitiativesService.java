package erlan.db.servise.jashtarIshteri;

import erlan.model.entity.jashtarIshteri.YouthInitiatives;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface YouthInitiativesService {
    YouthInitiatives saveYouthInitiatives(YouthInitiatives youthInitiatives);

    YouthInitiatives update(YouthInitiatives youthInitiatives, Long id);

    ResponseEntity<?> deleteById(Long id);


    List<YouthInitiatives> getAll();
}
