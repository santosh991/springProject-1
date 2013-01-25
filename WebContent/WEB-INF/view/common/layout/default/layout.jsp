<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title></title>
</head>

<body>
	default layout
	<div id="layout">
		<div id="header">
			<tiles:insertAttribute name="header" />
		</div>
		<hr />
		<div id="content">
<%-- 			<tiles:insertAttribute name="left" /> --%>
			<tiles:insertAttribute name="body" />
			<hr />
			<tiles:insertAttribute name="footer" />
		</div>
	</div>
</body>
</html>