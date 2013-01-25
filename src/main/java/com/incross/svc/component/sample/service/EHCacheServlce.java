package com.incross.svc.component.sample.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @FileName : EHCacheServlce.java
 * @Project : IncrossSpring
 * @Date : 2013. 1. 4.
 * @작성자 : 이남규
 * @프로그램설명 :
 */
@Service
public class EHCacheServlce {

	@Cacheable(value="cacheExample", key="#id")
	public List<String> cache(String id, String passwd) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return Arrays.asList("1", "2", "3");
	}

	@CacheEvict(value="cacheExample", key="#id")
	public void cacheEvict(String id, String passwd, int age) {
	}
}
