<%@ page contentType="text/html;charset=UTF-8" language="java"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />

<title>JejuNU Spring Class exam HyunArm</title>

<link rel="stylesheet" href="resources/reset.css" />
<link rel="stylesheet" href="resources/signUp.css" />
</head>

<body>
	<div id="wrap">
		<div id="signUp_block">
			<div class="title_bar">회원가입</div>

			<form class="signUp_form" action="signUp" method="post">
				<ul class="input_block">
					<li>
						<dd class="text_block">ID</dd>
						<dd class="text_filed">
							<input type="text" name="id" id="id" />
						</dd>
					</li>

					<li>
						<dd class="text_block">Password</dd>
						<dd class="text_filed">
							<input type="password" name="password" id="password" />
						</dd>
					</li>

					<li>
						<dd class="text_block">이름</dd>
						<dd class="text_filed">
							<input type="text" name="name" id="name" />
						</dd>
					</li>

					<li>
						<dd class="text_block">권한</dd>
						<dd class="text_filed">
							<select name="userType" id="userType" class="selectBox">
								<option>판매자</option>
								<option>사용자</option>
							</select>
						</dd>
					</li>
				</ul>

				<ul class="btn_block">
					<input type="submit" value="회원가입" class="btn" />
					<input type="button" value="취소" class="btn" onclick="location='/'" />
				</ul>
			</form>
		</div>
	</div>
</body>
</html>