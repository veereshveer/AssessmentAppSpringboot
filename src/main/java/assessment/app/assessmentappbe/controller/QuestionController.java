package assessment.app.assessmentappbe.controller;

import assessment.app.assessmentappbe.Dao.dto.AddQuestionDto;
import assessment.app.assessmentappbe.Dao.model.Assessment;
import assessment.app.assessmentappbe.Dao.model.Question;
import assessment.app.assessmentappbe.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "question")
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @PostMapping(path = "/")
    public ResponseEntity<Question> addAssessment(@RequestBody AddQuestionDto addQuestionDto){
        Question addQuestion=  questionService.addQuestion(addQuestionDto);
        return new ResponseEntity<>(addQuestion, HttpStatus.CREATED);
    }

}
