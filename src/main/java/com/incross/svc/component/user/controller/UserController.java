package com.incross.svc.component.user.controller;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.incross.svc.component.user.domain.User;
import com.incross.svc.component.user.service.UserService;

/**
 * @FileName : UserController.java
 * @Project : IncrossSpring
 * @Date : 2012. 12. 4.
 * @작성자 : 이남규
 * @프로그램설명 :
 */
@Controller
@RequestMapping("/user")
public class UserController {

	private static Logger log = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userService;

	public UserController() {
		System.out.println("###################################################");
		System.out.println("create bean : " + getClass().getName());
		System.out.println("###################################################");
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(@ModelAttribute User user, Model model) {
		List<User> userList = userService.getUserList();
		model.addAttribute(userList);
		user.setUserId("lng1982");

		log.debug("test55555555555555555");
		return "userList";
	}

	@RequestMapping(value = "/rest/{id}/{age}", method = RequestMethod.GET)
	public String restTest(@PathVariable int age, @PathVariable String id, User user, Model model) {
		List<User> userList = userService.getUserList();
		model.addAttribute(userList);
		user.setUserId(id);
		user.setAge(age);
		return "userList";
	}

	@RequestMapping(value = "/regist", method = RequestMethod.GET)
	public String regist(@ModelAttribute User user, HttpSession session, Model model) {
		userService.insertUser(user);
		Future<Boolean> result = userService.sendEmail();
		session.setAttribute("asyncMsg", result);
		return "userRegist";
	}

	@RequestMapping(value = "/sessionTest", method = RequestMethod.GET)
	public String sessionTest(@ModelAttribute User user, HttpSession session, Model model) throws InterruptedException, ExecutionException {
		@SuppressWarnings("unchecked")
		Future<Boolean> result = (Future<Boolean>) session.getAttribute("asyncMsg");

		if (result.isDone()) {
			System.out.println("세션에 저장되어 있는 값은? : " + result.get());
		} else {
			System.out.println("뭐지?");
		}

		return "userRegist";
	}

	public void controllerTest(HttpServletRequest req, HttpServletResponse res) {
		String param = req.getParameter("param");
		System.out.println(param);
		System.out.println(req.getSession().getAttribute("sessionTest"));
	}

	@RequestMapping(value = "/requestToViewTranslator", method = RequestMethod.GET)
	public void requestToViewTranslator(@RequestParam(value = "name", required = false) String name, Model model, HttpServletRequest request) {
	}


}
