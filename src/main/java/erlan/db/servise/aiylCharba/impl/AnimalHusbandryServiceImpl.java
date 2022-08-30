package erlan.db.servise.aiylCharba.impl;

import erlan.db.repository.aiylCharba.AnimalHusbandryRepository;
import erlan.db.servise.aiylCharba.AnimalHusbandryService;
import erlan.exceptions.BadRequestException;
import erlan.model.entity.aiylCharba.AnimalHusbandry;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class AnimalHusbandryServiceImpl implements AnimalHusbandryService {

    private AnimalHusbandryRepository animalHusbandryRepository;

    @Override
    public AnimalHusbandry saveAsEvent(AnimalHusbandry animalHusbandry) {
        return animalHusbandryRepository.save(animalHusbandry);
    }

    @Override
    @Transactional
    public AnimalHusbandry update(AnimalHusbandry animalHusbandry, Long id) {
        AnimalHusbandry animal = animalHusbandryRepository.findById(id).orElseThrow(() ->
                new BadRequestException(String.format("User with id %s has not been found", id)));

        String oldText = animal.getText();
        String newText = animalHusbandry.getText();
        if (!oldText.equals(newText)) {
            animal.setText(newText);
        }
        return animal;
    }

    @Override
    public ResponseEntity<?> deleteById(Long id) {
        animalHusbandryRepository.deleteById(id);
        return ResponseEntity.ok("Delete successfully");
    }

    @Override
    public List<AnimalHusbandry> getAll() {
        return animalHusbandryRepository.findAll();
    }
}
