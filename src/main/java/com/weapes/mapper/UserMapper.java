package com.weapes.mapper;


import com.weapes.domin.login.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/5/8.
 */
@Mapper
@Service
public interface UserMapper {

    @Select("select userId,username,password,enabled from User where username=#{username}")
    User getUserByUserName(@Param("username") String username);

    @Insert("insert into User(username,password) values(#{username},#{password})")
    @Options(useGeneratedKeys = true, keyProperty = "userId", keyColumn = "userId")
    int saveUserInfo(HashMap<String, String> map);

    @Select("select role from UserRole where userId=#{userId}")
    List<String> listRoleByUserId(int userId);

    @Insert("insert into UserRole(userId,role) values(#{userId},#{role})")
    boolean saveUserRole(@Param("userId") int userId, @Param("role") String roleName);

    @Update("update User set password=#{password} where userName=#{username}")
    void changePasswordByUserName(@Param("username") String userName, @Param("password") String password);
}
