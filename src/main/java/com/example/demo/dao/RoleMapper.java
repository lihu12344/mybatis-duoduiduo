package com.example.demo.dao;

import com.example.demo.pojo.Role;
import com.example.demo.pojo.RoleMap;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface RoleMapper extends Mapper<Role> {

    Role getRoleByUserId(@Param("id") Integer id);

    List<RoleMap> getAllRoleMap();
}
