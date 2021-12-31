package com.example.testworkback.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.Set;

@Entity
@NoArgsConstructor
@Table(name = "questions")
@JsonIgnoreProperties({"ignoreUnknown = true"})
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class, property="id")
@Accessors(chain = true)
@Getter
@Setter
                                    // а это блок вопросов
public class Questions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "text")
    private String text;

    @OneToMany(mappedBy="questions")
    private Set<Response> responses;

    @ManyToOne
    @JoinColumn(name="subject_id", nullable=false)
    private SubjectQuestion subject;
}
