package com.example.homework1.service;

import com.example.homework1.entity.Teacher;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;
public interface TeacherService {

    Teacher save(Teacher teacher);
    Teacher update(Teacher teacher);
    void delete(String id);
    Teacher findTeaById(String id);
    List<Teacher> findTeacherByName(String name);
    /**
     * @param page
     *
     */
    Page<Teacher> findAll(int page,int pagesize);
}
