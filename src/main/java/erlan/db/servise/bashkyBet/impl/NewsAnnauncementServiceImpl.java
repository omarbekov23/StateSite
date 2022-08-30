package erlan.db.servise.bashkyBet.impl;

import erlan.db.repository.bashkyBet.NewsAnnouncementRepository;
import erlan.db.servise.bashkyBet.NewsAnnouncementService;
import erlan.exceptions.BadRequestException;
import erlan.model.NewsAnnouncement;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class NewsAnnauncementServiceImpl implements NewsAnnouncementService {

    private NewsAnnouncementRepository repository;

    @Override
    public NewsAnnouncement saveNewsAnnouncement(NewsAnnouncement newsAnnouncement) {
        return repository.save(newsAnnouncement);
    }

    @Override
    @Transactional
    public NewsAnnouncement update(NewsAnnouncement newsAnnouncement, Long id) {
        NewsAnnouncement newsAnnouncement1 = repository.findById(id).orElseThrow(() ->
                new BadRequestException(String.format("Id = %s has not been found", id)));

        String oldText = newsAnnouncement.getText();
        String newText = newsAnnouncement1.getText();
        if (!oldText.equals(newText)) {
            newsAnnouncement1.setText(newText);
        }
        return newsAnnouncement1;
    }

    @Override
    public ResponseEntity<?> deleteById(Long id) {
        repository.deleteById(id);
        return ResponseEntity.ok("Delete successfully");
    }

    @Override
    public List<NewsAnnouncement> getAll() {
        return repository.findAll();
    }
}
