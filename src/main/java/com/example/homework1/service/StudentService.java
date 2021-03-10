package com.example.homework1.service;

import com.example.homework1.entity.Student;
import org.springframework.data.domain.Page;

import java.util.List;

public interface StudentService {
    Student save(Student student);
    Student update(Student student);
    void delete(String id);
    Student findStuById(String id);
    List<Student> findStudentByName(String name);
    /**
     * @param page
     *
     */
    Page<Student> findAll(int page, int pagesize);
}
