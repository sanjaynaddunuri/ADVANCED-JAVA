package basics;

import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class Image
 */
@WebServlet("/image")
public class Image extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public Image() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletOutputStream sos=response.getOutputStream();
		FileInputStream fis =new FileInputStream("C:/movies/Screenshot 2025-03-31 112615.png");
		int n=fis.available();
		byte[] b=new byte[n];
		fis.read(b);
		sos.write(b);
		fis.close();
	}

}
