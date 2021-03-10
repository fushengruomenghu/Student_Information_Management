package com.example.homework1.dao;

import com.example.homework1.entity.Student;
import com.example.homework1.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentDao extends JpaRepository<Student,String> {
    Student findTeacherById(String id);
    @Query(name = "findTeacherByName",nativeQuery = true,value = "select * from student where name=:name")
    List<Student> findTeacherByName(@Param("name") String name);
    void deleteById(String id);
}
