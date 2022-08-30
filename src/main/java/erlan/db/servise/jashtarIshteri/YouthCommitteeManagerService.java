package erlan.db.servise.jashtarIshteri;

import erlan.model.entity.jashtarIshteri.YouthCommitteeManager;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface YouthCommitteeManagerService {
    YouthCommitteeManager saveYouthCommitteeManager(YouthCommitteeManager committeeManager);

    YouthCommitteeManager update(YouthCommitteeManager committeeManager, Long id);

    ResponseEntity<?> deleteById(Long id);

    List<YouthCommitteeManager> getAll();
}
