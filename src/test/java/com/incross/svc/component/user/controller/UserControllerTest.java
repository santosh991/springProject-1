package com.incross.svc.component.user.controller;

import javax.servlet.http.HttpSession;

import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;


/**
 * @FileName : UserControllerTest.java
 * @Project : myProject
 * @Date : 2013. 1. 18.
 * @작성자 : 이남규
 * @프로그램설명 :
 */
public class UserControllerTest {

	@Test
	public void controllerTest() {

		MockHttpServletRequest req = new MockHttpServletRequest("GET", "/user/list");
		req.addParameter("param", "controllerTest");

		HttpSession session = req.getSession();
		session.setAttribute("sessionTest", "I am session!!");
		req.setSession(session);

		MockHttpServletResponse res = new MockHttpServletResponse();

		UserController userController = new UserController();
		userController.controllerTest(req, res);
	}
}
