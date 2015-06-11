<%@ page contentType="text/html;charset=UTF-8" language="java"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />

<title>JejuNU Spring Class exam HyunArm</title>

<link rel="stylesheet" href="resources/reset.css" />
<link rel="stylesheet" href="resources/index.css" />
</head>

<body>
	<div id="wrap">
		<div id="index_top" style="display:">
			<button class="btn_signUp" onclick="location.href='./signUp'">회원가입</button>
			<button class="btn_login" onclick="location.href='./login'">로그인</button>
		</div>

		<div id="login_top" style="display: none;">
			<span id="userName">${loginUser.name}</span>님 안녕하세요.
			<button class="btn_addProduct" id="btn_addProduct"
				onclick="localtion='./deals_worth.jsp'" style="display:">상품등록</button>
			<button class="btn_logout" onclick="location.href='./logout'">로그아웃</button>

		</div>

		<div id="list_border">
			<div class="list_header">
				<li class="col_1">상품이미지</li>
				<li class="col_2">상품명</li>
				<li class="col_3">가격</li>
				<li class="col_4">판매자</li>
			</div>

			<div class="list_body">
				<%
					int i = 1;
				%>
				<c:forEach var="product" items="${productList}" varStatus="status">
					<%
						if (i == 12) {
								out.println("<div class='list_body hiddenPage'>");
							}
					%>
					<div class="list_row">
						<li class="col_1"><img src="${product.imgUrl}" /></li>
						<li class="col_2 alignLeft"><a
							href="./productArticle?boardNum=${product.boardNum}">${product.title}</a></li>
						<li class="col_3">${product.price}</li>
						<li class="col_4">${product.seller}</li>
					</div>
					<%
						if (i == 24) {
								out.println("</div>");
								i = 1;
							}
							i++;
					%>
				</c:forEach>
			</div>

			<div class="list_footer">
				<a href="#"><</a> <a href="#">1</a> <a href="#">2</a> <a href="#">3</a>
				<a href="#">4</a> <a href="#">5</a> <a href="#">></a>
			</div>
		</div>
	</div>

	<script type="text/javascript">
		var indexTop = document.getElementById('index_top');
		var loginTop = document.getElementById('login_top');
		var btn_product = document.getElementById('btn_addProduct');
		function loginDisplay() {
			indexTop.style.display = "none";
			loginTop.style.display = "";

			if ("${loginUser.userType}" == "판매자") {
				btn_product.style.display = "";
			} else {
				btn_product.style.display = "none";
			}
		}

		function logoutDisplay() {
			indexTop.style.display = "";
			loginTop.style.display = "none";
		}
	</script>
	${loginDisplay}
</body>
</html>