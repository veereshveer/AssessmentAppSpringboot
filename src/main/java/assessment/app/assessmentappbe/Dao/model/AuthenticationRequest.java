package assessment.app.assessmentappbe.Dao.model;

public class AuthenticationRequest {

    private String adminEmail;
    private String adminPassword;

    public AuthenticationRequest() {
    }

    public AuthenticationRequest(String adminEmail, String adminPassword) {
        this.adminEmail = adminEmail;
        this.adminPassword = adminPassword;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    @Override
    public String toString() {
        return "AuthenticationRequest{" +
                "adminEmail='" + adminEmail + '\'' +
                ", adminPassword='" + adminPassword + '\'' +
                '}';
    }
}
