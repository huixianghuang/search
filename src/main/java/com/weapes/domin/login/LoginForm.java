package com.weapes.domin.login;

/**
 * Created by 不一样的天空 on 2017/6/25.
 */
public class LoginForm {
    private String username;
    private String password;
    private String captcha;

    public String getCaptcha() {
        return captcha;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginForm{" +
                "userName='" + username + '\'' +
                ", password='" + password + '\'' +
                ", kaptcha='" + captcha + '\'' +
                '}';
    }
}
