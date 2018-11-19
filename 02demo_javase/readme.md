### 1.设置utf-8编码：  
问题：有中文的代码或注释中出现非规律的报错"编码 GBK 的不可映射字符",就像没规律的中文乱码。  
解决：网上说Gradle 2.0以上,需要把tasks.withType(Compile)中的Compile改为JavaCompile   
<pre><code>
tasks.withType(JavaCompile) {   
    options.encoding = "UTF-8"
}
</code></pre>
测试用例:eg/src/main/java/cn/codehero/gradle/TestUtf8Gbk.java "用于测试"改成"凌"就会报错。   
参考:  
a.[怎么处理警告：编码 GBK 的不可映射字符](http://zhidao.baidu.com/link?url=gfPWPtEvlPot7EpVCfWabp9InldwbscSiBYNZWj9EOhs51iga6vRTdUx1lj1P6lyMz4Agk6tKs4dzXA_meThKa)  
b.[为Gradle添加UTF-8支持](http://www.tuicool.com/articles/eYbIZzv)