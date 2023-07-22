package com.example.hou.mapper;

import com.example.hou.entity.Custom;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author hsin
 * @since 2023-07-22
 */
@Repository
@Mapper
public interface CustomMapper extends BaseMapper<Custom> {

}
