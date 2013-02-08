package com.incross.svc.component.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @FileName : RequestMappingTestController.java
 * @Project : myProject
 * @Date : 2013. 1. 22.
 * @작성자 : 이남규
 * @프로그램설명 : 리퀘스트 맵핑 테스트 샘플
 */
@Controller
public class RequestMappingTestController {

	@RequestMapping(value = "/cookieTest", method = RequestMethod.GET)
	@ResponseBody
	public String cookieTest(@CookieValue(value = "auth", required = false, defaultValue = "NONE") String auth
			, @RequestHeader(value = "Host", required = false, defaultValue = "127.0.0.1") String host
			, @RequestHeader(value = "Keep-Alive", required = false, defaultValue = "1000") long keepAlive) {

		System.out.println(host);
		System.out.println(keepAlive);
		return auth;
	}

	@RequestMapping(value = "/requestBodyTest", method = RequestMethod.POST)
	public String requestBodyTest(@RequestBody String body) {
		return body;
	}
}
