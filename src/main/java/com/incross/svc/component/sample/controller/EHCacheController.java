package com.incross.svc.component.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.incross.svc.component.sample.service.EHCacheService;

/**
 * @FileName : EHCacheController.java
 * @Project : IncrossSpring
 * @Date : 2013. 1. 4.
 * @작성자 : 이남규
 * @프로그램설명 : ehcache 사용 방법에 대한 샘플
 */
@Controller
public class EHCacheController {

	@Autowired
	private EHCacheService ehCacheServlce;

	@RequestMapping(value = "/ehcache", method = RequestMethod.GET)
	@ResponseBody
	public String ehcache(@RequestParam String id) {
		long startTime = System.currentTimeMillis();
		List<String> result = ehCacheServlce.cache(id, "1111");
		System.out.println(result);
		long endTime = System.currentTimeMillis();
		long processTime = endTime - startTime;

		String body = processTime + " millisecond";
		return body;
	}

	@RequestMapping(value = "/ehcacheEvict", method = RequestMethod.GET)
	@ResponseBody
	public String ehcacheEvict(@RequestParam String id) {
		ehCacheServlce.cacheEvict(id, "1111", 20);
		return "success!!";
	}
}
