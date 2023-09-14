<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Company list</title>
	<style type="text/css">
	
			/* 	모든 선택자의  는 작업용입니다. */
			
/* 공통 */
		a {
		  text-decoration: none;
		  color: #292e41;
		}
	    a:hover { color: #2d65f2; }
			
/* head form */
		#headerBox {
			height: 130px;
			border-bottom: 1px solid #b4c0d3;
		}
		#headerContent {
				
			margin: 0px auto;
			width: 1280px;
			height: 120px;
		}
/* logo */
		#logo {
			float: left;
			margin: 0px 90px;
			width: 74px;
			height: 111px;
		}
/* main menu */
		#mainMenuBox {
				
			float: left;
			width: 750px;
			height: 100px;
			margin-left: 30px;
		}
		.mainMenuItem {
				
			float: left;
			margin: 20px;
			width: 200px;
			height: 60px;
			text-align: center;
			line-height: 60px;
			font-size: 30px;
			font-weight: 600;
		}
/* message */
		#myMessageBox {
				
			float: left;
			width: 100px;
			height: 100px;
			text-align: center;
		}
/* my menu */
		#myMenuBox {
				
			float: left;
			width: 140px;
			height: 100px;
			text-align: center;
		}
/* end of header */

/* content */
		#container {
			width: 1280px;
			height: 1000px;
			
			margin: 0px auto;
		}
/* navigation */
		#navigation {
			margin: 10px;
			float: left;
			width: 250px;
			height: 950px;
			font-size: 25px;
			text-align: center;
			background-color: #eff5ff;
		}
		#smallMenuBox {
				
			margin: 30px auto;
			width: 200px;
			height: 500px;
		}
		.smallMenuItem {
				
			margin-bottom: 20px;
		}
		.smallMenuItem a {
			color: #475067;
		}
/* content */
		#content {
			margin: 10px;
			float: left;
			width: 980px;
			height: 950px;
			font-size: 30px;
			background-color: #f8fafc;
		}
		#content > div {
			background-color: #fff;
			padding: 20px;
			border-radius: 10px;
		}
		.companyInfoItem {
			width: 910px;
		    height: 100px;
		    margin: 15px;
		    color: #5c667b;
		}
		.companyLogo, .companyName, .companyReviewAverage {
			line-height: 100px;
		}
		.companyLogo {
			float: left;
			width: 100px;
			height: 100px;
		}
		.companyName {
			margin-left: 20px;
			float: left;
		}
		.companyReviewAverage {
			float: right;
			width: 100px;
		}
/* tail form */
		#tailBox {
			height: 150px;
			background-color: #b4c0d3;
			text-align: center;
		}
		#tailContent {
				
			width: 1280px;
			height: 130px;
			margin: auto;
		}
		#teamName {
			font-size: 50px;
			font-weight: 800;
			color: #999999;
		}
	</style>
</head>
<body>

	<div id="headerBox">
		<div id="headerContent">
		
			<a href="http://www.naver.com">
				<img id="logo" src="./img/JobHub_logo.png">
			</a>
			
			<div id="mainMenuBox">
				<div class="mainMenuItem">
					<a href="http://www.naver.com">
						기업 추천
					</a>
				</div>
				<div class="mainMenuItem">
					<a href="http://www.naver.com">
						기업 리뷰
					</a>
				</div>
				<div class="mainMenuItem">
					<a href="http://www.naver.com">
						게시판
					</a>
				</div>
			</div>
			
			<div id="myMessageBox">
				<div>
					<a href="http://www.naver.com">
						채팅
					</a>
				</div>
			</div>
			
			<div id="myMenuBox">
				<div>
					<a href="http://www.naver.com">
						로그인 / 회원가입
					</a>
				</div>
			</div>
			
		</div>
	</div> <!-- Header Ends -->
	
	<div id="container">
		<div id="navigation">
			<div id="smallMenuBox">
				<div class="smallMenuItem">
					<a href="">리뷰 조회</a>
				</div>
				<div class="smallMenuItem">
					<a href="">리뷰 작성</a>
				</div>
				<div class="smallMenuItem">
					<a href="">기업 정보(조회?)</a>
				</div>
			</div>
		</div>
		
		<div id="content">
		
			<div class="companyInfoItem">
				<div>
					<div class="companyLogo">로고</div>
					<div class="companyName">회사명 1</div>
					<div class="companyReviewAverage">★4.2</div>
				</div>
			</div> <!-- end of companyInfoItem: 회사 한 개의 정보 -->
			
			<div class="companyInfoItem">
				<div>
					<div class="companyLogo">로고</div>
					<div class="companyName">회사명 2</div>
					<div class="companyReviewAverage">★3.2</div>
				</div>
			</div> <!-- end of companyInfoItem: 회사 한 개의 정보 -->
			
		</div>
		
	</div>	
	
	<div id="tailBox">
		<div id="tailContent">
			<div id="teamName">
				TEAM JUST
			</div>
		</div>
	</div>
	
</body>
</html>