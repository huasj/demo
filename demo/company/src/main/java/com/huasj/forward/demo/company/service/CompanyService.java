package com.huasj.forward.demo.company.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

//name 为school项目中application.yml配置文件中的application.name
//path 为school项目中application.yml配置文件中的context.path
//@Componet注解最好加上，不加idea会显示有错误，但是不影响系统运行
@FeignClient(name = "school-server",path ="/school" )
@Component
public interface CompanyService {
    @RequestMapping(value = "studentList")
    String getSchoolStudent();
}
