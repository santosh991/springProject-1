package com.incross.svc.component.sample.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @FileName : InterceptorLogController.java
 * @Project : springProject
 * @Date : 2013. 2. 21.
 * @작성자 : 이남규
 * @프로그램설명 :
 */
@Controller
public class InterceptorLogController {

	/**
	 * <pre>
	 * log1
	 *
	 * <pre>
	 * @param req
	 */
	@RequestMapping(value = "/log1", method = RequestMethod.GET)
	public void log1(HttpServletRequest req) {
		throw new NullPointerException("null 포인트 에러");
	}
}
