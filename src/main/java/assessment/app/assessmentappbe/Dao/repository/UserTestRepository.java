package assessment.app.assessmentappbe.Dao.repository;

import assessment.app.assessmentappbe.Dao.model.UserLogin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserTestRepository extends JpaRepository<UserLogin, Integer> {

    List<UserLogin> findByEmailId(String emailId);
}
