<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sample</title>
	<style type="text/css">
/* 공통 */
	a {
	  text-decoration: none;
	  color: #292e41;
	}
    a:hover { color: #2d65f2;}
			
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
		font-size: 30px;
		background-color: #f8fafc;
	}
	#content > form > div, #content > div {
		background-color: #fff;
		border-radius: 10px;
		box-shadow: 0px 1px 4px 0px #ddd;
	}
	#titleBox > p {
		font-size: 24px;
		margin: 0px 0px 20px 0px;
	}
	#searchBox {
		width: 880px;
	    height: 300px;
	    margin: 14px auto 0px auto;
	    padding-top: 20px;
	    padding-left: 40px;
	    font-size: 20px;
	}
	#conditionBox {
		width: 850px;
		height: 160px;
		padding-top: 10px;
		background-color: #f7fafe;
		border-radius: 10px;
	}
	.condition {
		width: 800px;
	    height: 30px;
	    line-height: 30px;
	    margin-bottom: 10px;
	    margin-left: 20px;
	}
	.conditionTitleBox {
		float: left;
		width: 150px;
		margin-bottom: 10px;
	}
	
	.radioBox {
		float: left;
		width: 650px;
		margin-bottom: 10px;
		font-size: 14px;
	}
	label {
		display: inline-block;
		width: 150px;
	}
	#inputBox {
		width: 588px;
	    height: 40px;
	    line-height: 40px;
	    margin-top: 10px;
	    margin-left: 110px;
	    text-align: center;
	    float: left;
	}
	#inputBox > select {
		height: 35px;
	}
	#textInput {
		width: 400px;
		height: 30px;
	}
	
	.button {
		width: 60px;
		height: 35px;
		background-color: #bcd1fc;
	    border: none;
	    border-radius: 6px;
	    box-shadow: 0px 1px 4px 0px #ddd;
	    font-size: 16px;
	    font-weight: bold;
	    color: #475067;
	}
	
	.helpButton {
		width: 30px;
		height: 30px;
		margin-top: 8px;
		padding: 0px 0px 0px 0px;
		border: none;
		background-color: inherit;
		position: relative;
	}
	
	#helpText {
		border-radius: 5px;
		background-color: #bcd1fc;
		display: none;
		position: absolute;
        left: 100%;
        top: 0;
        margin-left: 10px;
        width: 200px;
	}
	
	#helpText:after {
		content: "";
		border-top: 10px solid transparent;
		border-left: 10px solid transparent;
		border-right: 10px solid #bcd1fc;
		border-bottom: 10px solid transparent;
		position: absolute;
        top: 14px;
        left: -20px;
	}
	#resultBox {
		width: 890px;
	    height: 140px;
	    margin: 30px auto;
	    padding-left: 30px;
	    padding-top: 30px;
	    color: #5c667b;
	}
	#resultContent {
		width: 850px;
	    height: 180px;
	}
	#imgBox {
		float: left;
		width: 100px;
		height: 100px;
	}
	#infoBox{
		width: 400px;
		height: 140px;
		float:left;
	}
 	img {
 		/* 실제 이미지 크기에 따라 조정 필요 */
		width: 100%;
		height: 100%;
	}
	#pNameBox {
	 	width: 150px;
		height: 20px;
		font-size: 25px;
		clear:both;
	}
	#companyBox { 
		width: 350px; 
		height: 50px;
		font-size: 25px; 
	} 
 	#buttonBox { 
 		width: 150px; 
 		height: 140px; 
 	} 
 	#highTestEduBox{ 
 		width: 350px; 
 		height: 40px;
 		font-size: 20px; 
 	}
 	#licenseCountBox{ 
 		width: 200px; 
 		height: 40px;
 		font-size: 20px; 
 	}
 	#resumeBtn, #letterBtn { 
 		width: 150px;
 		height: 50px;
 		margin-bottom: 10px;
 	}
 	#resumeModal{
 		position: fixed;
 		left: 600px;
 		top: 200px;
		border: 1px solid black;
		width: 700px;
		border-radius: 5px;
		padding: 30px;
		display: none;
	}
	
	#closeBtn{
		float: right;
		font-size: 20px;
		font-weight: bold;
		cursor: pointer;
	}
	
	#resumeModal table{
		border: 1px solid black;
		border-collapse: collapse;
		text-align: center;
		margin: auto;
		font-size: 20px;
	}
	
	table{
		width: 600px;
	}
	
	tr td{
		border: 1px solid black;
	}
