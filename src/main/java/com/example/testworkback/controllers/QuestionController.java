package com.example.testworkback.controllers;

import com.example.testworkback.entity.SubjectQuestion;
import com.example.testworkback.service.SubjectQuestionServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(path = "/api/tests", produces = MediaType.APPLICATION_JSON_VALUE)
public class QuestionController {

    SubjectQuestionServiceImpl subjectQuestionService;

    public QuestionController(SubjectQuestionServiceImpl subjectQuestionService) {
        this.subjectQuestionService = subjectQuestionService;
    }

    @GetMapping("/questions/{id}")
    public ResponseEntity<SubjectQuestion> getQuestions(@PathVariable("id") Long id) {
        Optional<SubjectQuestion> question = subjectQuestionService.findById(id);
        return new ResponseEntity<>(question.get(), HttpStatus.OK);
    }
}
