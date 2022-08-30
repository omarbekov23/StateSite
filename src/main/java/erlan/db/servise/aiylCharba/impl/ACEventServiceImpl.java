package erlan.db.servise.aiylCharba.impl;

import erlan.db.repository.aiylCharba.ACEventRepository;
import erlan.exceptions.BadRequestException;
import erlan.model.entity.aiylCharba.ACEvent;
import erlan.db.servise.aiylCharba.ACEventService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class ACEventServiceImpl implements ACEventService {

    private ACEventRepository acEventRepository;

    @Override
    public ACEvent saveAsEvent(ACEvent acEvent) {
        return acEventRepository.save(acEvent);
    }

    @Override
    @Transactional
    public ACEvent update(ACEvent acEvent,Long id) {
        ACEvent acEvent1 = acEventRepository.findById(id).orElseThrow(() ->
                new BadRequestException(String.format("User with id %s has not been found", id)));

        String oldText = acEvent1.getText();
        String newText = acEvent.getText();
        if (!oldText.equals(newText)) {
            acEvent1.setText(newText);
        }
        return acEvent1;
    }

    @Override
    public ResponseEntity<?> deleteById(Long id) {
         acEventRepository.deleteById(id);
         return ResponseEntity.ok("Delete successfully");
    }

    @Override
    public List<ACEvent> getAll() {
        return acEventRepository.findAll();
    }
}
