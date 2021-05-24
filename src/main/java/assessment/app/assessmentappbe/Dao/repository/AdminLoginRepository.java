package assessment.app.assessmentappbe.Dao.repository;

import assessment.app.assessmentappbe.Dao.model.AdminLogin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminLoginRepository extends JpaRepository<AdminLogin, Long> {
    public AdminLogin findByEmailId(String email);
}
