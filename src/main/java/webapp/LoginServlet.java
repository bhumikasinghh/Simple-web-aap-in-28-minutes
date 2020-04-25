package webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		
//		PrintWriter out=response.getWriter();
//		out.println("<html>");
//		out.println("<head>");
//		out.println("<title>YAHOO</title>");
//		out.println("</head>");
//		out.println("<body>");
//		out.println("MY FIRST SERvLET");
//		out.println("</body>");
//		out.println("</html");
	}

}