## 项目介绍:
研究gradle的配置,新建项目可以从此开始  
  

## 技术列表:
gradle 5.4.1  javase  javaee    
springboot springweb   
web类型项目都带了swagger  

## 文件结构
 demo_basic //基本使用  
 |--/task  task实验     
 |--/util  各种功能文件   
      |--util.config.gradle   包装器   
      |--util.ide.gradle   生成ide配置文件    
 
 demo_projectlayer //分层型多项目结构  
 demo_projectflat  //平面型多项目结构  
 demo_javase   //javase(java插件等+多个src目录等)  
 demo_javaee  //主讲javaee(+gretty)    
 demo_javaee——multipro  //主讲多项目   
 demo_springboot  //spring(+swagger)   
 demo_springboot_multipro  //主讲多项目使用。    
 demo_springweb   主讲springweb  
 demo_springweb_multipro   主讲springweb多项目  


## 安装使用
1.gradle面板:attach gradle project 把所有的demo都加入进去,这样就可以在面板中操作每一个demo,此操作会影响.idea文件夹中文件,
  所以要把.idea加入到git中进行版本控制(待定)。  
  

### todo 
把log4j换成spring用的日志。
javaee.basic中的配置提取到这里来  
发布版本实验:读取一个文件中的版本号，打印出来  

