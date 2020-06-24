package com.huasj.forward.demo.school.service;

import com.huasj.forward.demo.entity.Student;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface SchoolService {

    List<Student> getStudent();

    Integer getStudentNumber();
}
