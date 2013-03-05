<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<!-- saved from url=(0066)http://twitter.github.com/bootstrap/examples/starter-template.html -->
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<title>이남규 홈페이지</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<!-- Le styles -->
<link href="http://twitter.github.com/bootstrap/assets/css/bootstrap.css" rel="stylesheet">
<style>
body {
	padding-top: 60px;
	/* 60px to make the container go all the way to the bottom of the topbar */
}
</style>
<link href="http://twitter.github.com/bootstrap/assets/css/bootstrap-responsive.css" rel="stylesheet">

<!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
      <script src="../assets/js/html5shiv.js"></script>
    <![endif]-->

<!-- Fav and touch icons -->
<link rel="apple-touch-icon-precomposed" sizes="144x144" href="http://twitter.github.com/bootstrap/assets/ico/apple-touch-icon-144-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="114x114" href="http://twitter.github.com/bootstrap/assets/ico/apple-touch-icon-114-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="72x72" href="http://twitter.github.com/bootstrap/assets/ico/apple-touch-icon-72-precomposed.png">
<link rel="apple-touch-icon-precomposed" href="http://twitter.github.com/bootstrap/assets/ico/apple-touch-icon-57-precomposed.png">
<link rel="shortcut icon" href="http://twitter.github.com/bootstrap/assets/ico/favicon.png">
<script>
	window["_GOOG_TRANS_EXT_VER"] = "1";
</script>
</head>

<body>

	<div class="navbar navbar-inverse navbar-fixed-top">
		<div class="navbar-inner">
			<div class="container">
				<button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span>
				</button>
				<a class="brand">이남규 홈페이지</a>
				<div class="nav-collapse collapse">
					<ul class="nav">
						<li class="active"><a href="#">Home</a></li>
						<li><a href="#">dev</a></li>
					</ul>
				</div>
				<!--/.nav-collapse -->
			</div>
		</div>
	</div>

	<div class="container">

		<h2>My Information</h2>
		<ul>
			<li>blog : <a href="http://lng1982.tistory.com" target="_blank">http://lng1982.tistory.com</a></li>
			<li>facebook : <a href="http://www.facebook.com/namkyu1982" target="_blank">http://www.facebook.com/namkyu1982</a></li>
			<li>twitter : <a href="https://twitter.com/lnk1982" target="_blank">https://twitter.com/lnk1982</a></li>
			<li>GitHub : <a href="https://github.com/namkyu" target="_blank">https://github.com/namkyu</a></li>
			<li>profeel.me : <a href="http://profeel.me/namkyu" target="_blank">http://profeel.me/namkyu</a></li>
			<li>email : <a href="mailto:lng1982@gmail.com">lng1982@gmail.com</a></li>
		</ul>
		<br />
		<h2>Profile</h2>
		<ul>
			<li>직업 : 자바 프로그래머</li>
			<li>직장 : 인크로스(주)</li>
			<li>학력 : 방송통신대학교 수료</li>
		</ul>
		<br />
		<h2>Career Path</h2>
		<ul>
			<li>산림청 숲에On 홈페이지 개발</li>
			<li>이러닝 시스템 구축</li>
			<li>SKT 아이토핑 개발</li>
			<li>모바일 사서함, 퀵 청구서 개발</li>
			<li>해피포인트 모바일 멤버십 전송 서버 개발</li>
			<li>SKT T Interactive CMS(통합구성시스템) Client 개발</li>
			<li>SKT MoA 광고 플랫폼 개발</li>
			<li>SKT 별별쿠폰 서비스 개발</li>
			<li>SKP T ad 광고 플랫폼 개발</li>
			<li>SKP 통합아이디 인증 시스템 개발</li>
		</ul>
		<br />
		<h2>Education Completed</h2>
		<ul>
			<li>정보통신설비 (2005.7.22 ~ 2006.1.17)</li>
			<li>웹 프로그래밍 (2006.1.23 ~ 2006.4.28)</li>
			<li>Spring framework (2009.6.20 ~ 2009.7.25)</li>
			<li>안드로이드 프로그래밍 실무 (2010.7.19 ~ 2010.7.30)</li>
		</ul>

	</div>
	<!-- /container -->

	<!-- Le javascript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="./bootstrap_files/jquery.js"></script>
	<script src="./bootstrap_files/bootstrap-transition.js"></script>
	<script src="./bootstrap_files/bootstrap-alert.js"></script>
	<script src="./bootstrap_files/bootstrap-modal.js"></script>
	<script src="./bootstrap_files/bootstrap-dropdown.js"></script>
	<script src="./bootstrap_files/bootstrap-scrollspy.js"></script>
	<script src="./bootstrap_files/bootstrap-tab.js"></script>
	<script src="./bootstrap_files/bootstrap-tooltip.js"></script>
	<script src="./bootstrap_files/bootstrap-popover.js"></script>
	<script src="./bootstrap_files/bootstrap-button.js"></script>
	<script src="./bootstrap_files/bootstrap-collapse.js"></script>
	<script src="./bootstrap_files/bootstrap-carousel.js"></script>
	<script src="./bootstrap_files/bootstrap-typeahead.js"></script>



	<div style="display: none;" id="orbiousinterest_dialog">
		<div class="container">
			<div class="header">Mark as unread</div>
			URL <input type="text" value="" class="url" readonly="readonly"><br> Title <input type="text" value="" class="title"><br> Tags <input type="text"
				value="tags, seperated by commas" class="tags empty">
			<div class="buttons">
				<input type="button" value="Cancel" class="cancel"> <input type="button" value="Save" class="save">
			</div>
		</div>
	</div>
	<a id="ORBVIOUS_DOMWindowHost" href="http://twitter.github.com/bootstrap/examples/starter-template.html#orbiousinterest_dialog"></a>
</body>
<style type="text/css"></style>
</html>