package assessment.app.assessmentappbe.dto;

import sun.plugin.javascript.navig.Link;

import javax.validation.constraints.NotNull;

public class TestDto {

    @NotNull
    private Integer testId;
    private String link;
    private String time;
    private Integer assessmentId;

    public Integer getAssessmentId() {
        return assessmentId;
    }

    public void setAssessmentId(Integer assessmentId) {
        this.assessmentId = assessmentId;
    }

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
}
