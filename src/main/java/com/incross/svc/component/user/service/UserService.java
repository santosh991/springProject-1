package com.incross.svc.component.user.service;

import java.util.List;
import java.util.concurrent.Future;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import com.incross.svc.component.user.dao.UserDAO;
import com.incross.svc.component.user.domain.User;

/**
 * @FileName : UserService.java
 * @Project : IncrossSpring
 * @Date : 2012. 12. 4.
 * @작성자 : 이남규
 * @프로그램설명 :
 */
@Service
public class UserService {

	@Autowired
	private UserDAO userDAO;

	public UserService() {
		System.out.println("###################################################");
		System.out.println("create bean : " + getClass().getName());
		System.out.println("###################################################");
	}

	@PostConstruct
	public void init() {
		System.out.println("빈 후처리 애노테이션 테스트");
	}

	public List<User> getUserList() {
		return userDAO.getUserList();
	}

	public void insertUser() {
		System.out.println("회원 가입 진행!!");
	}

	@Async
	public Future<Boolean> sendEmail() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("메일 전송 성공");
		return new AsyncResult<Boolean>(true);
	}
}
