<%@ page contentType="text/html;charset=UTF-8" language="java"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />

<title>JejuNU Spring Class exam HyunArm</title>

<link rel="stylesheet" href="resources/reset.css" />
<link rel="stylesheet" href="resources/deals_worth.css" />
</head>

<body>
	<div id="wrap">
		<div id="deals_block">
			<div class="deals_worth_block">
				<ul class="title_bar">
					<li class="title">품질 좋은 상품 A 20% 할인판매</li>
					<li class="btn_block">
						<button class="btn" onclick="location='./index.html'">목록</button>
						<button class="btn" onclick="location='./update_product.html'">수정</button>
					</li>
				</ul>

				<ul class="deals_worth">
					<li class="production_img"><img src="#" /></li>
					<ul class="production_info">
						<li class="in_info">가격 : <span class="price">15,000</span>원
						</li>
						<li class="in_info">판매자 : <span class="seller_name">(주)제주대학교</span></li>
						<li class="purchase_block"><button class="btn"
								id="btn_purchase" onclick="location='./shopping_cart.html'">구매</button></li>
					</ul>
				</ul>
			</div>

			<div class="deals_detailed_description">
				<li class="title">상품상세설명</li>
				<li class="detatiled_description">상품 A는 품질이 좋습니다.<br /> 상품 A는
					가격이 저렴합니다.<br /> 상품 A는 20%할인 가격으로 제공합니다.
				</li>
			</div>
		</div>
	</div>
</body>
</html>