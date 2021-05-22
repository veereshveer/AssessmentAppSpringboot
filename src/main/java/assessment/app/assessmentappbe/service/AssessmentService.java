package assessment.app.assessmentappbe.service;

import assessment.app.assessmentappbe.Dao.dto.AssessmentDto;
import assessment.app.assessmentappbe.Dao.mapper.AssessmentMapper;
import assessment.app.assessmentappbe.Dao.model.Assessment;
import assessment.app.assessmentappbe.Dao.repository.AssessmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssessmentService {

    private AssessmentMapper assessmentMapper;

    @Autowired
    private AssessmentRepository assessmentRepository;
    public AssessmentService(AssessmentRepository assessmentRepository){
        this.assessmentRepository = assessmentRepository;
    }

    public List<Assessment> findAllAssessment() {
       return assessmentRepository.findAll();
//        return assessmentMapper.map(assessments);
    }

    public Assessment addAssessment(Assessment assessment){
        return assessmentRepository.save(assessment);
    }

    public AssessmentDto updatedAssessment(AssessmentDto assessmentDto){
        Assessment assessment = assessmentRepository.findByAssessmentId(assessmentDto.getAssessmentId());
        assessment.setAssessmentName(assessmentDto.getAssessmentName());
        assessment.setActive(assessmentDto.getActive());
        Assessment assessments = assessmentRepository.save(assessment);
        return assessmentMapper.map(assessments);
    }

    public void deleteAssessmentById(Integer id){
        assessmentRepository.deleteByAssessmentId(id);
    }

}
