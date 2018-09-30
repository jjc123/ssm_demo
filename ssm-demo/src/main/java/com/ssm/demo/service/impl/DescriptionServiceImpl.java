package com.ssm.demo.service.impl;

import com.ssm.demo.dao.DescriptionDao;
import com.ssm.demo.entity.Description;
import com.ssm.demo.service.DescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("descriptionService")//注意这个注解
public class DescriptionServiceImpl implements DescriptionService {

    //自动装配
    @Autowired
    private DescriptionDao descriptionDao;

    @Override
    public Description getLastDescription() {
        return descriptionDao.getLastDescription();
    }
}
