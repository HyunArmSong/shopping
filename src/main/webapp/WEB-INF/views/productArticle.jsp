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
<link rel="stylesheet" href="resources/deals_worth.css" />
</head>

<body>
	<div id="wrap">
		<div id="deals_block">
			<div class="deals_worth_block">
				<input type="hidden" name="boardNum" value="${productInfo.boardNum}" />
				<ul class="title_bar">
					<li class="title">${productInfo.title}</li>
					<li class="btn_block">
						<button class="btn" onclick="location.href='./'">목록</button>
						<button id="btn_update" class="btn"
							onclick="location.href='./updateProduct?boardNum=${productInfo.boardNum}'">수정</button>
					</li>
				</ul>

				<ul class="deals_worth">
					<li class="production_img"><img src="${productInfo.imgUrl}" /></li>
					<ul class="production_info">
						<li class="in_info">가격 : <span class="price">${productInfo.price}</span>원
						</li>
						<li class="in_info">판매자 : <span class="seller_name">${productInfo.seller}</span></li>
						<li class="purchase_block">
						<button class="btn_purchase"
								id="btn_purchase" onclick="location.href='./addWishList?boardNum=${productInfo.boardNum}'">구매</button></li>
					</ul>
				</ul>
			</div>

			<div class="deals_detailed_description">
				<li class="title">상품상세설명</li>
				<li class="detatiled_description">${productInfo.content}</li>
			</div>
		</div>
	</div>

	<script type="text/javascript">
		var btn_update = document.getElementById("btn_update");
		var btn_purchase = document.getElementById("btn_purchase");

		if("${seller}" == "${productInfo.seller}"){
			btn_update.style.display = "";
			btn_purchase.style.display = "none";
		}else{
			userDisplay();
		}
		
		function userDisplay(){
			btn_update.style.display = "none";
			btn_purchase.style.display = "";
		}
	${userDisplay}
	</script>
</body>
</html>