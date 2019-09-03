

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.genpact.model.Product;
import com.genpact.service.ProductSeriveImp1;
import com.genpact.service.ProductService;

public class InsertProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public InsertProductServlet() {
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int m_no = Integer.parseInt(request.getParameter("number1"));
		String m_name = request.getParameter("name");
		int m_price = Integer.parseInt(request.getParameter("number2"));
		Product product = new Product(m_no,m_name,m_price);
		ProductService productService = new ProductSeriveImp1();
		if(productService.insertProduct(product)) {
			out.println("<h2>Wel-Come "+m_no+" "+m_name+" "+m_price+"</h2>");
		}
		else {
			//out.println("Invalid username/password");
		}

			}

}
