package com.example.testworkback.service;


import com.example.testworkback.entity.SubjectQuestion;

import java.util.Optional;

public interface SubjectQuestionService {
    Optional<SubjectQuestion> findById(Long id);
}
