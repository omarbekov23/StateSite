package erlan.db.repository.bilimPeruu;

import erlan.model.entity.bilimBeruu.DrivingSchool;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrivingSchoolRepository extends JpaRepository<DrivingSchool, Long> {
}