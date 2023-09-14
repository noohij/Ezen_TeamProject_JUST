<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
	#sideBarDiv{
		width: 30%;
		float:left;
	}
	#sideBar{
		list-style-type: none;
		width: 170px;
		height: 500px;
		font-size: 30px;
		text-align: center;
		padding-left: 0px;
	}
	li{
		border: 1px solid blue;
		border-radius: 5px;
		background: aqua;
	}
	ol{
/* 		border: 1px solid black; */
		padding-left: 0px;
		font-size: 20px;
 		display: none; 
	}
	
</style>

<script type="text/javascript">
	function overFnc(obj) {
		var olList = obj.children;
		for (var i = 0; i < olList.length; i++) {
			olList[i].style.display = "block";
		}
		obj.addEventListener("mouseleave", function(e) {
			for (var i = 0; i < olList.length; i++) {
				olList[i].style.display = "none";
			}
		});
	};
	
	function lookMemberList(obj) {
		switch (obj) {
		case "all":
			location.href = "#전체#";
			break;
		case "personal":
			location.href = "#개인#";
			break;
		case "company":
			location.href = "#회사#";
			break;
		default:
			break;
		}
	}
</script>
</head>
<body>
	<div id="sideBarDiv">
		<ul id="sideBar">
			<li id="userMenu" onmouseover="overFnc(this);">사용자
				<ol class="userMenuClass" onclick="lookMemberList('all');">전체 회원</ol>
				<ol class="userMenuClass" onclick="lookMemberList('personal');">개인 회원</ol>		
				<ol class="userMenuClass" onclick="lookMemberList('company');">기업 회원</ol>
			</li>
			<li id="boardMenu" onmouseover="overFnc(this);">게시판
				<ol class="boardMenuClass">게시판 리스트</ol>
				<ol class="boardMenuClass">게시판 카테고리</ol>		
			</li>
			<li id="statisticsMenu" onmouseover="overFnc(this);">통계
				<ol class="statisticsMenuClass">통계1</ol>
				<ol class="statisticsMenuClass">통계2</ol>		
				<ol class="statisticsMenuClass">통계3</ol>
			</li>
			<li id="settingMenu" onmouseover="overFnc(this);">환경 설정
				<ol class="settingMenuClass">환경 설정1</ol>
				<ol class="settingMenuClass">환경 설정2</ol>		
				<ol class="settingMenuClass">환경 설정3</ol>
			</li>
		</ul>
	</div>
	
</body>
</html>