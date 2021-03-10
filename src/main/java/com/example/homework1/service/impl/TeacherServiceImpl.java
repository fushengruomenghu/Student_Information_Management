package com.example.homework1.service.impl;

import com.example.homework1.dao.TeacherDao;
import com.example.homework1.entity.Teacher;
import com.example.homework1.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherDao teacherDao;

    @Override
    public Teacher save(Teacher teacher) {
        return teacherDao.save(teacher);
    }

    @Override
    public Teacher update(Teacher teacher) {
        return teacherDao.save(teacher);
    }

    @Override
    public void delete(String id) {
        teacherDao.deleteById(id);
    }

    @Override
    public Teacher findTeaById(String id) {
        return teacherDao.findTeacherById(id);
    }

    @Override
    public List<Teacher> findTeacherByName(String name) {
        return teacherDao.findTeacherByName(name);
    }
    @Override
    public Page<Teacher> findAll(int page, int pagesize) {
        Pageable pageble= PageRequest.of(page,pagesize);
        return teacherDao.findAll(pageble);
    }
}
