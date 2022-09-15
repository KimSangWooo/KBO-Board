<%@page import="PlayersData.Hitter"%>
<%@page import="java.util.List"%>
<%@page import="PlayersData.Pitchers"%>
<%@page import="Dao.PlayerDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<style>
header {
	height: 75px;
	padding: 10px;
	color: white;
	background: skyblue;
	font-weight: bold;
	display: flex;
	/*   justify-content: space-between; */
	align-items: center;
}

body {
	background-color: #F0FFF0;
}

#rank {
	position: relative;
	float: left;
	top: 100px;
	
}

h3 {
	position: relative;
	top: 200px;
	left: 0px;
	top: 110px;
	float: left;
	border: 2px solid #000;
	width: 150px;
	height: 80px;
	text-align: center;
	line-height: 80px;
	font-weight: bold;
	background-color: 	#FFDAB9;
}

span {
	position: static;
	float: left;
	bottom: 300px;
}

a {
	text-decoration-line: none;
}

.box {
	display: inline-block; /* default값 inline */
	width: 100px; /* display가 block일때만 지정가능 */
	height: 50px; /* display가 block일때만 지정가능 */
	background-color: skyblue; /* 배경색 = green */
	/* 왼쪽 margin 10px */
	padding: 12px; /* padding 20px */
	border: 5px dashed skyblue; /* 테두리 */
	font-style: TmoneyRoundWindExtraBold; /* 글자형태 : 이태릭체 */
	color: white; /* 글자색 : white */
	font-size: 20px;
	text-align: center;
}
</style>
<title>Insert title here</title>




<script>
	$(function() {
		$("#pitcher").click(function() {
			$.ajax({
				type : 'get',
				url : './pitcherrank.jsp',
				dataType : 'html',
				success : function(data) {
					$("#rank").html(data);
				}
			});
		})
	})

	$(function() {
		$("#hitter").click(function() {
			$.ajax({
				type : 'get',
				url : './hitterrank.jsp',
				dataType : 'html',
				success : function(data) {
					$("#rank").html(data);
				}
			});
		})
	})
</script>
</head>
<body>

	<header>
		<span class="box"><a href="./home.jsp" id="op">홈</a></span> <span
			class="box"><a href="./teaminfo.jsp" id="op">구단정보</a></span> <span
			class="box"><strong>선수순위</strong></span>
	</header>

	<main>
		<aside>
			<h3 id="pitcher" class="optionh">투수순위</h3>
			<h3 id="hitter" class="optionp">타자순위</h3>
		</aside>

		<div id="rank"></div>
	</main>
</body>
</html>