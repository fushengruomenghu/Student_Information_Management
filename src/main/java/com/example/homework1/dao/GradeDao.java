package com.example.homework1.dao;

import com.example.homework1.entity.Grade;
import com.example.homework1.entity.SC;
import com.example.homework1.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface GradeDao extends JpaRepository<Grade,Integer> {
    Grade findGradeById(Integer  id);
    @Query(name = "findGradeByName",nativeQuery = true,value = "select * from grade where name=:name")
    List<Grade> findGradeByName(@Param("name") String name);
    void deleteById(Integer id);
}
