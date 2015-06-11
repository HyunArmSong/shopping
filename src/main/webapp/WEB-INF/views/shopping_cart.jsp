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
				<div class="list_row">
					<li class="col_1"><img src="#" /></li>
					<li class="col_2 alignLeft"><a href="#">품질 좋은 상품 A 20%
							할인판매</a></li>
					<li class="col_3">15,000</li>
					<li class="col_4">(주)제주대학교</li>
					<li class="col_5"><button>주문취소</button></li>
				</div>
				<div class="list_row">
					<li class="col_1"><img src="#" /></li>
					<li class="col_2 alignLeft"><a href="#">품질 좋은 상품 A 20%
							할인판매</a></li>
					<li class="col_3">15,000</li>
					<li class="col_4">(주)제주대학교</li>
					<li class="col_5"><button>주문취소</button></li>
				</div>
				<div class="list_row">
					<li class="col_1"><img src="#" /></li>
					<li class="col_2 alignLeft"><a href="#">품질 좋은 상품 A 20%
							할인판매</a></li>
					<li class="col_3">15,000</li>
					<li class="col_4">(주)제주대학교</li>
					<li class="col_5"><button>주문취소</button></li>
				</div>
			</div>

			<div class="list_footer">
				총가격 <span class="total_price">45,000</span>
			</div>
		</div>
	</div>
</body>
</html>