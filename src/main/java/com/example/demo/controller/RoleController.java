package com.example.demo.controller;

import com.example.demo.dao.RoleMapper;
import com.example.demo.pojo.RoleMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleController {

    @Autowired
    private RoleMapper roleMapper;

    @RequestMapping("/get")
    public List<RoleMap> get(){
        return roleMapper.getAllRoleMap();
    }
}
