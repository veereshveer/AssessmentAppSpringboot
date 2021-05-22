package assessment.app.assessmentappbe.Dao.model;


import javax.persistence.*;

@Entity
@Table(name = "result")
public class Result {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Result_Id")
    private Integer resultId;

    @Column(name = "Total_Marks")
    private Integer totalMarks;

    @Column(name = "Test_Id")
    private Integer testId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "res_user_id", referencedColumnName = "User_Id")
    private UserLogin userLogin;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "res_assessment_id", referencedColumnName = "Assessment_Id")
    private Assessment assessment;

    public Integer getResultId() {
        return resultId;
    }

    public void setResultId(Integer resultId) {
        this.resultId = resultId;
    }

    public Integer getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(Integer totalMarks) {
        this.totalMarks = totalMarks;
    }

    public Integer getTestId() {
        return testId;
    }

    public void setTestId(Integer testId) {
        this.testId = testId;
    }

    public UserLogin getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(UserLogin userLogin) {
        this.userLogin = userLogin;
    }

    public Assessment getAssessment() {
        return assessment;
    }

    public void setAssessment(Assessment assessment) {
        this.assessment = assessment;
    }
}
