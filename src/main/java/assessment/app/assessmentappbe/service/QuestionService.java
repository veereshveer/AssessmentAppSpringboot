package assessment.app.assessmentappbe.service;

import assessment.app.assessmentappbe.Dao.dto.AddQuestionDto;
import assessment.app.assessmentappbe.Dao.dto.AnswerDto;
import assessment.app.assessmentappbe.Dao.dto.OptionsDto;
import assessment.app.assessmentappbe.Dao.dto.QuestionDto;
import assessment.app.assessmentappbe.Dao.mapper.AddQuestionMapper;
import assessment.app.assessmentappbe.Dao.mapper.QuestionDtoMapper;
import assessment.app.assessmentappbe.Dao.model.*;
import assessment.app.assessmentappbe.Dao.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    @Autowired
    private AddQuestionMapper addQuestionMapper;
    @Autowired
    private QuestionDtoMapper questionDtoMapper;

    public List<QuestionDto> getListQuestion(Integer id){
        List<Question> question = questionRepository.findByAssessmentAssessmentId(id);
        return questionDtoMapper.map(question);
    }
    public Question getQuestion(Integer id){
        Question question = questionRepository.findByQuestionId(id);
        return question;
    }

    public Question addQuestion( AddQuestionDto addQuestionDto) {
        Question addQuestion = new Question();
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
            Options options = new Options();
            options.setOptionName(option.getOptionName());
            options.setOptionValue(option.getOptionValue());
            Question question = questionRepository.findByQuestionId(questionId);
            options.setQuestion(question);
            optionsRepository.save(options);
        }));
        List<AnswerDto> answerDto = addQuestionDto.getAnswerDto();
        answerDto.forEach((ans -> {
            Answer answer = new Answer();
            answer.setAnswer(ans.getAnswer());
            Question question = questionRepository.findByQuestionId(questionId);
            answer.setQuestion(question);
            answerRepository.save(answer);
        }));
        return addQuestion;
    }

    public Question updateQuestion(Integer id, AddQuestionDto addQuestionDto) {
        Question updateQuestion = questionRepository.findByQuestionId(id);
        updateQuestion.setQuestions(addQuestionDto.getQuestions());
        updateQuestion.setMandatory(addQuestionDto.getMandatory());
        QuestionType questionType = questionTypeRepository.findByQuestionTypeId(addQuestionDto.getQuestionTypeId());
        updateQuestion.setQuestionType(questionType);
        updateQuestion = questionRepository.save(updateQuestion);
        List<OptionsDto> optionsDto = addQuestionDto.getOptionsDto();
        optionsDto.forEach((option -> {
            Options options=optionsRepository.findByOptionId(option.getOptionId());
            options.setOptionName(option.getOptionName());
            options.setOptionValue(option.getOptionValue());
            optionsRepository.save(options);
        }));
        List<AnswerDto> answerDto = addQuestionDto.getAnswerDto();
        answerDto.forEach((ans -> {
            Answer answer=answerRepository.findByAnswerId(ans.getAnswerId());
            answer.setAnswer(ans.getAnswer());
            answerRepository.save(answer);
        }));
        return updateQuestion;
    }

    @Transactional
    public void deleteQuestionById(Integer id) {
      questionRepository.deleteByQuestionId(id);
    }
}
