package com.weapes.controller;


import com.weapes.domin.login.ChangePasswordForm;
import com.weapes.domin.login.User;
import com.weapes.domin.response.Response;
import com.weapes.service.UserService;
import com.weapes.util.Helper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/5/16.
 */
@RestController
@CrossOrigin
public class ModifyPasswordController {
    @Autowired
    UserService userService;

    @PostMapping(value = "modify_password")
    public Response modifyPassword(@RequestBody ChangePasswordForm passwordForm) {
        Response response = new Response();
        if (Helper.hasEmptyField(passwordForm)) {
            response.setMessage("请完善表单信息");
            return response;
        } else if (!passwordForm.getNewPassword().equals(passwordForm.getRepeatPassword())) {
            response.setMessage("新密码输入不一致,请重新输入!");
            return response;
        }
        User user;
        try {
            user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
            System.out.println(user.toString());
        } catch (NullPointerException npe) {
            return null;
        }
        if (!user.getPassword().equals(passwordForm.getOldPassword())) {
            response.setMessage("原密码错误,请重新输入!");
            return response;
        }
        userService.changePasswordByUserName(user.getUsername(), passwordForm.getNewPassword());
        response.setMessage("修改成功!");
        return response;
    }
}
