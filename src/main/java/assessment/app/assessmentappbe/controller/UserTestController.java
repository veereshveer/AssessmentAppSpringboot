package assessment.app.assessmentappbe.controller;

import assessment.app.assessmentappbe.Dao.dto.TestDto;
import assessment.app.assessmentappbe.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/userTest")
public class UserTestController {


    @Autowired
    private TestService testService;

    public UserTestController(TestService testService) {
        this.testService = testService;
    }


    @PostMapping(path = "/")
    public ResponseEntity<TestDto> findAssessmentById(Integer id){
        TestDto testDto = testService.findAssessmentById(id);
        return new ResponseEntity<>(testDto, HttpStatus.OK);
    }
}
