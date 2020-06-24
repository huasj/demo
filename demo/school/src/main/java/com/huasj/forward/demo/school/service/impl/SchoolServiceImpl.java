package com.huasj.forward.demo.school.service.impl;

import com.huasj.forward.demo.entity.Student;
import com.huasj.forward.demo.school.dao.SchoolMapper;
import com.huasj.forward.demo.school.service.SchoolService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SchoolServiceImpl implements SchoolService {

    private static Logger logger = LoggerFactory.getLogger(SchoolServiceImpl.class);

    @Resource
    private SchoolMapper schoolMapper;

    @Override
    public List<Student> getStudent() {
        logger.info("this is student list");
        return schoolMapper.getStudent();
    }

    @Override
    public Integer getStudentNumber() {
        logger.info("this is student number");
        return schoolMapper.getStudentNumber();
    }
}
