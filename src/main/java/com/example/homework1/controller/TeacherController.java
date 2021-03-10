package com.example.homework1.controller;

import com.example.homework1.entity.Teacher;
import com.example.homework1.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/t")
public class TeacherController {
    @Autowired(required = true)
    private  TeacherService teacherService;
    /**
     * 注册或添加老师
     * @param teacher
     * @return
     */

    @RequestMapping("/regist")
    @ResponseBody
    public String regist(Teacher teacher){
        String job_name = null;
        String name = null;
        String password = null;
        teacher.setJob_num(job_name);
        teacher.setName(name);
        teacher.setJob_num(job_name);
        teacher.setPassword(password);
        teacherService.save(teacher);
        return "login";
    }
    /**
     * 更新老师信息
     */
    @RequestMapping("/update")
    public Teacher update(@PathVariable("id") Teacher teacher){
        return teacherService.update(teacher);
    }
    /**
     * 删除学生信息
     * @param id
     */

    @GetMapping("/del/{id}")
    public  String  delete(@PathVariable String id){
        teacherService.delete(id);
        return "delete yes";
    }

    /**
     * 通过名字查询学生信息
     * @param name
     * @return
     */
    @RequestMapping("/findByName/{name}")
    public List<Teacher> findStuByName(@PathVariable  String name){
        return teacherService.findTeacherByName(name);
    }
    /**
     * 分页查询所有学生信息
     * @param
     * @return
     */

    @RequestMapping("/query")
    public Page<Teacher> findByPage(Integer page , HttpServletResponse response){

        response.setHeader("Access-Control-Allow-Origin","*");//异步请求响应头

        if(page==null || page<=0){
            page = 0;
        }else{
            page -= 1;
        }

        return teacherService.findAll(page,5);
    }
    @RequestMapping("/findById")
    public Teacher findTeaById(String id){
        return teacherService.findTeaById(id);
    }
}