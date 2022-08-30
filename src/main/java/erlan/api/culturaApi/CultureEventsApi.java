package erlan.api.culturaApi;

import erlan.db.servise.kultura.CultureEventsService;
import erlan.model.entity.Kultura.CultureEvents;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/culture/cultureEvents")
@AllArgsConstructor
@PreAuthorize("hasAnyRole('ROLE_ADMIN')")
@Tag(name = "Cultura CultureEvents", description = "crud operations")
public class CultureEventsApi {

    private CultureEventsService cultureEventsService;

    @Operation(summary = "Save CultureEvents by id ")
    @PostMapping("/save")
    public CultureEvents saveCultureEventsService(@RequestBody CultureEvents cultureEvents) {
        return cultureEventsService.saveCultureEvents(cultureEvents);
    }

    @Operation(summary = "Update CultureEvents by id")
    @PatchMapping("/{id}")
    public CultureEvents update(@RequestBody CultureEvents cultureEvents,@PathVariable Long id) {
        return cultureEventsService.update(cultureEvents,id);
    }

    @Operation(summary = "Delete BEEvent by id")
    @DeleteMapping("/{id}")
    public ResponseEntity<?> saveCultureEventsService(@PathVariable Long id) {
        return cultureEventsService.deleteById(id);
    }
}
