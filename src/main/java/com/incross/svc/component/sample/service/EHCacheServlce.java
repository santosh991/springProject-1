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

	/**
	 * <pre>
	 * cache
	 * cacheExample라는 이름의 캐쉬 저장소에 키는 #id로 데이터를 캐쉬하겠다는 의미이다.
	 * <pre>
	 * @param id
	 * @param passwd
	 * @return
	 */
	@Cacheable(value="cacheExample", key="#id")
	public List<String> cache(String id, String passwd) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return Arrays.asList("1", "2", "3");
	}

	/**
	 * <pre>
	 * cacheEvict
	 * cacheExample라는 이름의 캐쉬 저장소에 있는 키 #id를 삭제하겠다는 의미
	 * <pre>
	 * @param id
	 * @param passwd
	 * @param age
	 */
	@CacheEvict(value="cacheExample", key="#id")
	public void cacheEvict(String id, String passwd, int age) {
	}
}
