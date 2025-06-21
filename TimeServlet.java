package basics;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class TimeServlet
 */
@WebServlet("/time")
public class TimeServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public TimeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */ 
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		LocalTime l=LocalTime.now();
		PrintWriter pw=response.getWriter();
		pw.println("<html><head> <meta http-equiv=refresh content=1></head><body bgcolor =\"lightblue\" text=\"voilet\">");
		pw.println(l);
		pw.println("</html></body");
		
	}

}
