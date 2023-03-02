package com.hackathon.event.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="education")
@Getter
@Setter
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "education_sequence")
    @SequenceGenerator(name="education_sequence", allocationSize = 1)
    private Long educationId;

    @OneToOne
    @JoinColumn(name="personalid")
    @JsonIgnore
    private Personal personal;

    private String faculty;
    private Integer year;
}
