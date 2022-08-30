package erlan.db.servise.kultura.Impl;

import erlan.db.repository.kultura.MuseumsRepository;
import erlan.exceptions.BadRequestException;
import erlan.model.entity.Kultura.Museums;
import erlan.db.servise.kultura.MuseumsService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class MuseumsServiceImpl implements MuseumsService {

    private MuseumsRepository repository;

    @Override
    public Museums saveMuseums(Museums museums) {
        return repository.save(museums);
    }

    @Override
    @Transactional
    public Museums update(Museums museums, Long id) {
        Museums circles1 = repository.findById(id).orElseThrow(() ->
                new BadRequestException(String.format("Id = %s has not been found", id)));

        String oldText = circles1.getText();
        String newText = museums.getText();
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
    public List<Museums> getAll() {
        return repository.findAll();
    }
}
