package com.nidhallourimi.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "servlet", value = "/catalog-servlet")
public class CatalogServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.getWriter().append(request.getParameter("name"));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name=request.getParameter("name");
        String manufacture=request.getParameter("manufacture");
        String sku=request.getParameter("sku");
        Catalog.addItem(new CatalogItem( name,manufacture,sku));
        response.setHeader("someHeaders","someHeaderValue");
        response.addCookie(new Cookie("someCookie","SomeCookieValue" ));
        PrintWriter out =response.getWriter();
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
    }

}

