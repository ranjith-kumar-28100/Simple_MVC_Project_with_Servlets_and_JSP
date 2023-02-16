package inc.codeman.servlet.servletdemo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MvcDemoServlet")
public class MvcDemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public MvcDemoServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//step 1 - Add Data
		String[] students = {"Ranjith","Cidharth","Kirupa","Vijay"};
		request.setAttribute("studentList", students);
		//step 2 - Get Request Dispatcher
		RequestDispatcher dispatcher = request.getRequestDispatcher("/view_students.jsp");
		//step 3 - Forward the request to JSP 
		dispatcher.forward(request, response);
	}

	
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
