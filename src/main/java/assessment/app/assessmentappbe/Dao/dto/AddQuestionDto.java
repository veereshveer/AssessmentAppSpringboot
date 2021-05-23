package assessment.app.assessmentappbe.Dao.dto;


import java.util.List;


public class AddQuestionDto {
    private Integer assessmentId;
    private Integer questionId;
    private String questions;
    private Boolean mandatory;
    private Integer questionTypeId;
    private List<AnswerDto> answerDto;
    private List<OptionsDto> optionsDto;

    public Integer getAssessmentId() {
        return assessmentId;
    }

    public void setAssessmentId(Integer assessmentId) {
        this.assessmentId = assessmentId;
    }

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

    public Integer getQuestionTypeId() {
        return questionTypeId;
    }

    public void setQuestionTypeId(Integer questionTypeId) {
        this.questionTypeId = questionTypeId;
    }

    public List<AnswerDto> getAnswerDto() {
        return answerDto;
    }

    public void setAnswerDto(List<AnswerDto> answerDto) {
        this.answerDto = answerDto;
    }

    public List<OptionsDto> getOptionsDto() {
        return optionsDto;
    }

    public void setOptionsDto(List<OptionsDto> optionsDto) {
        this.optionsDto = optionsDto;
    }
}
