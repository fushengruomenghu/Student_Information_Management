package com.example.homework1.dao;

import com.example.homework1.entity.SC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ScDao extends JpaRepository<SC,Integer> {
    SC findScById(Integer  id);
    @Query(name = "findScByName",nativeQuery = true,value = "select * from SC where name=:name")
    List<SC> findScrByName(@Param("name") String name);
    void deleteById(Integer id);
}
