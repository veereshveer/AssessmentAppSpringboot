package assessment.app.assessmentappbe.Dao.model;

import javax.persistence.*;


@Entity
@Table(name = "test")
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Test_Id")
    private Integer testId;

    @Column(name = "Link")
    private String link;

    @Column(name = "Time")
    private String time;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Test_assessment_id", referencedColumnName = "Assessment_Id")
    private Assessment assessment;

    public Integer getTestId() {
        return testId;
    }

    public void setTestId(Integer testId) {
        this.testId = testId;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Assessment getAssessment() {
        return assessment;
    }

    public void setAssessment(Assessment assessment) {
        this.assessment = assessment;
    }
}
