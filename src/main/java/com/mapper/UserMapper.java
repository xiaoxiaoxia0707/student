package com.mapper;

import com.pojo.User;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer uid);

    List<User> selectAll();

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int  delUserByUid(Integer userUid);

    int updateUser(User user);

    int findUserByUid(Integer userUid);
}