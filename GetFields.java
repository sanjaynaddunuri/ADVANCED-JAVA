package hiddenfromfields;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetFields
 */
@WebServlet("/get")
public class GetFields extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetFields() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String s1=request.getParameter("book1");
		String s2=request.getParameter("book2");
		String s3=request.getParameter("book3");
		PrintWriter pw=response.getWriter();
		pw.println("<html><body bgcolor =  wheat text= purple><h1><center><h1>");
		pw.println("<u>Selected books </u></h1>");
		if(!s1.equals("null"))
		{
			pw.println(s1+"<br><br>");
		}
		if(!s2.equals("null"))
		{
			pw.println(s2+"<br><br>");
		}
		if(!s3.equals("null"))
		{
			pw.println(s3+"<br><br>");
		}
		pw.println("</center></body></html>");
	}

}
