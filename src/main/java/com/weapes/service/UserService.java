package com.weapes.service;


import com.weapes.domin.login.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/5/9.
 */
@Service
public interface UserService {
    User getUserByUserName(String userName);

    int saveUserInfo(HashMap<String, String> userInfo);

    List<String> listRoleByUserId(int userId);

    void changePasswordByUserName(String userName, String newPassword);
}
