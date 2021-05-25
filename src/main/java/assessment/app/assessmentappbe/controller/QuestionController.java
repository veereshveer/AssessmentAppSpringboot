package assessment.app.assessmentappbe.controller;

import assessment.app.assessmentappbe.Dao.dto.AddQuestionDto;
import assessment.app.assessmentappbe.Dao.dto.QuestionDto;
import assessment.app.assessmentappbe.Dao.model.Question;
import assessment.app.assessmentappbe.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping(path = "/assessmentId/{id}")
    public ResponseEntity<List<QuestionDto>> getListQuestion(@PathVariable("id")Integer id){
        List<QuestionDto> getListQuestion =  questionService.getListQuestion(id);
        return new ResponseEntity<>(getListQuestion, HttpStatus.CREATED);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Question> getQuestion(@PathVariable("id")Integer id){
        Question getQuestion =  questionService.getQuestion(id);
        return new ResponseEntity<>(getQuestion, HttpStatus.CREATED);
    }

    @PostMapping(path = "/")
    public ResponseEntity<Question> addAssessment(@RequestBody AddQuestionDto addQuestionDto){
        Question addQuestion =  questionService.addQuestion(addQuestionDto);
        return new ResponseEntity<>(addQuestion, HttpStatus.CREATED);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Question> addAssessment(@PathVariable("id") Integer id, @RequestBody AddQuestionDto addQuestionDto){
        Question updateQuestion =  questionService.updateQuestion(id , addQuestionDto);
        return new ResponseEntity<>(updateQuestion, HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> deleteQuestionById(@PathVariable("id") Integer id){
        questionService.deleteQuestionById(id);
        return ResponseEntity.noContent().build();
    }
}
