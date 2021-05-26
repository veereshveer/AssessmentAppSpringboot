package assessment.app.assessmentappbe.controller;
import assessment.app.assessmentappbe.Dao.dto.AssessmentDto;
import assessment.app.assessmentappbe.Dao.dto.TestDto;
import assessment.app.assessmentappbe.Dao.model.Test;
import assessment.app.assessmentappbe.service.AssessmentService;
import assessment.app.assessmentappbe.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    private TestService testService;

    @Autowired
    private AssessmentService assessmentService;

    public TestController(TestService testService, AssessmentService assessmentService) {
        this.testService = testService;
        this.assessmentService = assessmentService;
    }

    @GetMapping(path = "/{id}")
    public EntityModel<Link> findAssessmentById(@PathVariable("id") Integer id) {
        Link link = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(UserTestController.class).findAssessmentById(id)).withSelfRel();
        return EntityModel.of(link);
    }

    @PostMapping(path = "/")
    public ResponseEntity<TestDto> addTestDetails(@RequestBody TestDto test){
        TestDto testDto = testService.addTestDetails(test);
        return new ResponseEntity<>(testDto, HttpStatus.OK);
    }
}
