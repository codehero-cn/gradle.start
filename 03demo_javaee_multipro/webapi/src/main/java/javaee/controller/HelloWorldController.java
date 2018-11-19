package javaee.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Api(description = "hello")
public class HelloWorldController extends HttpServlet {
    @ApiOperation(value = "gradle多模块构建" ,  notes="测试")
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);

        resp.setContentType("text/html charset=utf-8");
        resp.setCharacterEncoding("utf-8");

        resp.getWriter().println("Hello World I'm comming!!!");
        
    }
}