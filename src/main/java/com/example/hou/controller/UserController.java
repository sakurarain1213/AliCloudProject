package com.example.hou.controller;


import com.example.hou.entity.User;
import com.example.hou.result.Result;
import com.example.hou.result.ResultUtil;
import com.example.hou.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/*
获得用户信息
localhost:8080/user/get
{
    "sfz":"123456789012345677"
}

 */

//临时搞一个静态传参方法  tutu   好玩


@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;
    @RequestMapping("/login")
    public Result login(@RequestBody User user) {
        String msg = userService.loginService(user);
        if (("SUCCESS").equals(msg)) {
            return ResultUtil.success("登录成功");
        } else {
            return ResultUtil.error(msg);
        }
    }


    @RequestMapping("/register")
    public Result register(@RequestBody User user) {
        String msg = userService.registerService(user);
        if (("SUCCESS").equals(msg)) {
            return ResultUtil.success("注册成功");
        } else {
            return ResultUtil.error(msg);
        }
    }

    @RequestMapping("/update")
    public Result update(@RequestBody User user) {
        String msg = userService.updateService(user);
        if (("SUCCESS").equals(msg)) {
            return ResultUtil.success("用户信息更新成功");
        } else {
            return ResultUtil.error(msg);
        }
    }

    @RequestMapping("/get")
    public Result getUser(@RequestBody User user) {
        User u = userService.getService(user);
        if (u!=null) {
            return ResultUtil.success(u);
        } else {
            return ResultUtil.error("获取失败");
        }
    }


    @RequestMapping(value="/tutu" , produces={"application/json;charset=UTF-8"})  //用于支持中文json输出
    public Result tempshow() {
            //相当于重新打开了ResultUtil的封装  自定义返回消息也在返回类的属性位置编辑
            Result r=new Result();
            r.setCode(200);
            r.setMsg("成功连接到猪猪的心~");
            r.setData("hi~ 兔兔随时可以在这里找到我 -- 2023.7.10  wxj ");
            return r;
        }
    @RequestMapping(value="/zxy" , produces={"application/json;charset=UTF-8"})
    public Result tempshow22() {
        //相当于重新打开了ResultUtil的封装  自定义返回消息也在返回类的属性位置编辑
        Result r=new Result();
        r.setCode(200);
        r.setMsg("服务器测试");
        r.setData("hi~ 小妍  金榜题名 加油  :)   ur sincerely  wxj ");
        return r;
    }


}

