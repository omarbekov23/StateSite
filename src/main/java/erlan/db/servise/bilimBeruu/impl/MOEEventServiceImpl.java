package erlan.db.servise.bilimBeruu.impl;

import erlan.db.repository.bilimPeruu.MOEEventRepository;
import erlan.exceptions.BadRequestException;
import erlan.model.entity.bilimBeruu.MOEEvent;
import erlan.db.servise.bilimBeruu.MOEEventService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class MOEEventServiceImpl implements MOEEventService {

    private MOEEventRepository moeEventRepository;

    @Override
    public MOEEvent saveEvent(MOEEvent event) {
        return moeEventRepository.save(event);
    }

    @Override
    @Transactional
    public MOEEvent update(MOEEvent event, Long id) {
        MOEEvent moeEvent = moeEventRepository.findById(id).orElseThrow(() ->
                new BadRequestException(String.format("User with id %s has not been found", id)));

        String oldText = moeEvent.getText();
        String newText = event.getText();
        if (!oldText.equals(newText)) {
            moeEvent.setText(newText);
        }
        return moeEvent;
    }
    @Override
    public ResponseEntity<?> deleteById(Long id) {
        moeEventRepository.deleteById(id);
        return ResponseEntity.ok("Delete successfully");
    }

    @Override
    public List<MOEEvent> getAll() {
        return moeEventRepository.findAll();
    }
}
