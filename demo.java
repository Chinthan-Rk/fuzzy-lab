import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.*;


public class demo extends HttpServlet
{
  public void doPost(HttpServletResponse response, HttpServletRequest request) throws IOException
{
 PrintWriter output = response.getWriter();
 String username = request.getParameter("username");
 String password = request.getParameter("password");
 
 output.println("<html>");
 output.println("<body>");
 
if(username.equals("chinthan") && password.equals("chinthan"))
{
 output.println("<h1>WELCOME</h1>");
}
else
output.println("<h1>INVALID</h1>");

output.println("</body>");
output.println("</html>");
output.close();

	
}
}