</style>
<script type="text/javascript" src="/JobHub/resources/js/jquery-3.7.1.js"></script>
<script type="text/javascript">
	function helpFnc(obj) {
		var helpTextObj = document.getElementById("helpText");
		helpTextObj.style.display = "block";

		obj.addEventListener("mouseleave", function(e) {
			helpTextObj.style.display = "none";
		});
	}
	
	function openResumeFnc(no) {
		var modal = document.getElementById("resumeModal");
		
		var resumeValue = document.getElementsByClassName("resumeValue");
		
		for (var i = 0; i < resumeValue.length; i++) {
			alert(resumeValue[i]);
		}
		
		var jsonData = { "pNo": no}; 
		
		$.ajax({
			url: "./showPersonalResume.do",
			type: "post",
			data: JSON.stringify(jsonData),
			contentType: "application/json",		
			success: function (data) {
	        // Ajax 요청이 성공하면 이 함수가 실행됩니다.
	        // 서버로부터 받은 데이터(data)를 처리합니다.
	        
	        // 예제: 결과를 resultContainer에 표시
	        	alert('성공');
	      	
	        	modal.style.display = "block";
			
			},
			error: function() {
				alert('실패함');
			}
		});
		
		
		
		
	}
	
	function closeModal() {
		var modal = document.getElementById("resumeModal");
		
		modal.style.display = "none";
	}
</script>	

