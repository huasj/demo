package com.mvcdemo.controller;

import com.mvcdemo.model.Test;
import com.mvcdemo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/test")
public class TestController {
    @Autowired
    TestService testService;

    @RequestMapping(value = "/get/user", method = RequestMethod.GET)
    public List<Test> getUser() {
        List<Test> user = testService.getUser();
        return user;
    }

}
