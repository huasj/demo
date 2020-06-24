package com.huasj.forward.demo.school.controller;

import com.huasj.forward.demo.entity.Student;
import com.huasj.forward.demo.school.service.SchoolService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class SchoolController {

    @Resource
    SchoolService schoolService;

    @RequestMapping(value = "/getStudent",method = RequestMethod.GET)
    public List<Student> getStudent(){
        return schoolService.getStudent();
    }

    @RequestMapping(value = "/getStudentNumber",method = RequestMethod.GET)
    public Integer getStudentNumber(){
        return schoolService.getStudentNumber();
    }
}
