package com.service.impl;

import com.mapper.UserMapper;
import com.pojo.User;
import com.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/3/19.
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public boolean addUser(User user) {
        return userMapper.insert(user)>0?true:false;
    }

    @Override
    public boolean delUserByUid(Integer userUid) {
        return userMapper.delUserByUid(userUid)>0?true:false;
    }

    @Override
    public boolean updateUser(User user) {
        return userMapper.updateUser(user)>0?true:false;
    }

    @Override
    public boolean findUserByUid(Integer userUid) {
        return userMapper.findUserByUid(userUid)>0?true:false;
    }
    @Override
    public List<User> findAll() {
        return userMapper.selectAll();
    }
}
