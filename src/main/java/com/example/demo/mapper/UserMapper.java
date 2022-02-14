package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("SELECT * from sys_user")
    List<User> findAll();

    @Insert("INSERT into sys_user(username, password, nickname, email, phone, address) VALUES (#{username}, #{password}, #{nickname}," +
            " #{email}, #{phone}, #{address})")
    int insert(User user);


    int update(User user);
}