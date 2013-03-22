package com.incross.svc.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * @FileName : LogHandlerInterceptor.java
 * @Project : springProject
 * @Date : 2013. 2. 21.
 * @작성자 : 이남규
 * @프로그램설명 :
 */
public class LogHandlerInterceptor extends HandlerInterceptorAdapter {

	private static Logger log = LoggerFactory.getLogger(LogHandlerInterceptor.class);

	/**
	 * <pre>
	 * preHandle
	 *
	 * <pre>
	 * @param request
	 * @param response
	 * @param handler
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		String path = request.getServletPath();
		String addr = request.getRemoteAddr();
		String scheme = request.getScheme();
		log.info("##############################################################################");
		log.info("## REQUEST=" + scheme + "://" + addr + ", ACTION=" + path + getParameter(request));
		log.info("##############################################################################");
		return true;
	}

	private String getParameter(HttpServletRequest req) {
		return "파라미터 뽑기";
	}

	/**
	 * <pre>
	 * afterCompletion
	 *
	 * <pre>
	 * @param request
	 * @param response
	 * @param handler
	 * @param ex
	 * @throws Exception
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
		log.info("######################################################");
		log.info("ex : " + ex);
		log.info("######################################################");
	}
}
