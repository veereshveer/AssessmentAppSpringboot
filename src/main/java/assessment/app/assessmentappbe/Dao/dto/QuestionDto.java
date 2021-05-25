package assessment.app.assessmentappbe.Dao.dto;

import assessment.app.assessmentappbe.Dao.model.Answer;
import assessment.app.assessmentappbe.Dao.model.Assessment;
import assessment.app.assessmentappbe.Dao.model.Options;
import assessment.app.assessmentappbe.Dao.model.QuestionType;

import java.util.List;

public class QuestionDto {
    private Integer questionId;
    private String questions;
    private Boolean mandatory;
    private Assessment assessment;
    private QuestionType questionType;
    private List<Options> options;
    private List<Answer> answer;

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }

    public Boolean getMandatory() {
        return mandatory;
    }

    public void setMandatory(Boolean mandatory) {
        this.mandatory = mandatory;
    }

    public Assessment getAssessment() {
        return assessment;
    }

    public void setAssessment(Assessment assessment) {
        this.assessment = assessment;
    }

    public QuestionType getQuestionType() {
        return questionType;
    }

    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }

    public List<Options> getOptions() {
        return options;
    }

    public void setOptions(List<Options> options) {
        this.options = options;
    }

    public List<Answer> getAnswer() {
        return answer;
    }

    public void setAnswer(List<Answer> answer) {
        this.answer = answer;
    }
}
