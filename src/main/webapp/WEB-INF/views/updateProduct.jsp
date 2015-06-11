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
			<li class="title_bar"><span id="seller_name">${productInfo.seller}</span>님의
				상품</li>

			<form action="updateProduct" class="enrollment_form" method="post">
				<input type="hidden" name="boardNum" value="${productInfo.boardNum}"/>
				<input type="hidden" name="seller" value="${productInfo.seller}"/>
				<li class="border_row">
					<dd class="text_block">상품 이미지</dd>
					<dd class="input_block">
						<input type="text" name="imgUrl" value="${productInfo.imgUrl}" readonly/>
						<input type="file" name="file" id="img" />
					</dd>
				</li>

				<li class="border_row">
					<dd class="text_block">상품명</dd>
					<dd class="input_block">
						<input type="text" name="title" id="product_name" value="${productInfo.title}" />
					</dd>
				</li>

				<li class="border_row">
					<dd class="text_block">가격</dd>
					<dd class="input_block">
						<input type="text" name="price" id="price" value="${productInfo.price}"/>
					</dd>
				</li>

				<li class="border_row">
					<dd class="text_block">상품상세설명</dd>
					<dd class="input_block">
						<textarea name="content" wrap="hard">${productInfo.content}</textarea>
					</dd>
				</li>

				<li class="btn_block">
					<input type="submit" class="btn" value="등록" />
					<input type="button" class="btn" value="취소" onclick="location.href='./'" />
					<input type="button" class="btn" value="삭제" onclick=""/>
				</li>
			</form>

			<div class="img_view">
				<img src="#" />
			</div>
		</div>
	</div>
	
	<script type="text/javascript">
		function btnDeleteOnclick(){
			
		}
	</script>
</body>
</html>