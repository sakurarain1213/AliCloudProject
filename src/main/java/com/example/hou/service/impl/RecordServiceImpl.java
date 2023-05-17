package com.example.hou.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.hou.entity.ExampleRecord;

import com.example.hou.mapper.RecordMapper;
import com.example.hou.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hsin
 * @since 2023-04-08
 */
@Service
public class RecordServiceImpl /*extends ServiceImpl<RecordMapper, Record> */implements RecordService {

    @Autowired
    RecordMapper recordMapper;//不要忘记注入


    @Override
    public String recordAddService(ExampleRecord exampleRecord){

        //username   txt   start +end  time
        //add的时候不用判断已存在的教师记录 但是要判断非空
        //疯狂debug


        if (exampleRecord.getTxtFile()==null) {//现在拿的是整体
            //System.out.println(record.getTxtFile()+"?????????");//测试语句
             return "缺少文本信息";
        } //else if (record.getEndTime()==null) {
          //  return "缺少时间信息";//时间交给每句话处理
        //}
        else if(exampleRecord.getUsername()==null){
            return "缺少用户信息";
        }
        else{
            /***********************************************************
             开始分割文本 连接句子表
             */

            String test= exampleRecord.getTxtFile();
            //时间差要以分钟为单位的float   gettime方法返回ms
           // float deltaTime=(record.getEndTime().getTime()-record.getStartTime().getTime());
            //deltaTime=deltaTime/1000/60;//ms转minute

            ExampleRecord r=new ExampleRecord();//临时插入变量

            //时间格式转化
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            //进行遍历





           // record.setYusu(W.yusu);  没有语速
           // W.
            //由于高频词返回一个list string  直接拼成一个大string即可
            //String gao=String.join(",", W.Get_gaopinci(5));
           // record.setGaopin(gao);//默认返回前五大高频词
      /*******
       * 结束调用
       * ***/
            return "SUCCESS";
        }





     // record.setTxtFile("测试嗷嗷");
      // record.setUsername("3");
      //  recordMapper.insert(record);
      //  return "yes";
}


    @Override//通过时间范围和username拿语音记录
    //查询 应该返回对象List 而不再是string
    public List<ExampleRecord> recordGetService(ExampleRecord exampleRecord) {//传入的前端请求对象
           Date time1= exampleRecord.getStartTime(); // 考虑要不要tostring
           Date time2= exampleRecord.getEndTime(); // 考虑要不要tostring
           String user= exampleRecord.getUsername();
       //因为有可能为空 所以要返回临时的量
       // List<Record> t;
       // Record temp = new Record();

        //准备查询
        //temp.setUsername(user);
        // temp.setStartTime(time1);
        //temp.setEndTime(time2);
        //plus的条件构造器 查询条件
        //有可能出错 注意列名不能改


           if(time1==null ||time2 ==null ||user ==null)
           {
             //"缺少用户或时间范围的筛选条件";
               return null;
           }
        //尝试用wrapper 实现SQL的等于 介于 大 小  筛选 合并 查询

        QueryWrapper<ExampleRecord> qw = new QueryWrapper<>();
        qw
                .eq("username",user)
                .eq("iswuru",1)  //加一个筛选侮辱词的接口
                .between("start_time",time1,time2)
                .orderByDesc("start_time")//asc desc 升降序
        ;
        //然后得到记录行
        List<ExampleRecord> l = recordMapper.selectList(qw);
            //l==null 表示查询结果为空
            //test
            return l;
            //l.forEach(System.out::println);
            //return "SUCCESS";

        }
//再写一个查询全部  以及平均分！！！


}
