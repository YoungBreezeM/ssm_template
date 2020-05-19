package com.fw.service.impl;

import com.fw.dao.TestDao;
import com.fw.domain.User;
import com.fw.service.TestService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author yqf
 */
@Service
public class TestServiceImpl implements TestService {

   @Autowired
   TestDao testDao;

    @Override
    public User findAll() {

       return testDao.findAll();

    }
}
