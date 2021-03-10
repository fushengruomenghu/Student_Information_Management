package com.example.homework1.dao;

import com.example.homework1.entity.Course;
import com.example.homework1.entity.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CourseDao extends JpaRepository<Course,String> {
    Course findGradeById(String  id);
    @Query(name = "findCourseByName",nativeQuery = true,value = "select * from course where name=:name")
    List<Course> findCourseByName(@Param("name") String name);
    void deleteById(String id);
}
