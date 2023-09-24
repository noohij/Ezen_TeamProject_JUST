<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>개인회원 - 비밀번호 찾기</title>
<style type="text/css">
	#container {
		margin: 0px auto;
		padding: 70px 270px;
		width: 540px;
		background-color: #eff5ff;
	}
	#findPwdBox {
		margin: 0px auto;
		width: 540px;
		height: 345px;
		background-color: #fff;
		border-radius: 10px;
		box-shadow: 0px 1px 4px 0px #ddd;
		text-align: center;
	}
	#contentBox {
		margin: 0px auto;
		padding: 20px 0px;
		width: 400px;
		height: 630px;
		text-align: left;
	}
	#titleBox > p {
		font-size: 30px;
	}
	.inputBox {
		float: left;
		width: 400px;
		height: 100px;
	}
	.inputBox > input {
		width: 250px;
		height: 35px;
		margin-right: 10px;
	    border: 1px solid #d7dce5;
	    border-radius: 6px;
	}
	#buttonBox {
		width: 400px;
		height: 100px;
		margin-top: 30px;
		float: left;
	}
	button {
	    width: 115px;
	    height: 38px;
	    background-color: #bcd1fc;
	    border: none;
	    border-radius: 6px;
	    box-shadow: 0px 1px 4px 0px #ddd;
	    font-size: 16px;
	    font-weight: bold;
	    color: #475067;
	}
	
</style>
</head>
<body>

	<div id="container">
		<form id="findPwdBox" method="get">
			<div id="contentBox">
				<div id="titleBox">
					<p>${personalMemberDto.pName}님의 비밀번호</p>
				</div>
				<div id="informIdBox" class="inputBox">
					<p>비밀번호는 ${personalMemberDto.pPwd} 입니다</p>
				</div>
				<div id="buttonBox">
					<button type="button" onclick="location.href='./login.do';">돌아가기</button>
				</div>
			</div>
		</form>
	</div>

</body>
</html>