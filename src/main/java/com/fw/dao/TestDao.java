package com.fw.dao;

import com.fw.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author yqf
 */


@Repository
public interface TestDao {

    /**
     * find all user
     * @return
     * */
    @Select("select * from user")
    User findAll();

}
