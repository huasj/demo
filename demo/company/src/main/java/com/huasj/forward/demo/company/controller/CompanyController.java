package com.huasj.forward.demo.company.controller;

import com.huasj.forward.demo.company.service.CompanyFeignClientService;
import com.huasj.forward.demo.company.service.CompanyService;
import com.huasj.forward.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class CompanyController {
    @Autowired
    CompanyFeignClientService companyFeignClientService;

    @Resource
    CompanyService companyService;

    @RequestMapping(value = "schoolStudent",method = RequestMethod.GET)
    public List<Student> getSchoolStudent(){
        return companyFeignClientService.getSchoolStudent();
    }

    @RequestMapping(value = "schoolStudentNumber",method = RequestMethod.GET)
    public Integer getSchoolStudentNumber(){
        return companyFeignClientService.getSchoolStudentNumber();
    }
}
