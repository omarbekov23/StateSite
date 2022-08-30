package erlan.db.repository.bilimPeruu;

import erlan.model.entity.bilimBeruu.Schools;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolsRepository extends JpaRepository<Schools, Long> {
}