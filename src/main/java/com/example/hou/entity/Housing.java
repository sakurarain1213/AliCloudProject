package com.example.hou.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author hsin
 * @since 2023-07-22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "housing")
public class Housing {

    private static final long serialVersionUID = 1L;
    /**
     * 房源主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 收录时间
     */
    private Date time;

    /**
     * 收录来源
     */
    private String source;

    /**
     * 价格
     */
    private String price;

    /**
     * 地址等，鉴于房源复杂，包含面积等信息
     */
    private String location;

    /**
     * 房东姓名
     */
    private String name;

    /**
     * 联系方式
     */
    private String phone;

    /**
     * 备注
     */
    private String notes;

    /**
     * 房源状态
     */
    private Integer status;


}
