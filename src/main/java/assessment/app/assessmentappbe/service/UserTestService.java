package assessment.app.assessmentappbe.service;

import assessment.app.assessmentappbe.Dao.dto.UserLoginDto;
import assessment.app.assessmentappbe.Dao.model.UserLogin;
import assessment.app.assessmentappbe.Dao.repository.UserTestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@Service
public class UserTestService {
    @Autowired
    private UserTestRepository userTestRepository;

    public Boolean addUser(UserLoginDto userLoginDto) throws UnknownHostException {
        String ipAddress = InetAddress.getLocalHost().getHostAddress();
        AtomicReference<Integer> userExist= new AtomicReference<>(0);
        List<UserLogin> emailData = userTestRepository.findByEmailId(userLoginDto.getEmailId());
        emailData.forEach((userIp -> {
            if (ipAddress.equals(userIp.getSystemIp())){
                userExist.set(1);
            }
        }));
        if(userExist.get().equals(1)) {
            return false;
        }
        UserLogin userLogin = new UserLogin();
        userLogin.setUsername(userLoginDto.getUsername());
        userLogin.setEmailId(userLoginDto.getEmailId());
        userLogin.setPhoneNumber(userLoginDto.getPhoneNumber());
        userLogin.setSystemIp(ipAddress);
        userTestRepository.save(userLogin);
        return true;
    }
}
