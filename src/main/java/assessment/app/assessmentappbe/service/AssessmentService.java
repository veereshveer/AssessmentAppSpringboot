package assessment.app.assessmentappbe.service;

import assessment.app.assessmentappbe.Dao.dto.AssessmentDto;
import assessment.app.assessmentappbe.Dao.model.Assessment;
import assessment.app.assessmentappbe.Dao.repository.AssessmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AssessmentService {


    @Autowired
    private AssessmentRepository assessmentRepository;


    public List<Assessment> findAllAssessment() {
       return assessmentRepository.findAll();
    }

    public Assessment findAssessment(Integer id) {
        return assessmentRepository.findByAssessmentId(id);
    }

    public Assessment addAssessment(Assessment assessment){
        return assessmentRepository.save(assessment);
    }

    public Assessment updatedAssessment(AssessmentDto assessmentDto){
        Assessment assessment = assessmentRepository.findByAssessmentId(assessmentDto.getAssessmentId());
        assessment.setAssessmentName(assessmentDto.getAssessmentName());
        assessment.setActive(assessmentDto.getActive());
        Assessment assessments = assessmentRepository.save(assessment);
        return assessments;
    }

    @Transactional
    public void deleteAssessmentById(Integer id){
        assessmentRepository.deleteByAssessmentId(id);
    }

}
