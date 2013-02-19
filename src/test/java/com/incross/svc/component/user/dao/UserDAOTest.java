package com.incross.svc.component.user.dao;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.apache.ibatis.session.SqlSession;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.incross.svc.component.user.domain.User;


/**
 * @FileName : UserDAOTest.java
 * @Project : springProject
 * @Date : 2013. 2. 6.
 * @작성자 : 이남규
 * @프로그램설명 :
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/test-application-context.xml"})
@ActiveProfiles("test")
@Transactional
public class UserDAOTest {

	@Autowired
	private SqlSession sqlSessionTemplate;

	@Test
	@Ignore
	public void 저장테스트() {
		User user = new User();
		user.setUserId("lng1982");
		user.setUserName("이남규");
		user.setPassword("1111");
		int insertCnt = sqlSessionTemplate.insert("users.insertUser", user);

		assertThat(insertCnt, is(1));
	}
}
