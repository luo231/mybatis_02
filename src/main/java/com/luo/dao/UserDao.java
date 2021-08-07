package com.luo.dao;

import com.luo.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 用户的持久层接口
 * @author luo
 * @create 2021-07-25 10:41
 */
public interface UserDao {

    /**
     * 查询所有操作
     * @return
     */
    @Select("select * from user")
    List<User> findAll();



}
