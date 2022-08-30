package erlan.db.servise.salamattykdySaktoo;

import erlan.model.entity.salamattykSaktoo.MedicalCenter;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface MedicalCenterService {
    MedicalCenter saveMedicalCenter(MedicalCenter medicalCenter);

    MedicalCenter update(MedicalCenter medicalCenter, Long id);

    ResponseEntity<?> deleteById(Long id);

    List<MedicalCenter> getAll();

}
