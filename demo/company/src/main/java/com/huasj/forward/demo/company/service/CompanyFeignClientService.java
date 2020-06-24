package com.huasj.forward.demo.company.service;

import com.huasj.forward.demo.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

//name 为school项目中application.yml配置文件中的application.name
//path 为school项目中application.yml配置文件中的context.path
@FeignClient(name = "school-server",path ="/school" )
@Component
public interface CompanyFeignClientService {

    @RequestMapping(value = "getStudent")
    List<Student> getSchoolStudent();

    @RequestMapping(value = "getStudentNumber")
    Integer getSchoolStudentNumber();


}
