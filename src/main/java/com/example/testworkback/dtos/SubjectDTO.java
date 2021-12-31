package com.example.testworkback.dtos;

import com.example.testworkback.entity.Questions;
import lombok.*;

import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode()
public class SubjectDTO {
    private Long id;
    private String title;
    private Set<QuestionsDTO> questions;

}
