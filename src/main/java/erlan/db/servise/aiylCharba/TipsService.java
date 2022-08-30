package erlan.db.servise.aiylCharba;

import erlan.model.entity.aiylCharba.Tips;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface TipsService {

    Tips saveTips(Tips tips);

    Tips update(Tips tips, Long id);

    ResponseEntity<?> deleteById(Long id);

    List<Tips> getAll();
}
