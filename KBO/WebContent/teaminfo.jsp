<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Do+Hyeon&display=swap" rel="stylesheet">
<title>Insert title here</title>    

<style>
header {
	margin-top : -21px;	
  height: 75px;
  padding: 10px;
  color: white;
  background: skyblue;
  font-weight: bold;
  display: flex;
 /*  justify-content: space-between; */
  align-items: center; 
}

body {
	background-color: #F0FFF0;
}

#team {
position : absolute;
 top : 200px;
left : 300px;
bottom : 300px;
}

#op {
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

a {
  text-decoration-line: none;

}


/* ul {
 list-style-image: url(./img/글러브.png);
 font-size: 25px;
} */
ul li {
  margin: 0;
      padding: 14px 0 12px 40px;
      list-style: none;
      background-image: url(./img/글러브.png);
      background-position: left center;
      background-repeat: no-repeat;
      background-size: 36px;
      font-family : 'Do Hyeon', sans-serif;
      font-size : 25px;
}
</style>
<script>
	$(function() {
		$("#kiaT").click(function() {
			$.ajax({
				type : 'get',
				url : './kia.jsp',
				dataType : 'html',
				success : function(data) {
					$("#team").html(data);
				}
			});
		})
	})

	$(function() {
		$("#doosanB").click(function() {
			$.ajax({
				type : 'get',
				url : './doosan.jsp',
				dataType : 'html',
				success : function(data) {
					$("#team").html(data);
				}
			});
		})
	})

	$(function() {
		$("#lotteG").click(function() {
			$.ajax({
				type : 'get',
				url : './lotte.jsp',
				dataType : 'html',
				success : function(data) {
					$("#team").html(data);
				}
			});
		})
	})

	$(function() {
		$("#samsungL").click(function() {
			$.ajax({
				type : 'get',
				url : './samsung.jsp',
				dataType : 'html',
				success : function(data) {
					$("#team").html(data);
				}
			});
		})
	})

	$(function() {
		$("#kiwoomH").click(function() {
			$.ajax({
				type : 'get',
				url : './kiwoom.jsp',
				dataType : 'html',
				success : function(data) {
					$("#team").html(data);
				}
			});
		})
	})

	$(function() {
		$("#hanhwaE").click(function() {
			$.ajax({
				type : 'get',
				url : './hanhwa.jsp',
				dataType : 'html',
				success : function(data) {
					$("#team").html(data);
				}
			});
		})
	})

	$(function() {
		$("#ncD").click(function() {
			$.ajax({
				type : 'get',
				url : './nc.jsp',
				dataType : 'html',
				success : function(data) {
					$("#team").html(data);
				}
			});
		})
	})

	$(function() {
		$("#ktW").click(function() {
			$.ajax({
				type : 'get',
				url : './kt.jsp',
				dataType : 'html',
				success : function(data) {
					$("#team").html(data);
				}
			});
		})
	})

	$(function() {
		$("#lgT").click(function() {
			$.ajax({
				type : 'get',
				url : './lg.jsp',
				dataType : 'html',
				success : function(data) {
					$("#team").html(data);
				}
			});
		})
	})

	$(function() {
		$("#ssgL").click(function() {
			$.ajax({
				type : 'get',
				url : './ssg.jsp',
				dataType : 'html',
				success : function(data) {
					$("#team").html(data);
				}
			});
		})
	})
</script>

</head>
<body>
	
	<header>
	<span class="box"><a class="op" href="./home.jsp">홈</a></span>
	<span class="box"><strong>구단정보</strong></span>
	<span class="box">	<a class="op" href="./playerinfo.jsp">선수순위</a></strong>
</header>

<main>
<aside>

	<h3>KBO Teams</h3>
	<div class="teams">
		<ul class="img">
			<li><a href="#" id="kiaT">기아 타이거즈</a></li>
			<span><li><a href="#" id="doosanB">두산 베어스</a></li></span>
			<span><li><a href="#" id="lotteG">롯데 자이언츠</a></li></span>
			<span><li><a href="#" id="samsungL">삼성 라이온즈</a></li></span>
			<span><li><a href="#" id="kiwoomH">키움 히어로즈</a></li></span>
			<span><li><a href="#" id="hanhwaE">한화 이글스</a></li></span>
			<span><li><a href="#" id="ncD">NC 다이노스</a></li></span>
			<span><li><a href="#" id="ktW">KT 위즈</a></li></span>
			<span><li><a href="#" id="lgT">LG 트윈스</a></li></span>
			<span><li><a href="#" id="ssgL">SSG 랜더스</a></li></span>

		</ul>
	</div>
</aside>


	<div id="team"></div>
</main>
</body>


</html>