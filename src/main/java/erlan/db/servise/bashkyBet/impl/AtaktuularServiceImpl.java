package erlan.db.servise.bashkyBet.impl;

import erlan.db.repository.bashkyBet.AtaktuularRepository;
import erlan.db.servise.bashkyBet.AtaktuularService;
import erlan.exceptions.BadRequestException;
import erlan.model.Ataktuular;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class AtaktuularServiceImpl implements AtaktuularService {

    private AtaktuularRepository repository;

    @Override
    public Ataktuular save(Ataktuular ataktuular) {
        return repository.save(ataktuular);
    }

    @Override
    @Transactional
    public Ataktuular update(Ataktuular ataktuular, Long id) {
        Ataktuular ataktuular1 = repository.findById(id).orElseThrow(() ->
                new BadRequestException(String.format("Id = %s has not been found", id)));

        String oldText = ataktuular.getInfo();
        String newText = ataktuular1.getInfo();
        if (!oldText.equals(newText)) {
            ataktuular1.setInfo(newText);
        }
        return ataktuular1;
    }

    @Override
    public ResponseEntity<?> deleteById(Long id) {
        repository.deleteById(id);
        return ResponseEntity.ok("Delete successfully");
    }
}
