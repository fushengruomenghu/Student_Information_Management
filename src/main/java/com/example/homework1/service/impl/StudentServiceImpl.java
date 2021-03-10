package com.example.homework1.service.impl;

import com.example.homework1.entity.Student;
import com.example.homework1.service.StudentService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public Student save(Student student) {
        return null;
    }

    @Override
    public Student update(Student student) {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public Student findStuById(String id) {
        return null;
    }

    @Override
    public List<Student> findStudentByName(String name) {
        return null;
    }

    /**
     * @param page
     * @param pagesize
     */
    @Override
    public Page<Student> findAll(int page, int pagesize) {
        return null;
    }
}
