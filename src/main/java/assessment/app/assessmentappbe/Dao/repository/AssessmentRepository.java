package assessment.app.assessmentappbe.Dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import assessment.app.assessmentappbe.Dao.model.Assessment;

public interface AssessmentRepository extends JpaRepository<Assessment, Integer> {

    Assessment findByAssessmentId(Integer assessmentId);

    void deleteByAssessmentId(Integer id);
}
