## ref:https://www.cnblogs.com/qiangxia/p/4826532.html

buildscript中的声明是gradle脚本自身需要使用的资源。可以声明的资源包括依赖项、第三方插件、maven仓库地址等。
而在build.gradle文件中直接声明的依赖项、仓库地址等信息是项目自身需要的资源。

buildscript代码块中的repositories和dependencies的使用方式与直接在build.gradle文件中的使用方 式几乎完全一样。
唯一不同之处是在buildscript代码块中你可以对dependencies使用classpath声明。该classpath声 明说明了在执行其余的build脚本时，
class loader可以使用这些你提供的依赖项。这也正是我们使用buildscript代码块的目的。
而如果你的项目中需要使用该类库的话，就需要定义在buildscript代码块之外的dependencies代码块中。

build.gradle 
```
repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    compile 'org.springframework.ws:spring-ws-core:2.2.0.RELEASE',
            'org.apache.commons:commons-csv:1.0'
}


buildscript {
    repositories {
        mavenLocal()
        mavenCentral()
    }

    dependencies {
        classpath 'org.apache.commons:commons-csv:1.0'
    }
}

import org.apache.commons.csv.*

task printCSV() {
    doLast {
        def records = CSVFormat.EXCEL.parse(new FileReader('config/sample.csv'))
        for (item in records) {
            print item.get(0) + ' '
            println item.get(1)
        }

    }
}
```