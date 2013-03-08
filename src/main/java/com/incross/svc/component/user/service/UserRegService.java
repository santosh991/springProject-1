package com.incross.svc.component.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incross.svc.component.user.dao.UserDAO;
import com.incross.svc.component.user.domain.User;

/**
 * @FileName : UserRegService.java
 * @Project : springProject
 * @Date : 2013. 3. 8.
 * @작성자 : 이남규
 * @프로그램설명 :
 */
@Service
public class UserRegService {

	@Autowired
	private UserDAO userDAO;

	public void insertUser(User user) {
		userDAO.insertUser(user);
//		throw new NullPointerException();
	}
}
