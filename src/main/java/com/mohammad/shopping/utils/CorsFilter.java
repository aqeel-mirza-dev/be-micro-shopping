package com.mohammad.shopping.utils;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;

/*
@Order(Ordered.HIGHEST_PRECEDENCE - 2)
@Component
public class CorsFilter implements Filter {
    //TODO: filter internal api requests only
    private final Logger log = LoggerFactory.getLogger(CorsFilter.class);

    public CorsFilter() {
        log.info("SimpleCORSFilter init");
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
            throws IOException, ServletException {

        HttpServletResponse response = (HttpServletResponse) res;

        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "GET, POST, DELETE, OPTIONS");
       // response.setHeader("Access-Control-Allow-Headers", getAllowedHeaders());
       // response.setHeader("Access-Control-Expose-Headers", getAllowedHeaders());

        chain.doFilter(req, res);
    }

    private String getAllowedHeaders() {
        StringBuilder sb = new StringBuilder();
        sb.append(HttpHeaders.ACCEPT).append(", ")
                .append(HttpHeaders.CONTENT_TYPE).append(", ")
                .append(HttpHeaders.AUTHORIZATION).append(", ")
                .append(Constants.Header.IF_MODIFIED_SINCE).append(", ")
                .append(Constants.Header.CONTENT_DISPOSITION).append(", ")
                .append(Constants.Header.APPLICATION_ID).append(", ")
                .append(Constants.Header.X_AUTH_TOKEN).append(", ");

        return sb.toString();

    }

    @Override
    public void init(FilterConfig filterConfig) {
    }

    @Override
    public void destroy() {
    }

}
 */