package com.service;

import com.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/3/19.
 */
@Service
public interface UserService {
    boolean addUser(User user);
    boolean delUserByUid(Integer userUid);
    boolean updateUser(User user);
    boolean findUserByUid(Integer userUid);
    List<User> findAll();
}
