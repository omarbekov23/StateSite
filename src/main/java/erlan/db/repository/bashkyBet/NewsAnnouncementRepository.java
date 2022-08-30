package erlan.db.repository.bashkyBet;

import erlan.model.NewsAnnouncement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsAnnouncementRepository extends JpaRepository<NewsAnnouncement, Long> {
}