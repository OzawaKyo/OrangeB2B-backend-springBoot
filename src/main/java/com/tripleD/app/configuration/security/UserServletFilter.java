package com.tripleD.app.configuration.security;

import org.slf4j.MDC;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

/**
 *
 * @author CHICHI Hamza
 *
 */

@Component
public class UserServletFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String ip = request.getRemoteAddr();
		MDC.put("ip", ip);
		chain.doFilter(request, response);
	}
}
