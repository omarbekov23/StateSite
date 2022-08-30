package erlan.db.servise.salamattykdySaktoo.impl;

import erlan.exceptions.BadRequestException;
import erlan.model.entity.salamattykSaktoo.DoctorsAdvice;
import erlan.db.repository.salamattykSaktoo.DoctorsAdviceRepository;
import erlan.db.servise.salamattykdySaktoo.DoctorsAdviceService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class DoctorsAdviceServiceImpl implements DoctorsAdviceService {

    private DoctorsAdviceRepository repository;

    @Override
    public DoctorsAdvice saveDoctorsAdvice(DoctorsAdvice doctorsAdvice) {
        return repository.save(doctorsAdvice);
    }

    @Override
    @Transactional
    public DoctorsAdvice update(DoctorsAdvice doctorsAdvice, Long id) {
        DoctorsAdvice circles1 = repository.findById(id).orElseThrow(() ->
                new BadRequestException(String.format("Id = %s has not been found", id)));

        String oldText = circles1.getText();
        String newText = doctorsAdvice.getText();
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
    public List<DoctorsAdvice> getAll() {
        return repository.findAll();
    }
}
