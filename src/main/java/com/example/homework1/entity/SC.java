package com.example.homework1.entity;

import lombok.Data;

import javax.persistence.*;

@Table(name = "sc")
@Entity
@Data
public class SC {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer cou_id;
    private Integer stu_id;
}
