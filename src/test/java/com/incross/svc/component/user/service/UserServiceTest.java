package com.incross.svc.component.user.service;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.incross.svc.component.user.domain.User;


/**
 * @FileName : UserServiceTest.java
 * @Project : springProject
 * @Date : 2013. 1. 29.
 * @작성자 : 이남규
 * @프로그램설명 :
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/test-application-context.xml"})
@ActiveProfiles("dev")
public class UserServiceTest {

	@Autowired
	private UserService userService;

	@Test(expected = DuplicateKeyException.class)
	public void 트랜잭션AOP테스트() {
		User user = new User();
		user.setUserId("lng1982");
		user.setUserName("이남규");
		user.setPassword("1111");

		userService.insertUser(user);
	}

	@Test
	public void 특수문자엔터입력확인테스트() {
		User user = new User();
		user.setUserId("lng1983\n");
		user.setUserName("이남규");
		user.setPassword("2222");

		int resultCnt = userService.insertUser1(user);
		assertThat(resultCnt, is(1));
	}
}