</head>
<body>

	<jsp:include page="/WEB-INF/views/Header.jsp"/>
	
	<div id="container">
		<div id="navigation">
			<div id="smallMenuBox">
				<div class="smallMenuItem">
					<a href="http://www.naver.com">리뷰 조회</a>
				</div>
				<div class="smallMenuItem">
					<a href="">리뷰 작성</a>
				</div>
				<div class="smallMenuItem">
					<a href="">기업 정보</a>
				</div>
			</div>
		</div>
		
		<div id="content">
			<form action="./personalInfoList.do" method="post">
				<div id="searchBox">
					<div id="titleBox">
						<p>인재찾기</p>
					</div>
					<div id="conditionBox">
						<div class="condition">
							<div class="conditionTitleBox">
								<input type="checkbox"> 인재점수
							</div>
							<div class="radioBox">
								<input type="radio" name="score" id="score1"> 
									<label for="score1">60점 이상</label>
								<input type="radio" name="score" id="score2"> 
									<label for="score2">80점 이상</label>
								<input type="radio" name="score" id="score3"> 
									<label for="score3">90점 이상</label>
							</div>
						</div>
						<div class="condition">
							<div class="conditionTitleBox">
								<input type="checkbox"> 경력
							</div>
							<div class="radioBox">
								<input type="radio" name="career" id="career1"> 
									<label for="career1">3년차 이하</label>
								<input type="radio" name="career" id="career2"> 
									<label for="career2">3~5년차</label>
								<input type="radio" name="career" id="career3"> 
									<label for="career3">5년차 이상</label>
							</div>
						</div>
						<div class="condition">
							<div class="conditionTitleBox">
								<input type="checkbox"> 최종 학력
							</div>
							<div class="radioBox">
								<input type="radio" name="education" id="score1"> 
									<label for="score1">고졸</label>
								<input type="radio" name="education" id="education2"> 
									<label for="education2">초대졸</label>
								<input type="radio" name="education" id="education3"> 
									<label for="education3">대졸</label>
							</div>	
						</div>
						<div class="condition">
							<div class="conditionTitleBox">
								<input type="checkbox"> 자격증
							</div>
							<div class="radioBox">
								<input type="radio" name="license" id="license1"> 
									<label for="license1">1개 미만</label>
								<input type="radio" name="license" id="license2"> 
									<label for="license2">1개~3개</label>
								<input type="radio" name="license" id="license3"> 
									<label for="license3">3개 이상</label>
							</div>
						</div>
					</div>
					<div id="inputBox">
						<select id="search">
							<option value="인재 점수">인재 점수</option>
							<option value="경력">경력</option>
							<option value="최종 학력">최종 학력</option>
							<option value="자격증">자격증</option>
						</select>
						<input type="text" id="textInput">
						<input type="submit" value="검색" class="button">
						</div>
						<button class="helpButton">
							<div id="helpText">
								- 상세 검색 경력(년차 검색) <br>
								- 최종 학력(특정 교육기관 검색) <br>
								- 자격증(특정 자격증 검색) <br>
							</div>
							<img class="helpButton" alt="도움말"
								onmouseover="helpFnc(this);"
								src="https://cdn.icon-icons.com/icons2/602/PNG/512/Help_icon-icons.com_55891.png">
						</button>
					
				</div>
			</form>
			<div id="resumeModal">
			 <span id="closeBtn" onclick="closeModal();">&times;</span>
	누구누구의 이력서
				<table>
					<thead>
						<th>
							개인 정보
						</th>
					</thead>
					<tr>
						<td>이름</td>
						<td class="resumeValue"></td>
						<td>생년월일</td>
						<td class="resumeValue"></td>
					</tr>
					<tr>
						<td>이메일</td>
						<td class="resumeValue"></td>
						<td>연락처</td>
						<td class="resumeValue"></td>
					</tr>
					<tr>
						<td>주소</td>
						<td class="resumeValue"></td>
						<td>결혼 여부</td>
						<td class="resumeValue"></td>
					</tr>
					<tr>
						<td>성별</td>
						<td class="resumeValue"></td>
						<td>병역 여부</td>
						<td class="resumeValue"></td>
					</tr>
				</table>
				
				
				
				<table>
					<thead>
						<th>
							학력 사항
						</th>
					</thead>
					<tr>
						<td>입학년도</td>
						<td>졸업년도</td>
						<td>학교명</td>
						<td>전공</td>
						<td>소재지</td>
						<td>학점(등급)/ 만점</td>
						<td>졸업 구분</td>
					</tr>
					<tr>
						<td class="resumeValue"></td>
						<td class="resumeValue"></td>
						<td class="resumeValue"></td>
						<td class="resumeValue"></td>
						<td class="resumeValue"></td>
						<td class="resumeValue"></td>
						<td class="resumeValue"></td>
					</tr>
				</table>
				
				<table>
					<thead>
						<th>
							경력 사항
						</th>
					</thead>
					<tr>
						<td>입사년도</td>
						<td>퇴사년도</td>
						<td>회사명</td>
						<td>직위</td>
						<td>소재지</td>
						<td>담당업무</td>
					</tr>
					<tr>
						<td class="resumeValue"></td>
						<td class="resumeValue"></td>
						<td class="resumeValue"></td>
						<td class="resumeValue"></td>
						<td class="resumeValue"></td>
						<td class="resumeValue"></td>
					</tr>
				</table>
				
				<table>
					<thead>
						<th>
							자격증
						</th>
					</thead>
					<tr>
						<td>자격증 취득일</td>
						<td>자격증명</td>
						<td>발급 기관</td>
						<td>점수/등급</td>
					</tr>
					<tr>
						<td class="resumeValue"></td>
						<td class="resumeValue"></td>
						<td class="resumeValue"></td>
						<td class="resumeValue"></td>
					</tr>
				</table>
			</div>
			<c:forEach var="personalInfo" items="${personalInfoList}">
				<div id="resultBox">
					<div id="resultContent">
						<div style="width: 150px; height: 140px; float:left;">
							<div id="imgBox">
								<img alt="" src="https://www.fnnews.com/resource/media/image/2023/08/29/202308291128014614_l.jpg">
							</div>
							<div id="pNameBox">
								${personalInfo.pName}
							</div>
						</div>
						<div id="infoBox">
							<div id="companyBox">
							${personalInfo.pCampany}
							</div>
							<div id="highTestEduBox">
								최종 학력 : ${personalInfo.pHightestEdu}
							</div>
							<div id="licenseCountBox">
								자격증 :	${personalInfo.pLicenseCount}개
							</div>
						</div>
						<div id="" style="width: 100px; float: left; margin-right: 50px;">
								적합도 100%
						</div>
						<div id="buttonBox" style="float:left;">
							<input type="button" value="이력서 보기" 
								class="button" id="resumeBtn" onclick="openResumeFnc(${personalInfo.pNo});">
							<input type="button" value="자소서 보기" class="button" id="letterBtn">
						</div>
						
					</div>
				</div>
			</c:forEach>
			
 		</div> <!-- end of content -->
	</div>	
	<jsp:include page="/WEB-INF/views/Tail.jsp"/>
	
</body>

</html>

