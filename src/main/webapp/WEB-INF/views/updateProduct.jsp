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
<link rel="stylesheet" href="resources/add_product.css" />
</head>

<body>
	<div id="wrap">
		<div id="border_block">
			<li class="title_bar"><span id="seller_name">(주)제주대학교</span>님의
				상품</li>

			<form action="#" class="enrollment_form">
				<li class="border_row">
					<dd class="text_block">상품 이미지</dd>
					<dd class="input_block">
						<input type="file" name="imgUrl" id="img" />
					</dd>
				</li>

				<li class="border_row">
					<dd class="text_block">상품명</dd>
					<dd class="input_block">
						<input type="text" name="title" id="product_name" />
					</dd>
				</li>

				<li class="border_row">
					<dd class="text_block">가격</dd>
					<dd class="input_block">
						<input type="text" name="price" id="price" />
					</dd>
				</li>

				<li class="border_row">
					<dd class="text_block">상품상세설명</dd>
					<dd class="input_block">
						<textarea name="content" wrap="hard"></textarea>
					</dd>
				</li>

				<li class="btn_block"><input type="submit" class="btn"
					value="등록" /> <input type="button" class="btn" value="취소"
					onclick="location='./index.html'" /></li>
			</form>

			<div class="img_view">
				<img src="#" />
			</div>
		</div>
	</div>
</body>
</html>