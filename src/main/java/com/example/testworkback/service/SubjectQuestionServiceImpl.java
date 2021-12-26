package com.example.testworkback.service;
import com.example.testworkback.entity.SubjectQuestion;
import com.example.testworkback.entity.SubjectQuestionRepo;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service                                                //просто сервис
public class SubjectQuestionServiceImpl implements SubjectQuestionService{

    SubjectQuestionRepo questionRepo;

    public SubjectQuestionServiceImpl(SubjectQuestionRepo questionRepo) {
        this.questionRepo = questionRepo;
    }

    @Override
    public Optional<SubjectQuestion> findById(Long id) {
        return questionRepo.findById(id);
    }
}
