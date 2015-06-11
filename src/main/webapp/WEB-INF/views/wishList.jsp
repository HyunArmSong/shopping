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
<link rel="stylesheet" href="resources/shopping_cart.css" />
</head>

<body>
	<div id="wrap">
		<div id="top">
			<span class="userName">송현암</span>님의 장바구니
		</div>

		<div id="list_border">
			<div class="list_header">
				<li class="col_1">상품이미지</li>
				<li class="col_2">상품명</li>
				<li class="col_3">가격</li>
				<li class="col_4">판매자</li>
			</div>

			<div class="list_body">
				<c:forEach var="list" items="${wishList}" varStatus="status">
					<div class="list_row">
						<li class="col_1"><img src="${list.imgUrl}" /></li>
						<li class="col_2 alignLeft"><a href="./productArticle?boardNum=${list.boardNum}">${list.title}</a></li>
						<li class="col_3">${list.price}</li>
						<li class="col_4">${list.seller}</li>
						<li class="col_5"><button onclick="location.href='./cancel?boardNum=${list.boardNum}'">주문취소</button></li>
					</div>
				</c:forEach>
			</div>

			<div class="list_footer">
				총가격 <span class="total_price">45,000</span>
			</div>
		</div>
	</div>
</body>
</html>