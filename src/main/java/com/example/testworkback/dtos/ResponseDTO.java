package com.example.testworkback.dtos;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode()
public class ResponseDTO {
    private String text;
    private boolean correct;
}
