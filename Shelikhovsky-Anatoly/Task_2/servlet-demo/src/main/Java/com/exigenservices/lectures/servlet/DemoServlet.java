package com.exigenservices.lectures.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * Created by Tolya Shelikhovsky
 */
public class DemoServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        res.setContentType("text/html");
        PrintWriter writer = res.getWriter();
        Date date = new Date();
        writer.println("<html>");
        writer.println("<head><title>Shel</title></head>");
        writer.println("<body>" + date.toString() + "</body>");
        writer.println("</html>");
        writer.close();
    }
}
