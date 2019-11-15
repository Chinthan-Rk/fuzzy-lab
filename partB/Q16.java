package com.company.partB;




import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test extends HttpServlet
{
    public void doPost(HttpServletResponse response,HttpServletRequest request) throws IOException
    {
        response.setContentType("text/html");
        PrintWriter output = response.getWriter();
        String name = request.getParameter("name");
        String pass = request.getParameter("pass");

        output.println("<html>");
        output.println("<body>");
        if(name.equals("chinthan") && pass.equals("chin"))
        {
            output.println("<h1>WELCOME</h1>");
        }
        else
            output.println("<h1>INVALID USER</h1>");
        output.println("</body");
        output.println("</html");
        output.close();


    }

}
