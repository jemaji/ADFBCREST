package com.test.materiales;

import java.io.IOException;

import java.util.stream.Collectors;

import java.util.stream.Stream;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(filterName = "RESTFilter", servletNames = { "RESTServlet" })
public class RESTFilter implements Filter {
    private FilterConfig _filterConfig = null;

    public void init(FilterConfig filterConfig) throws ServletException {
        _filterConfig = filterConfig;
    }

    public void destroy() {
        _filterConfig = null;
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,
                                                                                                     ServletException {
//        System.out.println("TEST BEFORE + " + getJsonData(request));
        chain.doFilter(request, response);
        System.out.println("TEST AFTER");
    }
    
    private String getJsonData(ServletRequest request) throws IOException {
        request.getReader().mark(1);
        Stream<String> stream = request.getReader().lines();
        String jsonData = stream.collect(Collectors.joining());
        request.getReader().reset();
        return jsonData;        
    }
}
