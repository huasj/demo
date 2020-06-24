package com.huasj.forward.demo.school.service.impl;

import com.huasj.forward.demo.entity.Student;
import com.huasj.forward.demo.school.dao.SchoolMapper;
import com.huasj.forward.demo.school.service.SchoolService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SchoolServiceImpl implements SchoolService {

    @Resource
    private SchoolMapper schoolMapper;

    @Override
    public List<Student> getStudent() {
        return schoolMapper.getStudent();
    }

    @Override
    public Integer getStudentNumber() {
        return schoolMapper.getStudentNumber();
    }
}
