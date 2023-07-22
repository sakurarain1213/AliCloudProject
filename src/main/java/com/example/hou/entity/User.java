package com.example.hou.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
//只是用作临时登录   数据库无表  类
public  class User {
    private static final long serialVersionUID = 1L;
    /**
     * 用户主键
     */
    private String name;
    private String password;
    /**
     * 管理员权限
     */
    private Integer access;

}
