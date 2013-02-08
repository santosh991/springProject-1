package com.incross.svc.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;


/**
 * @FileName : UserSecurityInterceptor.java
 * @Project : IncrossSpring
 * @Date : 2012. 12. 13.
 * @작성자 : 이남규
 * @프로그램설명 :
 */
public class UserSecurityInterceptor extends HandlerInterceptorAdapter {

	private static Logger log = LoggerFactory.getLogger(UserSecurityInterceptor.class);

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

		HandlerMethod method = (HandlerMethod) handler;
		log.info("###############################################################");
		log.info("getBean() : " + method.getBean());
		log.info("getMethod() : " + method.getMethod());
		log.info("getReturnType() : " + method.getReturnType());
		log.info("getMethodAnnotation() : " + method.getMethodAnnotation(RequestMapping.class));
		log.info("###############################################################");

		return true;
	}

	private String getParameter(HttpServletRequest req) {
		return "파라미터 뽑기";
	}

	/**
	 * <pre>
	 * postHandle
	 *
	 * <pre>
	 * @param request
	 * @param response
	 * @param handler
	 * @param modelAndView
	 * @throws Exception
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
		log.info("postHandle!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
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
		log.info("이곳에서 에러 처리를 하자.");
	}
}
