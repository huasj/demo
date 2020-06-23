package com.huasj.forward.demo.school.controller;

import com.huasj.forward.demo.entity.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchoolController {

    @RequestMapping(value = "/studentList",method = RequestMethod.GET)
    public String getStudent(){
        Student student = new Student();
        student.setName("xiaoming");
        student.setAge(18);
        return student.toString();
    }
}
