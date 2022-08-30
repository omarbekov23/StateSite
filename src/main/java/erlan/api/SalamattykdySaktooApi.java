package erlan.api;

import erlan.model.entity.salamattykSaktoo.Insurance;
import erlan.model.entity.salamattykSaktoo.MedicalCenter;
import erlan.db.servise.salamattykdySaktoo.DoctorsAdviceService;
import erlan.db.servise.salamattykdySaktoo.HospitalsService;
import erlan.db.servise.salamattykdySaktoo.InsuranceService;
import erlan.db.servise.salamattykdySaktoo.MedicalCenterService;
import erlan.model.entity.salamattykSaktoo.DoctorsAdvice;
import erlan.model.entity.salamattykSaktoo.Hospitals;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/agriculture/acEvent")
@AllArgsConstructor
@Tag(name = "SalamattykdySaktoo Client Get Api")
public class SalamattykdySaktooApi {

    private DoctorsAdviceService doctorsAdviceService;
    private HospitalsService hospitalsService;
    private InsuranceService insuranceService;
    private MedicalCenterService medicalCenterService;

    @Operation(summary = "Get all doctorsAdvice")
    @GetMapping("/doctorsAdvice")
    public List<DoctorsAdvice> getAllDoctorsAdvices() {
        return doctorsAdviceService.getAll();
    }

    @Operation(summary = "Get all hospitals")
    @GetMapping("/hospitals")
    public List<Hospitals> getAllHospitals() {
        return hospitalsService.getAll();
    }

    @Operation(summary = "Get all insurance")
    @GetMapping("/insurance")
    public List<Insurance> getAllInsurance() {
        return insuranceService.getAll();
    }

    @Operation(summary = "Get all medicalCenter")
    @GetMapping("/medicalCenter")
    public List<MedicalCenter> getAllMedicalCenter() {
        return medicalCenterService.getAll();
    }

}
