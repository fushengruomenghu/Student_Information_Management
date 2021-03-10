package com.example.homework1.entity;

import lombok.Data;

import javax.persistence.*;

@Table(name = "sc")
@Entity
@Data
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer stu_id;
    private Integer course_id;
    private Double usual_term_grades;
    private Double mid_term_grades;
    private Double final_term_grades;
}
