package sboot.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sboot.service.ServiceTest;

@Api(description = "gradle多模块构建成功测试")
@RestController
@RequestMapping("/test")
public class WebTest {
    @ApiOperation(value = "gradle多模块构建" ,  notes="测试")
    @RequestMapping("/showall")
    public String showAll() {
        ServiceTest serviceTest = new ServiceTest();
        return serviceTest.showService() + "我是webapi";
    }
}

