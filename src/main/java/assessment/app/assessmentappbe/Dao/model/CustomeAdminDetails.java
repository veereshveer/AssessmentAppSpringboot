package assessment.app.assessmentappbe.Dao.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CustomeAdminDetails implements UserDetails {

    private AdminLogin adminLogin;

    public CustomeAdminDetails(AdminLogin adminLogin) {
        this.adminLogin = adminLogin;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        SimpleGrantedAuthority simpleGrantedAuthority = new SimpleGrantedAuthority(adminLogin.getAdminRole());
        List l = new ArrayList();
        l.add(simpleGrantedAuthority);
        return l;
    }

    @Override
    public String getPassword() {
        return adminLogin.getPassword();
    }

    @Override
    public String getUsername() {
        return adminLogin.getEmailId();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
