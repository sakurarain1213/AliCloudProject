package com.example.hou.controller;


import com.example.hou.entity.Housing;
import com.example.hou.entity.User;
import com.example.hou.result.Result;
import com.example.hou.result.ResultUtil;
import com.example.hou.service.HousingService;
import com.example.hou.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*

localhost:8080/housing/search
{
    "location": "地址"
}


localhost:8080/housing/change
{
            "id": 2,
            "time": "2023-07-22T00:45:03.000+00:00",
            "source": "来源",
            "price": "100",
            "location": "地址测试",
            "name": "客户名",
            "phone": "123",
            "notes": "备注",
            "status": 1
}


localhost:8080/housing/add
{
            "time": "2023-07-25T08:45:03.000+00:00",
            "source": "来源",
            "price": "1234",
            "location": "地址测试",
            "name": "客户名",
            "phone": "123",
            "notes": "备注",
            "status": 1
}




 */




@Slf4j
@RestController
@RequestMapping("/housing")
public class HousingController {


    @Autowired
    HousingService housingService;
    @RequestMapping("/search")
    public Result search(@RequestBody Housing housing) {
        List<Housing> l = housingService.searchService(housing);
        if (l != null) {
            //相当于重新打开了ResultUtil的封装  自定义返回消息也在返回类的属性位置编辑
            Result r = new Result();
            r.setCode(200);
            r.setMsg("成功查询到房源数量：" + l.size());
            r.setData(l);
            return r;
        } else {
            return ResultUtil.error("缺少查询条件或查询结果为空");
        }
    }


    @RequestMapping("/add")
    public Result add(@RequestBody Housing housing) {
        String msg = housingService.addService(housing);
        if (("SUCCESS").equals(msg)) {
            return ResultUtil.success("添加成功");
        } else {
            return ResultUtil.error(msg);
        }
    }

    @RequestMapping("/change")
    public Result change(@RequestBody Housing housing) {
        String msg = housingService.changeService(housing);
        if (("SUCCESS").equals(msg)) {
            return ResultUtil.success("修改成功");
        } else {
            return ResultUtil.error(msg);
        }
    }


}

