package sboot.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(description = "hello")
@RestController
public class HelloWorldController {
    @ApiOperation(value = "gradle多模块构建" ,  notes="测试")
    @RequestMapping("/hello")
    public String index() {
        return "Hello World I'm comming!!!";
    }
}