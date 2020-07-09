package com.mvcdemo.service.impl;

import com.mvcdemo.dao.TestDao;
import com.mvcdemo.model.Test;
import com.mvcdemo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    TestDao testDao;
    @Override
    public List<Test> getUser() {
        System.out.println();
        return testDao.getUser();
    }
}
