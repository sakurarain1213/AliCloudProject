package com.example.hou.service;

import com.example.hou.entity.Housing;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hsin
 * @since 2023-07-22
 */
public interface HousingService  {


    public String addService(Housing housing);
    public String changeService(Housing housing);
    public List<Housing> searchService(Housing housing);


}
