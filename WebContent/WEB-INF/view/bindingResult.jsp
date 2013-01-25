<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<div>
	아이디 에러 : ${user.userId}<form:errors path="user.userId" /></br>
	이름 에러 : ${user.userName}<form:errors path="user.userName" /></br>
	나이 에러 : ${user.age}<form:errors path="user.age" /></br>
</div>
