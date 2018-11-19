## 包装器的使用  
|--gradle
|   |--wrapper  
|       |--gradle-wrapper.jar  包装器微类库包含下载和解包Gradle运行时的逻辑  
|       |--gradle-wrapper.properties  包装器元信息包含已下载Gradle运行时的存储位置和原始URL    
|--gradlew        //扫行Gradle命令的包装器脚本   
|--gradlew.bat    //扫行Gradle命令的包装器脚本  

建立gradle wrapper  task后，运行gradle wrapper命令
如果没有建立task指定版本，则会根据gradle运行时的当前版本来生成包装器文件  
```
task wrapper (type:Wrapper){
    gradleVersion = '5.4.1'   //指定版本
    //distributionUrl = 'http://foo.com/gradle/dists'  获取gradle包装器的URL
    //distributionPath = 'gradle-dists'  包装器被解压缩后存放的相对路径
}
```
下载的包装器文件应该提交到版本控制系统中。  
ref:<a href=http://gradle.org/docs/current/dsl/org.gradle.api.tasks.wrapper.Wrapper.html>gradle dsl</a>  