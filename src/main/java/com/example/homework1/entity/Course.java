package com.example.homework1.entity;

import lombok.Data;

import javax.persistence.*;
@Entity
@Data
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer stu_id;
    private Integer tea_id;
    private String academic_year;
    private String term;
    private String cou_num;
    private String name;
    private String work_time;
    private String work_address;
}
