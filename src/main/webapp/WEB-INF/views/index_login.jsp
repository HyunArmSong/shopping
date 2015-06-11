<%@ page contentType="text/html;charset=UTF-8" language="java"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
		<div id="top">
			<span class="userName">송현암</span>님 안녕하세요.
			<button class="btn_addProduct"
				onclick="localtion='./deals_worth.jsp'" style="display: ">상품등록</button>
			<button class="btn_logout">로그아웃</button>

		</div>

		<div id="list_border">
			<div class="list_header">
				<li class="col_1">상품이미지</li>
				<li class="col_2">상품명</li>
				<li class="col_3">가격</li>
				<li class="col_4">판매자</li>
			</div>

			<div class="list_body now_list">
				<c:forEach var="product" items="${productList}" varStatus="status">
					<div class="list_row">
						<li class="col_1"><img src="${product.imgUrl}" /></li>
						<li class="col_2 alignLeft"><a href="">${product.title}</a></li>
						<li class="col_3">${product.price}</li>
						<li class="col_4">${product.seller}</li>
					</div>
				</c:forEach>
			</div>

			<div class="list_footer">
				<a href="#"><</a> <a href="#">1</a> <a href="#">2</a> <a href="#">3</a>
				<a href="#">4</a> <a href="#">5</a> <a href="#">></a>
			</div>
		</div>
	</div>
</body>
</html>