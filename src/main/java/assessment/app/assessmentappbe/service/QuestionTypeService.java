package assessment.app.assessmentappbe.service;

import assessment.app.assessmentappbe.Dao.model.QuestionType;
import assessment.app.assessmentappbe.Dao.repository.QuestionTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionTypeService {

    @Autowired
    private QuestionTypeRepository questionTypeRepository;

    public List<QuestionType> findAllQuestionType() {
        return  questionTypeRepository.findAll();
    }

}
