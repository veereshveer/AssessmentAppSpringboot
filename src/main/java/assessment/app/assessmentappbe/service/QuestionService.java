package assessment.app.assessmentappbe.service;

import assessment.app.assessmentappbe.Dao.dto.AddQuestionDto;
import assessment.app.assessmentappbe.Dao.dto.AnswerDto;
import assessment.app.assessmentappbe.Dao.dto.OptionsDto;
import assessment.app.assessmentappbe.Dao.model.*;
import assessment.app.assessmentappbe.Dao.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    private QuestionRepository questionRepository;
    @Autowired
    private AssessmentRepository assessmentRepository;
    @Autowired
    private QuestionTypeRepository questionTypeRepository;
    @Autowired
    private OptionsRepository optionsRepository;
    @Autowired
    private AnswerRepository answerRepository;

    public Question addQuestion( AddQuestionDto addQuestionDto) {
        Question addQuestion=new Question();
        addQuestion.setQuestions(addQuestionDto.getQuestions());
        addQuestion.setMandatory(addQuestionDto.getMandatory());
        Assessment assessment = assessmentRepository.findByAssessmentId(addQuestionDto.getAssessmentId());
        addQuestion.setAssessment(assessment);
        QuestionType questionType = questionTypeRepository.findByQuestionTypeId(addQuestionDto.getQuestionTypeId());
        addQuestion.setQuestionType(questionType);
        addQuestion = questionRepository.save(addQuestion);
        Integer questionId =addQuestion.getQuestionId();
        List<OptionsDto> optionsDto = addQuestionDto.getOptionsDto();
        optionsDto.forEach((option -> {
            Options options=new Options();
            options.setOptionName(option.getOptionName());
            options.setOptionValue(option.getOptionValue());
            Question question =questionRepository.findByQuestionId(questionId);
            options.setQuestion(question);
            optionsRepository.save(options);
        }));
        List<AnswerDto> answerDto = addQuestionDto.getAnswerDto();
        answerDto.forEach((ans -> {
            Answer answer=new Answer();
            answer.setAnswer(ans.getAnswer());
            Question question =questionRepository.findByQuestionId(questionId);
            answer.setQuestion(question);
            answerRepository.save(answer);
        }));
        return addQuestion;
    }

}
