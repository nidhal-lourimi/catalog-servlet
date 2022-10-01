package com.nidhallourimi.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet( name = "servlet", urlPatterns = "/catalog-servlet",asyncSupported = true)
public class CatalogServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append(request.getParameter("name"));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        returnResponse(request, response);
        /** asyc code*/
        /*       AsyncContext asyncContext = request.startAsync();
       asyncContext.start(new Runnable() {
           @Override
           public void run() {
               try {
                   Thread.sleep(5000);
                   System.out.println("Print the response");
                   System.out.println("Response returned by :"+Thread.currentThread().getName());
                   returnResponse(request, response);
                   asyncContext.complete();
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               } catch (IOException e) {
                   throw new RuntimeException(e);
               }
           }
       });

        System.out.println("Initial request by: "+Thread.currentThread().getName());*/

    }

    private static void returnResponse(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String name = request.getParameter("name");
        String manufacture = request.getParameter("manufacture");
        String sku = request.getParameter("sku");

        response.setHeader("someHeaders", "someHeaderValue");
        response.addCookie(new Cookie("someCookie", "SomeCookieValue"));

        Catalog.addItem(new CatalogItem(name, manufacture, sku));

        request.setAttribute("message", name);
        RequestDispatcher dispatcher = request.getRequestDispatcher("list.jsp");
        dispatcher.forward(request, response);

        /** creating html with hard code java*/
/*        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head></head>");
        out.println("<body>");
        out.println("<table>");
        for(CatalogItem item:Catalog.getItems()){
            out.println("<tr>");
            out.println("<td>");
            out.println(item.getName());
            out.println("</td>");
            out.println("</tr>");
        }
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
    }*/

    }
}

