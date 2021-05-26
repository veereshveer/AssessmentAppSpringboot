package assessment.app.assessmentappbe.service;
import assessment.app.assessmentappbe.dto.TestDto;
import assessment.app.assessmentappbe.mapper.AssessmentMapper;
import assessment.app.assessmentappbe.mapper.TestMapper;
import assessment.app.assessmentappbe.model.Assessment;
import assessment.app.assessmentappbe.model.Test;
import assessment.app.assessmentappbe.repository.AssessmentRepository;
import assessment.app.assessmentappbe.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private TestRepository testRepository;

    @Autowired
    private TestMapper testMapper;

    @Autowired
    private AssessmentMapper assessmentMapper;

    @Autowired
    private AssessmentRepository assessmentRepository;

    public TestService(TestRepository testRepository, TestMapper testMapper) {
        this.testRepository = testRepository;
        this.testMapper = testMapper;
    }

    public TestDto addTestDetails(TestDto test) {
        Test addTest = new Test();
        addTest.setTime(test.getTime());
        Assessment assessment = assessmentRepository.findByAssessmentId(test.getAssessmentId());
        addTest.setAssessment(assessment);
        addTest.setLink(test.getLink());
        testRepository.save(addTest);
        return testMapper.map(addTest);
    }

    public TestDto findAssessmentById(Integer id) {
        return null;
    }

}
