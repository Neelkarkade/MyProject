package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/readReg")
public class RegistrationHello_Text_TextHtml extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public RegistrationHello_Text_TextHtml() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("get");
	PrintWriter out = response.getWriter();
	response.setContentType("text/html");//TO solve this problem A servlet can write two content (text and html) content Hell ,This Will Print (Hell [      ] )  
	out.println("Hello");//It will write content Back To Html,It will Print( "Hello")
	out.println("<input type='text'/>'");//This Html in web page not write as field it write as text, it print (Hello<input type="text'/>) To solve this problem line 23s
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		// TODO Auto-generated method stub
  System.out.println("Post");
	}

}
