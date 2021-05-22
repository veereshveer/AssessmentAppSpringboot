package assessment.app.assessmentappbe.Dao.model;

import javax.persistence.*;

@Entity
@Table(name = "questionType")
public class QuestionType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Question_type_id")
    private Integer questionTypeId;

    @Column(name = "Question_Type")
    private String questionType;

    public Integer getQuestionTypeId() {
        return questionTypeId;
    }

    public void setQuestionTypeId(Integer questionTypeId) {
        this.questionTypeId = questionTypeId;
    }

    public String getQuestionType() {
        return questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }
}
