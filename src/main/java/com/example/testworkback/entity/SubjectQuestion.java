package com.example.testworkback.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "subject")
@JsonIgnoreProperties({"ignoreUnknown = true"})
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class, property="id")
@Getter
@Setter
public class SubjectQuestion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "title")
    private String title;

    @OneToMany(mappedBy = "subject")
    private Set<Questions> questions;
}
