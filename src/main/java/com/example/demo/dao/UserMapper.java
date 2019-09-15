package com.example.demo.dao;

import com.example.demo.pojo.User;
import com.example.demo.pojo.UserMap;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper extends Mapper<User> {

    User getUserByRoleId(@Param("id") Integer id);

    List<UserMap> getAllUserMap();
}
