<%@ page contentType="text/html;charset=UTF-8" language="java"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />

<title>JejuNU Spring Class exam HyunArm</title>

<link rel="stylesheet" href="resources/reset.css" />
<link rel="stylesheet" href="resources/login.css" />
</head>

<body>
	<div id="wrap">
		<div id="login_block">
			<div class="title_bar">로 그 인</div>
			<form class="login_form" action="#">
				<ul class="input_block">
					<li class="text_block">ID</li>
					<li class="text_filed"><input type="text" name="user_id"
						id="user_id" /></li>
				</ul>

				<ul class="input_block">
					<li class="text_block">Password</li>
					<li class="text_filed"><input type="password" name="user_pw"
						id="user_pw" /></li>
				</ul>

				<ul class="btn_block">
					<input type="submit" id="btn_submit" class="btn" value="로그인" />
					<input type="button" class="btn" value="취소"
						onclick="location.href='./index.html'" />
				</ul>
			</form>
		</div>
	</div>
</body>
</html>