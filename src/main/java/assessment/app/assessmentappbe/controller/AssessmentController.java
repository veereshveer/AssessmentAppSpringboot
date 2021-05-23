package assessment.app.assessmentappbe.controller;

import assessment.app.assessmentappbe.Dao.dto.AssessmentDto;
import assessment.app.assessmentappbe.Dao.model.Assessment;
import assessment.app.assessmentappbe.service.AssessmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "assessment")
public class AssessmentController {

        @Autowired
        private AssessmentService assessmentService;

        @GetMapping(path = "/")
        public ResponseEntity<List<Assessment>> findAssessment(){
            List<Assessment> findAllAssessments= assessmentService.findAllAssessment();
            return new ResponseEntity<>(findAllAssessments, HttpStatus.OK);
        }

        @PostMapping(path = "/")
        public ResponseEntity<Assessment> addAssessment(@RequestBody Assessment assessment){
            Assessment addAssessment= assessmentService.addAssessment(assessment);
            return new ResponseEntity<>(addAssessment, HttpStatus.CREATED);
        }

        @PutMapping(path = "/{id}")
        public ResponseEntity<AssessmentDto> updateAssessment(@RequestBody AssessmentDto assessment){
            AssessmentDto updatedAssessment= assessmentService.updatedAssessment(assessment);
            return new ResponseEntity<>(updatedAssessment, HttpStatus.CREATED);
        }

        @DeleteMapping(path = "/{id}")
        public ResponseEntity<?> deleteAssessmentById(@PathVariable("id") Integer id){
            assessmentService.deleteAssessmentById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }

}
