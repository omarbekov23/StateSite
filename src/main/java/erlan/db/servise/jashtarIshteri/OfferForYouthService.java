package erlan.db.servise.jashtarIshteri;

import erlan.model.entity.jashtarIshteri.OfferForYouth;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface OfferForYouthService {
    OfferForYouth saveOfferForYouth(OfferForYouth offerForYouth);

    OfferForYouth update(OfferForYouth offerForYouth, Long id);

    ResponseEntity<?> deleteById(Long id);

    List<OfferForYouth> getAll();
}
