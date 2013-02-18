package com.incross.svc.component.user.dao;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
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
@ActiveProfiles("dev")
@Transactional
public class UserDAOTest extends SqlSessionDaoSupport {

	@Autowired
	private SqlSession sqlSessionTemplate;

	@Test
	public void 저장테스트() {
		User user = new User();
		user.setUserId("lng1982");
		user.setUserName("이남규");
		user.setPassword("1111");
		int insertCnt = getSqlSession().insert("users.insertUser", user);

//		User user1 = new User();
//		user1.setUserId("lng1982");
//		user1.setUserName("이은경");
//		user1.setPassword("2222");
//		int insertCnt1 = getSqlSession().insert("users.insertUser2", user1);


		assertThat(insertCnt, is(1));
	}
}
