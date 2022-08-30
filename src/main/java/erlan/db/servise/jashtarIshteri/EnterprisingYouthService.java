package erlan.db.servise.jashtarIshteri;


import erlan.model.entity.jashtarIshteri.EnterprisingYouth;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface EnterprisingYouthService {
    EnterprisingYouth saveEnterprisingYouth(EnterprisingYouth enterprisingYouth);

    EnterprisingYouth update(EnterprisingYouth enterprisingYouth, Long id);

    ResponseEntity<?> deleteById(Long id);

    List<EnterprisingYouth> getAll();
}
