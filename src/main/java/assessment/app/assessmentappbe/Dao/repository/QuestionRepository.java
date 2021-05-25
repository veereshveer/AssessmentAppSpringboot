package assessment.app.assessmentappbe.Dao.repository;

import assessment.app.assessmentappbe.Dao.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Integer> {

    Question findByQuestionId(Integer id);

    List<Question> findByAssessmentAssessmentId(Integer id);

    void deleteByQuestionId(Integer id);
}
