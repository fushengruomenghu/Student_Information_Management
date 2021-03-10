package com.example.homework1.dao;

import com.example.homework1.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TeacherDao extends JpaRepository<Teacher,String> {

    Teacher findTeacherById(String id);
    @Query(name = "findTeacherByName",nativeQuery = true,value = "select * from teacher where name=:name")
    List<Teacher> findTeacherByName(@Param("name") String name);
    void deleteById(String id);
}
