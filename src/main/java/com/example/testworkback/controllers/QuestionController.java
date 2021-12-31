package com.example.testworkback.controllers;

import com.example.testworkback.dtos.SubjectDTO;
import com.example.testworkback.entity.SubjectQuestion;
import com.example.testworkback.service.SubjectQuestionServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(path = "/api/tests", produces = MediaType.APPLICATION_JSON_VALUE)
public class QuestionController {

   private final SubjectQuestionServiceImpl subjectQuestionService;

    public QuestionController(SubjectQuestionServiceImpl subjectQuestionService) {
        this.subjectQuestionService = subjectQuestionService;

    }

    @GetMapping("/questions/{id}")      //по id мы вытаскиваем нужную тему(они веди могут быть разными)
                                            // в базе забита только одна тема, её id - 1
    public ResponseEntity<SubjectDTO> getQuestions(@PathVariable("id") Long id) {
        ModelMapper modelMapper = new ModelMapper();

        Optional<SubjectQuestion> question = subjectQuestionService.findById(id);
        SubjectDTO subjectDTO = modelMapper.map(question.get(), SubjectDTO.class);
        return new ResponseEntity<>(subjectDTO, HttpStatus.OK);
    }

    @Bean
    public ModelMapper getMapper() {
        return new ModelMapper();
    }

}
