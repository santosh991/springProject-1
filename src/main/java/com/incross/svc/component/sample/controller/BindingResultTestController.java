package com.incross.svc.component.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.incross.svc.component.user.domain.User;

/**
 * @FileName : BindingResultTestController.java
 * @Project : myProject
 * @Date : 2013. 1. 24.
 * @작성자 : 이남규
 * @프로그램설명 : message 프로퍼티, Validator 사용 방법에 대한 샘플 코드
 */
@Controller
public class BindingResultTestController {

	@Autowired
	private Validator userValidator;

	@RequestMapping(value = "/bindingResultTest", method = RequestMethod.GET)
	public String test(@ModelAttribute User user, BindingResult bindingResult) {
		userValidator.validate(user, bindingResult);
		if (bindingResult.hasErrors()) {
			return "bindingResult";
		} else {
			return "userList";
		}
	}
}
