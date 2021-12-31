package com.example.testworkback.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Table(name = "response")
@JsonIgnoreProperties({"ignoreUnknown = true"})
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class, property="id")
@Accessors(chain = true)
@Getter
@Setter
                                    // тут хранятся ответы на все вопросы :Р
public class Response {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "text")
    private String text;

    @Column(name = "correct")
    private boolean correct;
    @ManyToOne
    @JoinColumn(name="questions_id", nullable=false)
    private Questions questions;
}
