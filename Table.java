package basics;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class Table
 */
@WebServlet("/table")
public class Table extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public Table() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		pw.println("<html><body bgcolo=babypink text=b=lightblue><table border=5>");
		for (int i=1;i<=100; i++)
		{
			pw.println("<tr>");
			pw.println("<td> 5 </td>");
			pw.println("<td> X </td>");
			pw.println("<td>" + i + "</td>");
			pw.println("<td> =  </td>");
			pw.println("<td>" + 5*i +"</td>");
			pw.println("</tr>");
		}
		pw.println("</table></html></body>");
	}

}
