package com.incross.svc.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		System.out.println("###############################################################");
		HandlerMethod method = (HandlerMethod) handler;
		System.out.println("getBean() : " + method.getBean());
		System.out.println("getMethod() : " + method.getMethod());
		System.out.println("getReturnType() : " + method.getReturnType());
		System.out.println("getMethodAnnotation() : " + method.getMethodAnnotation(RequestMapping.class));
		System.out.println("###############################################################");

		return true;
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
		System.out.println("postHandle!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
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
		System.out.println("이곳에서 에러 처리를 하자.");
	}
}
