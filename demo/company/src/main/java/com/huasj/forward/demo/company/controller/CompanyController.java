package com.huasj.forward.demo.company.controller;

import com.huasj.forward.demo.company.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @RequestMapping(value = "schoolStudentList",method = RequestMethod.GET)
    public String getSchoolStudentList(){
        return companyService.getSchoolStudent();
    }
}
