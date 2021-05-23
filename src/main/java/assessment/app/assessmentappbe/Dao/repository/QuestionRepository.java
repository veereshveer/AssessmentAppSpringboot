package assessment.app.assessmentappbe.Dao.repository;

import assessment.app.assessmentappbe.Dao.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
    Question findByQuestionId(Integer id);
}
