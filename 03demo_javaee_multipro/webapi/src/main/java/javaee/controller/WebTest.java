package javaee.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import javaee.service.ServiceTest;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Api(description = "gradle多模块构建成功测试")
public class WebTest extends HttpServlet {
    @ApiOperation(value = "gradle多模块构建" ,  notes="测试")
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
        ServiceTest serviceTest = new ServiceTest();
        String s =  serviceTest.showService() + "我是webapi";
        
        resp.setContentType("text/html charset=utf-8");
        resp.setCharacterEncoding("utf-8");

        resp.getWriter().println(s);
    }
}

