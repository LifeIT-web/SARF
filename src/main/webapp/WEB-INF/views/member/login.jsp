<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<title>Login</title>
<link rel="stylesheet" href="/resources/css/login.css" />
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://code.jquery.com/jquery-1.10.2.js"></script>

<script>
	function login() {
		var loginForm = document.loginForm;
		var userId = loginForm.id.value;
		var password = loginForm.pw.value;

		if (!userId || !password) {
			alert("아이디 또는 비밀번호를 모두 알맞게 입력해주세요.")
		} else {
			loginForm.submit();
		}
	}
</script>

</head>

<body>
	<c:if test="${idNull == true}">
		<script>
			alert('입력하신 아이디는 존재하지 않습니다.');
		</script>
	</c:if>
	<c:if test="${msg == false}">
		<script>
			alert('비밀번호가 일치하지 않습니다.');
		</script>
	</c:if>
	<c:if test="${find_pw_msg == true}">
		<script>
			alert('이메일로 임시비밀번호를 전송했습니다.');
		</script>
	</c:if>
	<form name="loginForm" action="/member/login" method="post">
		<div class="container">
			<div class="logo">
				<img src="/resources/images/logo.jpg" alt="로고" width="200px"
					onclick="location.href='/'">
			</div>
			<div class="container_main">로그인</div>
			<div class="container_id">
				<input class="container_id_input" type="text" name="id"
					onkeydown="if (event.keyCode == 13) document.getElementById('login_enter').click()" autofocus>
				<div class="container_id_div">아이디</div>
			</div>
			<div class="container_pw">
				<input class="container_pw_input" type="password" name="pw"
					onkeydown="if (event.keyCode == 13) document.getElementById('login_enter').click()">
				<div class="container_pw_div">비밀번호</div>
			</div>
			<div class="container_find">
				<a href="find_id">아이디 찾기</a> | <a href="find_pw">비밀번호 찾기</a>
			</div>
			<div class="container_login">
				<input type="button" id="login_enter" onclick="login()" value="로그인">
				<input type="button" value="회원 가입" onclick="location.href='join';">
			</div>
		</div>
	</form>

	<script src="/resources/js/login.js"></script>
</body>
</html>