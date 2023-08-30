package com.example.hou.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.example.hou.entity.User;
import com.example.hou.mapper.UserMapper;
import com.example.hou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.io.UnsupportedEncodingException;
import java.util.Objects;


/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hsin
 * @since 2023-05-17
 */

@Service
public class UserServiceImpl  implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public String loginService(User user) {
        //静态登录  只有一个数据
            if (user.getName().equals("xjfc") && user.getPassword().equals("123abc") ) {
                return "SUCCESS";
            } else {
                return "账号或密码错误";
            }
    }



}
