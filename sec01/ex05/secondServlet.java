package sec01.ex05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class secondServlet
 */
@WebServlet("/second5")
public class secondServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		
		out.println("<html><body>");
		out.println("Dispatch 이용한 실습입니다." + "<br>");
		out.println("</body></html>");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
