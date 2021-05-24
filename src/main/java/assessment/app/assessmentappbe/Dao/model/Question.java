package assessment.app.assessmentappbe.Dao.model;

import javax.persistence.*;

@Entity
@Table(name = "question")
public class Question implements Cloneable {

        @Id
        @SequenceGenerator(name = "questionIdGen", initialValue = 1)
        @GeneratedValue(generator = "questionIdGen")
        @Column(name = "Question_Id")
        private Integer questionId;

        @Column(name = "Questions")
        private String questions;

        @Column(name = "Mandatory")
        private Boolean mandatory;

        @ManyToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "ques_assessment_id", referencedColumnName = "Assessment_Id")
        private Assessment assessment;

        @ManyToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "ques_question_type_id", referencedColumnName = "Question_type_id")
        private QuestionType questionType;


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

        @Override
        public Object clone() throws CloneNotSupportedException{
                return super.clone();
        }
}
