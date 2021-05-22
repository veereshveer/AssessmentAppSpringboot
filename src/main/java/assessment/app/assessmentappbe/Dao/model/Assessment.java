package assessment.app.assessmentappbe.model;
import javax.persistence.*;

@Entity
@Table(name = "assessment")
public class Assessment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Assessment_Id")
    private Integer assessmentId;

    @Column(name = "Assessment_Name")
    private String assessmentName;

    @Column(name = "Created_Date")
    private String createdDate;

    @Column(name = "Active")
    private String active;

    public Integer getAssessmentId() {
        return assessmentId;
    }

    public void setAssessmentId(Integer assessmentId) {
        this.assessmentId = assessmentId;
    }

    public String getAssessmentName() {
        return assessmentName;
    }

    public void setAssessmentName(String assessmentName) {
        this.assessmentName = assessmentName;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }
}
