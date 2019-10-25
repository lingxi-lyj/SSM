package com.lyj.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
//这里的loadOnStarup值指定为2，代表是跟随容器一起启动，
@WebServlet(urlPatterns = {},loadOnStartup = 2)
public class WebPathInitServlet extends HttpServlet {
    //在整体的应用上下文当中存储了一个ctx的值，用它引用上下文的路径。
    @Override
    public void init(ServletConfig config) throws ServletException {
        config.getServletContext().setAttribute("ctx",config.getServletContext().getContextPath());
        super.init(config);

    }
}
