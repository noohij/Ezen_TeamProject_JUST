<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>           
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이메일 변경</title>

<link rel="stylesheet" href="/JobHub/resources/css/PersonalMyPage.css" type="text/css">
</head>
<body>

	<jsp:include page="../../Header.jsp"/>
	
	
	<div id="container">
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
				<div class="smallMenuItem">
					<a href="">고객센터</a>
				</div>
			</div>
		</div>
		
		<div id="content">
			<div class="infoTitle">
				이메일 수정
			</div>
			<div id="personalInfoBoxUpdate">
				<div class="personalInfoItem">
					<form action="emailUpdateCtr.do" method="post">
						<div class="personalInfoItemTitleUpdate">
							이메일
						</div>
						
						<div class="personalInfoItemUpdate">
							<input type="text" name="perEmail"
								placeholder="${personalMemberDto.perEmail}">
						</div>
					
						<div id="buttonBox">
							<button type="submit">변경하기</button>
						</div>
						
						<div id="backButtonBox">
							<button>
								<a href="./personalMyPageList.do?perNo=${personalMemberDto.perNo}">
									돌아가기
								</a>
							</button>
						</div>
						
					</form>
				</div>
			</div>
		</div>
		
	</div>	
	
	<jsp:include page="/WEB-INF/views/Tail.jsp"/>
	
</body>
</html>