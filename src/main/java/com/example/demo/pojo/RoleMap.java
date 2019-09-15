package com.example.demo.pojo;

import java.util.List;
import java.util.Objects;

public class RoleMap {

    private Integer id;
    private String role;

    private List<User> userList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RoleMap)) return false;
        RoleMap roleMap = (RoleMap) o;
        return Objects.equals(getId(), roleMap.getId()) &&
                Objects.equals(getRole(), roleMap.getRole()) &&
                Objects.equals(getUserList(), roleMap.getUserList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getRole(), getUserList());
    }
}
