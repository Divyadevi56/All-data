

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Logout")
public class Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Logout() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession httpSession=request.getSession();
		if(httpSession.getAttribute("username")!=null)
		{
			httpSession.setAttribute("username", null);
			httpSession.invalidate();
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}else {
			request.setAttribute("errmsg","Login First!!");
			request.getRequestDispatcher("error.jsp").include(request, response);
		}
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
		

}
