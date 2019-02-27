// Import required java libraries

import java.io.*;
import java.util.Date;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

// Extend HttpServlet class
@WebServlet("/HelloWorld2")
public class Hello2 extends HttpServlet {

    public void init() throws ServletException {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Set response content type
        response.setContentType("text/html");

        // Actual logic goes here.
        PrintWriter out = response.getWriter();
        out.println("<h1>Hello World Servlet pt 2</h1>");
        out.println("<p>"+ new Date().toString() +"</p>");
    }

}