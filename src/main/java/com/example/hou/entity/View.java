package com.example.hou.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;
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
@TableName(value = "view")
public class View implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 看房记录表主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 客户主键
     */
    @TableField("customID")
    private String customID;

    /**
     * 房源主键
     */
    @TableField("houseID")
    private String houseID;

    /**
     * 看房时间
     */
    private Date date;

    /**
     * 备注
     */
    private String notes;


}
