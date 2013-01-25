package com.incross.svc.component.sample.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.FlashMap;
import org.springframework.web.servlet.support.RequestContextUtils;

/**
 * @FileName : FlashMapController.java
 * @Project : myProject
 * @Date : 2013. 1. 22.
 * @작성자 : 이남규
 * @프로그램설명 :
 */
@Controller
public class FlashMapController {

	@RequestMapping(value = "/flashMap", method = RequestMethod.GET)
	public String test(HttpServletRequest request) {
		FlashMap flashMap = RequestContextUtils.getOutputFlashMap(request);
		flashMap.put("flashMapTest", "새로운 사용자가 등록됐습니다.");
		flashMap.setTargetRequestPath("/user/list");
		flashMap.startExpirationPeriod(10);

		return "redirect:/user/list";
	}
}
