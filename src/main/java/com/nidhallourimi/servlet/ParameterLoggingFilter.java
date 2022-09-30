package com.nidhallourimi.servlet;

import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebFilter(urlPatterns = "/catalog-servlet",asyncSupported = true)
public class ParameterLoggingFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        request.getParameterMap().entrySet().stream().forEach(entry ->{
            System.out.println(String.format("%s:%s", entry.getKey(), entry.getValue()[0]));
        });
        chain.doFilter(request, response);
    }

}
