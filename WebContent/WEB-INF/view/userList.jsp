<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
body

<div>
	id : ${user.userId}
	<br /><br />
	age : ${user.age}
	<br /><br />
	<c:forEach items="${userList}" var="domain" varStatus="in">
		${domain.userId}, ${domain.userName} <br />
	</c:forEach>

	<br /><br />
	타이틀 : <fmt:message key="title" />

	<br /><br />
	flashMapTest : ${flashMapTest}
</div>
