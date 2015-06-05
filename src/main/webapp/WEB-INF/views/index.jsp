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
			<button class="btn_signUp" onclick="location.href='signUp.jeju'">회원가입</button>
			<button class="btn_login" onclick="location.href='login.jeju'">로그인</button>
		</div>

		<div id="list_border">
			<div class="list_header">
				<li class="col_1">상품이미지</li>
				<li class="col_2">상품명</li>
				<li class="col_3">가격</li>
				<li class="col_4">판매자</li>
			</div>

			<div class="list_body">
				<c:forEach var="product" items="${myList}" varStatus="status">					
					<div class="list_row">
						<li class="col_1"><img src="${product.productImg}" /></li>
						<li class="col_2 alignLeft"><a href="#">${product.productName}</a></li>
						<li class="col_3">${product.productPrice}</li>
						<li class="col_4">${product.seller}</li>
					</div>
				</c:forEach>


				<!--<div class="list_row">
					<li class="col_1"><img src="#" /></li>
					<li class="col_2 alignLeft"><a href="./deals_worth.jeju">품질
							좋은 상품 A 20% 할인판매</a></li>
					<li class="col_3">15,000</li>
					<li class="col_4">(주)제주대학교</li>
				</div>
				<div class="list_row">
					<li class="col_1"><img src="#" /></li>
					<li class="col_2 alignLeft"><a href="#">품질 좋은 상품 A 20%
							할인판매</a></li>
					<li class="col_3">15,000</li>
					<li class="col_4">(주)제주대학교</li>
				</div>
				<div class="list_row">
					<li class="col_1"><img src="#" /></li>
					<li class="col_2 alignLeft"><a href="#">품질 좋은 상품 A 20%
							할인판매</a></li>
					<li class="col_3">15,000</li>
					<li class="col_4">(주)제주대학교</li>
				</div>
				<div class="list_row">
					<li class="col_1"><img src="#" /></li>
					<li class="col_2 alignLeft"><a href="#">품질 좋은 상품 A 20%
							할인판매</a></li>
					<li class="col_3">15,000</li>
					<li class="col_4">(주)제주대학교</li>
				</div>
				<div class="list_row">
					<li class="col_1"><img src="#" /></li>
					<li class="col_2 alignLeft"><a href="#">품질 좋은 상품 A 20%
							할인판매</a></li>
					<li class="col_3">15,000</li>
					<li class="col_4">(주)제주대학교</li>
				</div>
				<div class="list_row">
					<li class="col_1"><img src="#" /></li>
					<li class="col_2 alignLeft"><a href="#">품질 좋은 상품 A 20%
							할인판매</a></li>
					<li class="col_3">15,000</li>
					<li class="col_4">(주)제주대학교</li>
				</div>
				<div class="list_row">
					<li class="col_1"><img src="#" /></li>
					<li class="col_2 alignLeft"><a href="#">품질 좋은 상품 A 20%
							할인판매</a></li>
					<li class="col_3">15,000</li>
					<li class="col_4">(주)제주대학교</li>
				</div>
				<div class="list_row">
					<li class="col_1"><img src="#" /></li>
					<li class="col_2 alignLeft"><a href="#">품질 좋은 상품 A 20%
							할인판매</a></li>
					<li class="col_3">15,000</li>
					<li class="col_4">(주)제주대학교</li>
				</div>
				<div class="list_row">
					<li class="col_1"><img src="#" /></li>
					<li class="col_2 alignLeft"><a href="#">품질 좋은 상품 A 20%
							할인판매</a></li>
					<li class="col_3">15,000</li>
					<li class="col_4">(주)제주대학교</li>
				</div>
				<div class="list_row">
					<li class="col_1"><img src="#" /></li>
					<li class="col_2 alignLeft"><a href="#">품질 좋은 상품 A 20%
							할인판매</a></li>
					<li class="col_3">15,000</li>
					<li class="col_4">(주)제주대학교</li>
				</div>
				<div class="list_row">
					<li class="col_1"><img src="#" /></li>
					<li class="col_2 alignLeft"><a href="#">품질 좋은 상품 A 20%
							할인판매</a></li>
					<li class="col_3">15,000</li>
					<li class="col_4">(주)제주대학교</li>
				</div>
				<div class="list_row">
					<li class="col_1"><img src="#" /></li>
					<li class="col_2 alignLeft"><a href="#">품질 좋은 상품 A 20%
							할인판매</a></li>
					<li class="col_3">15,000</li>
					<li class="col_4">(주)제주대학교</li>
				</div> -->
			</div>

			<div class="list_footer">
				<a href="#"><</a> <a href="#">1</a> <a href="#">2</a> <a href="#">3</a>
				<a href="#">4</a> <a href="#">5</a> <a href="#">></a>
			</div>
		</div>
	</div>
</body>
</html>