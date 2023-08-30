package com.example.hou.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.example.hou.entity.Housing;
import com.example.hou.mapper.HousingMapper;
import com.example.hou.service.HousingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hsin
 * @since 2023-07-22
 */
@Service
public class HousingServiceImpl implements HousingService {

    @Autowired
    HousingMapper housingMapper;

    //只需要增 改 查
    @Override
    public String addService(Housing housing) {

        if (housing.getLocation().equals("")) {
            return "请输入地址";
        } else {
            Housing temp;
            temp=housing;

            Date date = new Date();
            //注意这个时间是格林尼治标准时间 东八区+8小时
            long time=date.getTime()+8*3600000;
            date.setTime(time);

            temp.setTime(date);

            housingMapper.insert(temp);

            return  "SUCCESS";
        }
    }

    @Override
    public String changeService(Housing housing) {

        if (housing.getId()==null) {
            return "请确认ID";
        } else {

            //查询  条件构造器
            UpdateWrapper<Housing> u = new UpdateWrapper<>();
            u.eq("id", housing.getId());


            int flag = housingMapper.update(housing, u);
            if (flag == 1) {
                return "SUCCESS";
            } else {
                return "更新失败";
            }
        }
    }

    @Override
    public List<Housing> searchService(Housing housing){
       // if (housing.getId()==null)
      //      return null;

            QueryWrapper<Housing> q = new QueryWrapper<>();
            q
                    .like("location", housing.getLocation());

            List<Housing> l = housingMapper.selectList(q);
            //if (l.size()==0)   return null;
            return l;


    }









}
