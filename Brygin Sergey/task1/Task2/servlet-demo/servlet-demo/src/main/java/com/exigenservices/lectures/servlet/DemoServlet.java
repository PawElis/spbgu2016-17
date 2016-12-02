package com.exigenservices.lectures.servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;


/**
 * Created by Alex on 06.10.2016.
 */
public class DemoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        res.setContentType("text/html");

        PrintWriter writer = res.getWriter();
        writer.println("<html>");
        writer.println("<head><title>My first page</title></head>");
        writer.print("<body>time on server: ");
        writer.println(sdf.format(cal.getTime()));
        writer.println("</body>");
        writer.println("</html>");
        writer.close();
    }

}
