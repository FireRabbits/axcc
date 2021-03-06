package com.axcc.service;

import com.axcc.model.MobileCode;
import com.axcc.model.Users;

import java.util.List;
import java.util.Map;

/**
 * Created by tongshr on 2018/10/02.
 */
public interface UserService {
    Users getUserById(int id);

    Users getUserByLoginName(String loginName);

    Users getUserByBean(Users bean);

    int resetPassword(Users bean);

    int insertUserForBean(Users bean);

    int updateUserForBean(Users bean);

    List<Users> listUserByBean(Users bean, int pageNum, int pageSize);

    int countUserByBean(Users bean);

    List<Users> findAllUser(int pageNum, int pageSize);

    //保存验证码
    int insertMobileCode(MobileCode mobileCode);
    //读取验证码
    MobileCode selectMobileCode(String loginName);

}
