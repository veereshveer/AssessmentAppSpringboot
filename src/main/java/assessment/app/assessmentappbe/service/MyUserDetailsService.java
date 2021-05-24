package assessment.app.assessmentappbe.service;

import assessment.app.assessmentappbe.Dao.model.AdminLogin;
import assessment.app.assessmentappbe.Dao.model.CustomeAdminDetails;
import assessment.app.assessmentappbe.Dao.repository.AdminLoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    private AdminLoginRepository adminLoginRepository;

    @Override
    public UserDetails loadUserByUsername(String adminEmail) throws UsernameNotFoundException {
        AdminLogin adminLogin = this.adminLoginRepository.findByEmailId(adminEmail);
        if(adminLogin==null)
        {
            throw new UsernameNotFoundException("Admin Not Found");
        }
        {
            return new CustomeAdminDetails(adminLogin);
        }
        //        return new User("foo", "foo",
        //          new ArrayList<>());
    }
}