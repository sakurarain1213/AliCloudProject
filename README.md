
云端测试项目（后端）
========================

在cmd中     tree 项目硬盘地址 /f > 树状图输出地址result.txt   即可

## 技术栈

- Springboot
- MybatisPlus
- Nginx + PHP + MySQL（LNMP）
- 服务器供应商：阿里云ECS


`~写表过程：entity层 service层(impl实现层)  （mapper层可不写）  controller层   测试`

# Configuration - 配置（配置信息。）
- 面板配置
- Nginx 1.22.1
- MySQL 8.0.24     5.7?
- PHP-7.4.33
- phpMyAdmin 5.0


### Changelog - 更新日志
- [x] *部署到服务器--没得报销2333*<br />
- [ ] *头像文件等*<br />
- [ ] *评价系统和排序规则优化*<br />
- [ ] *钱包和支付系统——使用机票票价——多乘客订票的改进*<br />
- [ ] *简单分页查询*
- [ ] Redis缓存token时效
- [ ] 邮箱注册验证模块
- [ ] 静态资源访问
- [ ] 嵌入式servlet容器
- [ ] 文件上传下载  
- [ ] 定时器
- [ ] 热部署的实现
- [ ] 持久层的优化
- [ ] security安全框架和数据库认证

IDEA的本地提交回滚策略：左下角git  选择本地某个记录 右键回滚  一定注意选择mixed选项  保留源码修改  只取消了本地提交
### FAQ - 常见问题（常见问题）  


### 云服务器部署过程：
阿里云+xshell+Xftp（可视化）+navicat（本地连接云端数据库） +宝塔面板自动部署软件
实例ID：i-bp1h0hhvaxtlel9fsv63
47.110.83.104  (公)
172.28.49.119  (私有)

porn.xml文件添加
<packaging>jar</packaging>
再双击meaven的package即可在target文件夹下得到hou-0.0.1-SNAPSHOT.jar包
坑点：一 maven配置里需要加上version ：mysql8.0以上   yml的配置要加上useSSL=false  数据库连接密码不能纯数字
二 mysql云端数据库报  java.sql.SQLException: null, message from server: "Host '*.*.*.*' is not allowed to connect  要在服务器命令行添加mysql的root权限
三 宝塔面板的配置： mysql要8.0   nginx要1.22  PHP要7.4   phpmyadmin要5.0  java一键部署要3.5
四  在一键部署里 设置/usr/java/jdk1.8.0_371/bin/java
47.110.83.104
 --server.port=8080   要加空格
五   阿里云安全组  入方向 要开各种端口  包括8080    宝塔也要对应开启入端口
FIN ！
    有问题问上帝lol
```(可以加编程语言名)
System.out.println("hello world");
```
```
来点抽象整活::
赛博佛祖
/*
                   _ooOoo_
                  o8888888o
                  88" . "88
                  (| -_- |)
                  O\  =  /O
               ____/`---'\____
             .'  \\|     |//  `.
            /  \\|||  :  |||//  \
           /  _||||| -:- |||||-  \
           |   | \\\  -  /// |   |
           | \_|  ''\---/''  |   |
           \  .-\__  `-`  ___/-. /
         ___`. .'  /--.--\  `. . __
      ."" '<  `.___\_<|>_/___.'  >'"".
     | | :  `- \`.;`\ _ /`;.`/ - ` : | |
     \  \ `-.   \_ __\ /__ _/   .-` /  /
======`-.____`-.___\_____/___.-`____.-'======
                   `=---='
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
            佛祖保佑       永无BUG
*/

                      :;J7, :,                        ::;7:
                      ,ivYi, ,                       ;LLLFS:
                      :iv7Yi                       :7ri;j5PL
                     ,:ivYLvr                    ,ivrrirrY2X,
                     :;r@Wwz.7r:                :ivu@kexianli.
                    :iL7::,:::iiirii:ii;::::,,irvF7rvvLujL7ur
                   ri::,:,::i:iiiiiii:i:irrv177JX7rYXqZEkvv17
                ;i:, , ::::iirrririi:i:::iiir2XXvii;L8OGJr71i
              :,, ,,:   ,::ir@mingyi.irii:i:::j1jri7ZBOS7ivv,
                 ,::,    ::rv77iiiriii:iii:i::,rvLq@huhao.Li
             ,,      ,, ,:ir7ir::,:::i;ir:::i:i::rSGGYri712:
           :::  ,v7r:: ::rrv77:, ,, ,:i7rrii:::::, ir7ri7Lri
          ,     2OBBOi,iiir;r::        ,irriiii::,, ,iv7Luur:
        ,,     i78MBBi,:,:::,:,  :7FSL: ,iriii:::i::,,:rLqXv::
        :      iuMMP: :,:::,:ii;2GY7OBB0viiii:i:iii:i:::iJqL;::
       ,     ::::i   ,,,,, ::LuBBu BBBBBErii:i:i:i:i:i:i:r77ii
      ,       :       , ,,:::rruBZ1MBBqi, :,,,:::,::::::iiriri:
     ,               ,,,,::::i:  @arqiao.       ,:,, ,:::ii;i7:
    :,       rjujLYLi   ,,:::::,:::::::::,,   ,:i,:,,,,,::i:iii
    ::      BBBBBBBBB0,    ,,::: , ,:::::: ,      ,,,, ,,:::::::
    i,  ,  ,8BMMBBBBBBi     ,,:,,     ,,, , ,   , , , :,::ii::i::
    :      iZMOMOMBBM2::::::::::,,,,     ,,,,,,:,,,::::i:irr:i:::,
    i   ,,:;u0MBMOG1L:::i::::::  ,,,::,   ,,, ::::::i:i:iirii:i:i:
    :    ,iuUuuXUkFu7i:iii:i:::, :,:,: ::::::::i:i:::::iirr7iiri::
    :     :rk@Yizero.i:::::, ,:ii:::::::i:::::i::,::::iirrriiiri::,
     :      5BMBBBBBBSr:,::rv2kuii:::iii::,:i:,, , ,,:,:i@petermu.,
          , :r50EZ8MBBBBGOBBBZP7::::i::,:::::,: :,:,::i;rrririiii::
              :jujYY7LS0ujJL7r::,::i::,::::::::::::::iirirrrrrrr:ii:
           ,:  :@kevensun.:,:,,,::::i:i:::::,,::::::iir;ii;7v77;ii;i,
           ,,,     ,,:,::::::i:iiiii:i::::,, ::::iiiir@xingjief.r;7:i,
        , , ,,,:,,::::::::iiiiiiiiii:,:,:::::::::iiir;ri7vL77rrirri::
         :,, , ::::::::i:::i:::i:i::,,,,,:,::i:i:::iir;@Secbone.ii:::

```

### Support - 支持  
### Dos - 文档（更多文档）  
### Contact - hsinchienwang@gmail.com  提交bug，功能要求，提交补丁，加入邮件列表，得到通知，加入用户或开发开发区群的介绍）  

***
分界线

# Authors and acknowledgment - 贡献者和感谢
### Wxj

# License - 版权信息（版权和许可信息（或阅读许可证）、法律声明）
当然是opensource辣

# 延伸阅读
nope
  