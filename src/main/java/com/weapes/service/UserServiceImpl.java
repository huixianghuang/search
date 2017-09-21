package com.weapes.service;

import com.weapes.domin.login.User;
import com.weapes.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/5/9.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User getUserByUserName(String userName) {
        return userMapper.getUserByUserName(userName);
    }

    @Override
    public int saveUserInfo(HashMap<String, String> map) {
        return userMapper.saveUserInfo(map);
    }

    @Override
    public List<String> listRoleByUserId(int userId) {
        return userMapper.listRoleByUserId(userId);
    }

    @Override
    public void changePasswordByUserName(String userName, String newPassword) {
        userMapper.changePasswordByUserName(userName, newPassword);
    }
}
