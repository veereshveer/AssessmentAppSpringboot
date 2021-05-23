package assessment.app.assessmentappbe.Dao.repository;

import assessment.app.assessmentappbe.Dao.model.QuestionType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionTypeRepository extends JpaRepository<QuestionType, Integer> {

    QuestionType findByQuestionTypeId(Integer questionTypeId);
}
