package erlan.db.repository.salamattykSaktoo;

import erlan.model.entity.salamattykSaktoo.DoctorsAdvice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorsAdviceRepository extends JpaRepository<DoctorsAdvice, Long> {
}