package com.incross.svc.component.user.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.incross.svc.component.user.domain.User;

/**
 * @FileName : UserDAO.java
 * @Project : IncrossSpring
 * @Date : 2012. 12. 4.
 * @작성자 : 이남규
 * @프로그램설명 :
 */
@Repository
public class UserDAO {

	@Autowired
	private SqlSession sqlSessionTemplate;

	public UserDAO() {
		System.out.println("###################################################");
		System.out.println("create bean : " + getClass().getName());
		System.out.println("###################################################");
	}

	public List<User> getUserList() {
		List<User> userList = new ArrayList<User>();

		User user1 = new User();
		user1.setUserId("id1");
		user1.setUserName("kyu");
		userList.add(user1);

		User user2 = new User();
		user2.setUserId("id2");
		user2.setUserName("namkyu");
		userList.add(user2);
		return userList;
	}

	public int insertUser(User user) {
		return sqlSessionTemplate.insert("users.insertUser", user);
	}


}
