<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>        
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My page</title>
<link rel="stylesheet" href="/JobHub/resources/css/PersonalMyPage.css" type="text/css">	
</head>
<body>

	<div id="navigation">
			<div id="smallMenuBox">
				<div class="smallMenuItem">
					<a href="./personalMyPageList.do?perNo=${personalMemberDto.perNo}">내 프로필</a>
				</div>
				<div class="smallMenuItem">
					<a href="./personalMyPostList.do?perNo=${personalMemberDto.perNo}">내가 쓴 글</a>
				</div>
				<div class="smallMenuItem">
					<a href="./showResume.do?perNo=${personalMemberDto.perNo}">이력서 관리</a>
				</div>
				<div class="smallMenuItem">
					<a href="./showLetter.do?perNo=${personalMemberDto.perNo}">자소서 관리</a>
				</div>
<!-- 				<div class="smallMenuItem"> -->
<!-- 					<a href="">고객센터</a> -->
<!-- 				</div> -->
			</div>
		</div>

</body>
</html>