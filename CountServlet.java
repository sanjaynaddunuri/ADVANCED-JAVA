package basics;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class CountServlet
 */
@WebServlet("/CountServlet")
public class CountServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       int count=0;
    /**
     * @see GenericServlet#GenericServlet()
     */
    public CountServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		count++;
		PrintWriter pw=response.getWriter();
		pw.println("<html><body bgcolor=green text=blue><h1>");
		pw.println("This page os viewed "+count+" times");
		pw.println("</h1></html></body");
	}

}
