package hiddenformfield;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SetField
 */
@WebServlet("/set")
public class SetField extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SetField() {
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
		pw.println("Your Books are added to cart...!</h1>");
		pw.println("<form action =get>");
		pw.println("<input type = hidden name =book1 value="+s1+">");
		pw.println("<input type = hidden name =book2 value="+s2+">");
		pw.println("<input type = hidden name =book3 value="+s3+">");
		pw.println("<input type =submit value=next>");
		pw.println("</center></body></html>");
		
		
		}

}
