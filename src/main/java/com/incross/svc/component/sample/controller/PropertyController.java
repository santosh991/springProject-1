package com.incross.svc.component.sample.controller;

import java.util.Properties;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.incross.svc.component.user.domain.User;

/**
 * @FileName : PropertyController.java
 * @Project : myProject
 * @Date : 2013. 1. 17.
 * @작성자 : 이남규
 * @프로그램설명 :
 */
@Controller
public class PropertyController {

	@Value("#{baseConfig['test']}")
	private String test;

	@Resource
	private Properties baseConfig;

	@Resource
	private Properties systemProperties;

	@Resource
	private Properties systemEnvironment;

	@Autowired
	private Environment env;

	@RequestMapping(value = "/confTest", method = RequestMethod.GET)
	@ResponseBody
	public String list(@ModelAttribute User user, Model model) {
		System.out.println(test);
		System.out.println("test=" + baseConfig.get("test"));
		System.out.println("os.name" + systemProperties.get("os.name"));
		System.out.println("Path=" + systemEnvironment.get("Path"));
		System.out.println("os.name=" + env.getProperty("os.name"));
		System.out.println("test=" + env.getProperty("test"));

		return "success";
	}

}
