package com.huasj.forward.demo.school.dao;

import com.huasj.forward.demo.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SchoolMapper {

    List<Student> getStudent();

    Integer getStudentNumber();
}
