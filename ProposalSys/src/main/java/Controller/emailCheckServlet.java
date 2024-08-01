package Controller;

import java.io.IOException; 
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import DAO.MemberDAO;

@WebServlet("/emailCheck.do")
public class emailCheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String email=request.getParameter("email");
		MemberDAO mDAO=MemberDAO.getInstance();
		int result=mDAO.confirmEmail(email);
		request.setAttribute("email", email);
		request.setAttribute("result", result);
		RequestDispatcher dis=request.getRequestDispatcher("emailCheck.jsp");
		dis.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
