package com.incross.svc.component.user.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
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

	@Test(expected = RuntimeException.class)
	public void 트랜잭션롤백테스트_실패case() {
		User user = new User();
		user.setUserId("abc1111");
		user.setPassword("1111");
		user.setUserName("kyu");

		User user1 = new User();
		user1.setUserId("abc2222");
		user1.setPassword("2222");
		user1.setUserName("kyu");

		userService.insertUser(user, user1);
	}

}
