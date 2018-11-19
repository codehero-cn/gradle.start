```
dependencies {
        //导入本地的依赖包
        compile fileTree(dir: 'libs', include: ['*.jar'])
        compile "org.springframework:spring-webmvc:$springVersion"
        testCompile group: 'junit', name: 'junit', version: '4.12'
    }
}
```