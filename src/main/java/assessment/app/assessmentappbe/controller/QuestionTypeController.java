package assessment.app.assessmentappbe.controller;

import assessment.app.assessmentappbe.Dao.dto.AssessmentDto;
import assessment.app.assessmentappbe.Dao.model.QuestionType;
import assessment.app.assessmentappbe.service.QuestionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "questionType")
public class QuestionTypeController {

    @Autowired
    private QuestionTypeService questionTypeService;

    @GetMapping(path = "/")
    public ResponseEntity<List<QuestionType>> findQuestionType(){
        List<QuestionType> findAllQuestionType= questionTypeService.findAllQuestionType();
        return new ResponseEntity<>(findAllQuestionType, HttpStatus.OK);
    }

}
