package com.example.myshiro.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    public String getPassword(String username);
    public String getRole(String username);
}
