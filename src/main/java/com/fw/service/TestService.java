package com.fw.service;

import com.fw.domain.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

/**
 * @author yqf
 */
public interface TestService {
    User findAll();
}
