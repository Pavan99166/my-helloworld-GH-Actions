package com.example;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().write("<h1>Hello, World!</h1>");
    }
}
