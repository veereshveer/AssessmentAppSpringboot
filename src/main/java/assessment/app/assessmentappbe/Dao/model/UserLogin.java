package assessment.app.assessmentappbe.Dao.model;


import javax.persistence.*;

@Entity
@Table(name = "userLogin")
public class UserLogin {

    @Id
    @SequenceGenerator(name = "userLoginGen", initialValue = 1)
    @GeneratedValue(generator = "userLoginGen")
    @Column(name = "User_Id")
    private Integer userId;

    @Column(name = "Username")
    private String username;

    @Column(name = "Email_id")
    private String emailId;

    @Column(name = "Phone_Number")
    private Integer phoneNumber;

    @Column(name = "System_IP")
    private String systemIp;

    @Column(name = "Log_In")
    private String logIn;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSystemIp() {
        return systemIp;
    }

    public void setSystemIp(String systemIp) {
        this.systemIp = systemIp;
    }

    public String getLogIn() {
        return logIn;
    }

    public void setLogIn(String logIn) {
        this.logIn = logIn;
    }
}
