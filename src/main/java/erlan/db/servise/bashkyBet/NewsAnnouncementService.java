package erlan.db.servise.bashkyBet;

import erlan.model.NewsAnnouncement;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface NewsAnnouncementService {
    NewsAnnouncement saveNewsAnnouncement(NewsAnnouncement newsAnnouncement);

    NewsAnnouncement update(NewsAnnouncement newsAnnouncement, Long id);

    ResponseEntity<?> deleteById(Long id);

    List<NewsAnnouncement> getAll();
}
