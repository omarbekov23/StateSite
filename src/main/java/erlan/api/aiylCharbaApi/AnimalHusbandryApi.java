package erlan.api.aiylCharbaApi;

import erlan.db.servise.aiylCharba.AnimalHusbandryService;
import erlan.model.entity.aiylCharba.AnimalHusbandry;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/agriculture/animalHusbandry")
@AllArgsConstructor
@PreAuthorize("hasAnyRole('ROLE_ADMIN')")
@Tag(name = "AiylCharba AnimalHusbandry", description = "crud operations")
public class AnimalHusbandryApi {

    private AnimalHusbandryService animalHusbandryService;

    @Operation(summary = "Save AnimalHusbandry by id ")
    @PostMapping("/save")
    public AnimalHusbandry saveAnimalHusbandryService(@RequestBody AnimalHusbandry animalHusbandry) {
        return animalHusbandryService.saveAsEvent(animalHusbandry);
    }

    @Operation(summary = "Update ACEvent by id")
    @PatchMapping("/{id}")
    public AnimalHusbandry update(@RequestBody AnimalHusbandry animalHusbandry, @PathVariable Long id) {
        return animalHusbandryService.update(animalHusbandry,id);
    }

    @Operation(summary = "Delete ACEvent by id")
    @DeleteMapping("/{id}")
    public ResponseEntity<?> saveAnimalHusbandryService(@PathVariable Long id) {
        return animalHusbandryService.deleteById(id);
    }

}
