package com.huasj.forward.demo.company.service.impl;

import com.huasj.forward.demo.company.dao.CompanyMapper;
import com.huasj.forward.demo.company.service.CompanyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Resource
    private CompanyMapper companyMapper;
}
