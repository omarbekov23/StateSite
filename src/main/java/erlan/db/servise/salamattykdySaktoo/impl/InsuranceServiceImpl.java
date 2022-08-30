package erlan.db.servise.salamattykdySaktoo.impl;

import erlan.exceptions.BadRequestException;
import erlan.model.entity.salamattykSaktoo.Insurance;
import erlan.db.repository.salamattykSaktoo.InsuranceRepository;
import erlan.db.servise.salamattykdySaktoo.InsuranceService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class InsuranceServiceImpl implements InsuranceService {

    private InsuranceRepository repository;

    @Override
    public Insurance saveInsurance(Insurance insurance) {
        return repository.save(insurance);
    }

    @Override
    @Transactional
    public Insurance update(Insurance insurance, Long id) {
        Insurance circles1 = repository.findById(id).orElseThrow(() ->
                new BadRequestException(String.format("Id = %s has not been found", id)));

        String oldText = circles1.getText();
        String newText = insurance.getText();
        if (!oldText.equals(newText)) {
            circles1.setText(newText);
        }
        return circles1;
    }
    @Override
    public ResponseEntity<?> deleteById(Long id) {
        repository.deleteById(id);
        return ResponseEntity.ok("Delete successfully");
    }

    @Override
    public List<Insurance> getAll() {
        return repository.findAll();
    }
}
