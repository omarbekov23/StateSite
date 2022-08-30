package erlan.db.servise.aiylCharba.impl;

import erlan.db.repository.aiylCharba.GrainGrowingRepository;
import erlan.exceptions.BadRequestException;
import erlan.model.entity.aiylCharba.GrainGrowing;
import erlan.db.servise.aiylCharba.GrainGrowingService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class GrainGrowingServiceImpl implements GrainGrowingService{

    private GrainGrowingRepository grainGrowingRepository;

    @Override
    public GrainGrowing saveGrainGraving(GrainGrowing grainGrowing) {
        return grainGrowingRepository.save(grainGrowing);
    }

    @Override
    @Transactional
    public GrainGrowing update(GrainGrowing grainGrowing, Long id) {
        GrainGrowing grainGrowing1 = grainGrowingRepository.findById(id).orElseThrow(() ->
                new BadRequestException(String.format("User with id %s has not been found", id)));

        String oldText = grainGrowing1.getText();
        String newText = grainGrowing.getText();
        if (!oldText.equals(newText)) {
            grainGrowing1.setText(newText);
        }
        return grainGrowing1;
    }

    @Override
    public ResponseEntity<?> deleteById(Long id) {
        grainGrowingRepository.deleteById(id);
        return ResponseEntity.ok("Delete successfully");
    }

    @Override
    public List<GrainGrowing> getAll() {
        return grainGrowingRepository.findAll();
    }
}
