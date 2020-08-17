package com.wuhao.servlet;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author: wuhao.w
 * @Date: 2020/7/4 16:26
 */
@Data
@Slf4j
public class HelloWorldServlet extends HttpServlet {

    private String msg;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.print(msg);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.print(msg);
    }

    @Override
    public void init() throws ServletException {
        super.init();
        msg = this.getInitParameter("msg");
    }
}
