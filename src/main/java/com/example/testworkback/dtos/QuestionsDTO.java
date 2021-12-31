package com.example.testworkback.dtos;

import com.example.testworkback.entity.Response;
import lombok.*;

import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode()
public class QuestionsDTO {
    private String text;
    private Set<ResponseDTO> responses;
}
