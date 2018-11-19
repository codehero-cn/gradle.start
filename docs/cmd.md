## 语法：gradle [参数] 命令名 [命令名]  //可以使用gradle 命令(驼峰式缩写)，可以同时接多个命令名  
项目根目录下运行,Gradle构建脚本的默认的名称是build.gradle.  
参数  
-？ ,h,--help  打印所有可用选项，包含描述信息      
-x: 智能排除任务  
-b  默认buildfile.gradle  此选项执行具体的脚本，eg gradle -b test.gradle     
日志选项  
-i,--info: 日志级别改成INFO级别   
-s,--stacktrace: 打印执行期间发生错误时的堆栈踪迹信息  
-q,--quiet：减少日志信息  
--offline  离线模式运行构建   
-D,--system-prop:和所有java进程一样，提供一个系统参数  
-P, --project-prop :项目参数是构建脚本中可用变量。向构建脚本中传入参数  
### 帮助任务  
gradle tasks //显示所有可运行的任务  gradle tasks --all 查看当前build.gradle 下有多少个Task  
gradle properties  //显示项目可用属性    
### 版本信息
-v  --version 版本信息  
### 守护进程
--daemon ：守护进程   
--no-daemon:命令行选项，构建时不使用守护进程  
--shop :停止守护进程  
gradle --stop 手动停止守护进程   
<a href="http://gradle.org/docs/current/userguide/gradle_daemon.html">ref:office</a>
### gradle init  初始化项目
如果已有build.gradle或settings.gradle文件，命令没用

### gradle build 编译源码，运行测试，组装jar.  
UP-TO-DATE 说明这个任务被跳过了  
## gradle dependencies  显示依赖  

### gradle war  

### gradle javadoc 
生成javadoc文档  


### gretty:
appRun  运行web服务器  

