package assessment.app.assessmentappbe.controller;

import assessment.app.assessmentappbe.Dao.dto.AddQuestionDto;
import assessment.app.assessmentappbe.Dao.dto.TestDto;
import assessment.app.assessmentappbe.Dao.dto.UserLoginDto;
import assessment.app.assessmentappbe.Dao.model.Question;
import assessment.app.assessmentappbe.service.TestService;
import assessment.app.assessmentappbe.service.UserTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.UnknownHostException;

@RestController
@RequestMapping(path = "userTest")
public class UserTestController {

    @Autowired
    private UserTestService userTestService;
    @Autowired
    private TestService testService;

    public UserTestController(TestService testService) {
        this.testService = testService;
    }


    @GetMapping(path = "/")
    public ResponseEntity<TestDto> findAssessmentById(Integer id){
        TestDto testDto = testService.findAssessmentById(id);
        return new ResponseEntity<>(testDto, HttpStatus.OK);
    }
    @PostMapping(path = "/")
    public ResponseEntity<Boolean> addUserLogin(@RequestBody UserLoginDto userLoginDto) throws UnknownHostException {
        Boolean userLogin=  userTestService.addUser(userLoginDto);
        return new ResponseEntity(userLogin, HttpStatus.CREATED);
    }

}
