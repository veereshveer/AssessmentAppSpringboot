package assessment.app.assessmentappbe.Dao.dto;

import com.sun.istack.NotNull;

public class AssessmentDto {
    @NotNull
    private Integer assessmentId;
    private String assessmentName;
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

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }
}
