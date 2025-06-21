package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class CounteFilter
 */
@WebFilter("/homepage.html")
public class CounteFilter extends HttpFilter  {
       int count=0;
    /**
     * @see HttpFilter#HttpFilter()
     */
    public CounteFilter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		count++;
		ServletContext sc = request.getServletContext();
		sc.setAttribute("views", count);
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	
}
