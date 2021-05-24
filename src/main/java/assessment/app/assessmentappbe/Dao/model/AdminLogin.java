package assessment.app.assessmentappbe.Dao.model;

import javax.persistence.*;


@Entity
@Table(name = "adminLogin")
public class AdminLogin {

    @Id
    @SequenceGenerator(name = "adminIdGen", initialValue = 1)
    @GeneratedValue(generator = "adminIdGen")
    @Column(name = "Admin_Id")
    private Integer adminId;

    @Column(name = "Email_id")
    private String emailId;

    @Column(name = "Password")
    private String password;

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
