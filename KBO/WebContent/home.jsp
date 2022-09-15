<%@page import="ResultData.Result"%>
<%@page import="ResultData.ResultDao"%>
<%@page import="Dao.TeamDao"%>
<%@page import="TeamsData.Team"%>
<%@page import="java.util.List"%>
<%@page import="jdbc.DBUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>KBO홈</title>
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

.players {
	margin-left: 720px;
}

.result {
	margin-top: 60px;
	margin-left: 25px;
	float: left;
	background-color: #FFFFF;
	font-size: 18px;
}

#first {
	margin-left: 70px;
}

th, td {
	text-align: center;
	background-color: #FFFFF;
	border: #FFFAFA;
}

.main {
	margin-top: 10px;
}

#sr {
	margin-top: 50px;
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
<script>
	function openPopup1() {

		var player = document.form.player.value;
		var url = "popup.jsp?player=" + player;
		window
				.open(
						url,
						"./popup.jsp",
						"top=300, left=500, toolbar=no, menubar=no, scrollbars=yes, resizable=no, width=800, height=130");

	}
</script>
</head>
<body>


	<header>
		<span class="box"><strong>홈</strong></span> <span class="box"><a
			href="./teaminfo.jsp" id="op">구단정보</a></span> <span class="box"><a
			href="./playerinfo.jsp" id="op">선수순위</a></span>
	</header>

	<main>
		<div class="players">

			<form name="form" method="post">

				<label id="sr" name="search"><input type="text"
					name="player" />선수명검색</label> <input id="sr" input name="button"
					type="button" value="검색" onClick="openPopup1();" />

			</form>
		</div>







		<%
			TeamDao dao = new TeamDao();
		ResultDao rdao = new ResultDao();
		List<Team> list = dao.allTeams();
		List<Result> rlist = rdao.allResult();
		%>

		<table class="main" border="5" bordercolor="B0E0E6" width="700"
			height="380" align="center">
			<th>팀</th>
			<th>순위</th>
			<th>경기</th>
			<th>승</th>
			<th>패</th>
			<th>무</th>
			<th>승률</th>
			<th>게임차</th>
			<tr>
				<!-- 첫번째 줄 시작 -->
				<td><%=list.get(0).getName()%></td>
				<td><%=list.get(0).getRank()%></td>
				<td><%=list.get(0).getGames()%></td>
				<td><%=list.get(0).getWins()%></td>
				<td><%=list.get(0).getLoses()%></td>
				<td><%=list.get(0).getDraws()%></td>
				<td><%=list.get(0).getRate()%></td>
				<td><%=list.get(0).getGameterms()%></td>
			</tr>
			<!-- 첫번째 줄 끝 -->
			<tr>
				<td><%=list.get(1).getName()%></td>
				<td><%=list.get(1).getRank()%></td>
				<td><%=list.get(1).getGames()%></td>
				<td><%=list.get(1).getWins()%></td>
				<td><%=list.get(1).getLoses()%></td>
				<td><%=list.get(1).getDraws()%></td>
				<td><%=list.get(1).getRate()%></td>
				<td><%=list.get(1).getGameterms()%></td>
			</tr>

			<tr>
				<td><%=list.get(2).getName()%></td>
				<td><%=list.get(2).getRank()%></td>
				<td><%=list.get(2).getGames()%></td>
				<td><%=list.get(2).getWins()%></td>
				<td><%=list.get(2).getLoses()%></td>
				<td><%=list.get(2).getDraws()%></td>
				<td><%=list.get(2).getRate()%></td>
				<td><%=list.get(2).getGameterms()%></td>
			</tr>

			<tr>
				<td><%=list.get(3).getName()%></td>
				<td><%=list.get(3).getRank()%></td>
				<td><%=list.get(3).getGames()%></td>
				<td><%=list.get(3).getWins()%></td>
				<td><%=list.get(3).getLoses()%></td>
				<td><%=list.get(3).getDraws()%></td>
				<td><%=list.get(3).getRate()%></td>
				<td><%=list.get(3).getGameterms()%></td>
			</tr>
			<tr>
				<td><%=list.get(4).getName()%></td>
				<td><%=list.get(4).getRank()%></td>
				<td><%=list.get(4).getGames()%></td>
				<td><%=list.get(4).getWins()%></td>
				<td><%=list.get(4).getLoses()%></td>
				<td><%=list.get(4).getDraws()%></td>
				<td><%=list.get(4).getRate()%></td>
				<td><%=list.get(4).getGameterms()%></td>
			</tr>

			<tr>
				<td><%=list.get(5).getName()%></td>
				<td><%=list.get(5).getRank()%></td>
				<td><%=list.get(5).getGames()%></td>
				<td><%=list.get(5).getWins()%></td>
				<td><%=list.get(5).getLoses()%></td>
				<td><%=list.get(5).getDraws()%></td>
				<td><%=list.get(5).getRate()%></td>
				<td><%=list.get(5).getGameterms()%></td>
			</tr>

			<tr>
				<td><%=list.get(6).getName()%></td>
				<td><%=list.get(6).getRank()%></td>
				<td><%=list.get(6).getGames()%></td>
				<td><%=list.get(6).getWins()%></td>
				<td><%=list.get(6).getLoses()%></td>
				<td><%=list.get(6).getDraws()%></td>
				<td><%=list.get(6).getRate()%></td>
				<td><%=list.get(6).getGameterms()%></td>
			</tr>

			<tr>
				<td><%=list.get(7).getName()%></td>
				<td><%=list.get(7).getRank()%></td>
				<td><%=list.get(7).getGames()%></td>
				<td><%=list.get(7).getWins()%></td>
				<td><%=list.get(7).getLoses()%></td>
				<td><%=list.get(7).getDraws()%></td>
				<td><%=list.get(7).getRate()%></td>
				<td><%=list.get(7).getGameterms()%></td>
			</tr>

			<tr>
				<td><%=list.get(8).getName()%></td>
				<td><%=list.get(8).getRank()%></td>
				<td><%=list.get(8).getGames()%></td>
				<td><%=list.get(8).getWins()%></td>
				<td><%=list.get(8).getLoses()%></td>
				<td><%=list.get(8).getDraws()%></td>
				<td><%=list.get(8).getRate()%></td>
				<td><%=list.get(8).getGameterms()%></td>
			</tr>
			<tr>
				<td><%=list.get(9).getName()%></td>
				<td><%=list.get(9).getRank()%></td>
				<td><%=list.get(9).getGames()%></td>
				<td><%=list.get(9).getWins()%></td>
				<td><%=list.get(9).getLoses()%></td>
				<td><%=list.get(9).getDraws()%></td>
				<td><%=list.get(9).getRate()%></td>
				<td><%=list.get(9).getGameterms()%></td>
			</tr>
		</table>

		<table id="first" class="result" bordercolor="black" width="180"
			height="60">
			<tr>
				<td><%=rlist.get(0).getHometeam()%></td>
				<td><%=rlist.get(0).getHomescore()%></td>
			</tr>
			<tr>
				<td><%=rlist.get(0).getAwayteam()%></td>
				<td><%=rlist.get(0).getAwayscore()%></td>
			</tr>
			<%
				if (rlist.get(0).getResult().equals("우천취소")) {
			%>
			<th><strong><font color="#20B2AA"><%=rlist.get(0).getResult()%></font></strong></th>
			<%
				} else {
			%>
			<th><%=rlist.get(0).getResult()%></th>
			<%
				}
			%>
		</table>

		<table class="result" bordercolor="black" width="180" height="60">
			<tr>
				<td><%=rlist.get(1).getHometeam()%></td>
				<td><%=rlist.get(1).getHomescore()%></td>
			</tr>
			<tr>
				<td><%=rlist.get(1).getAwayteam()%></td>
				<td><%=rlist.get(1).getAwayscore()%></td>
			</tr>
			<%
				if (rlist.get(1).getResult().equals("우천취소")) {
			%>
			<th><strong><font color="#20B2AA"><%=rlist.get(1).getResult()%></font></strong></th>
			<%
				} else {
			%>
			<th><strong><%=rlist.get(1).getResult()%></strong></th>
			<%
				}
			%>
		</table>

		<table class="result" bordercolor="black" width="180" height="60">
			<tr>
				<td><%=rlist.get(2).getHometeam()%></td>
				<td><%=rlist.get(2).getHomescore()%></td>
			</tr>
			<tr>
				<td><%=rlist.get(2).getAwayteam()%></td>
				<td><%=rlist.get(2).getAwayscore()%></td>
			</tr>
			<%
				if (rlist.get(2).getResult().equals("우천취소")) {
			%>
			<th><strong><font color="#20B2AA"><%=rlist.get(2).getResult()%></font></strong></th>
			<%
				} else {
			%>
			<th><strong><%=rlist.get(2).getResult()%></strong></th>
			<%
				}
			%>
		</table>

		<table class="result" bordercolor="black" width="180" height="60">
			<tr>
				<td><%=rlist.get(3).getHometeam()%></td>
				<td><%=rlist.get(3).getHomescore()%></td>
			</tr>
			<tr>
				<td><%=rlist.get(3).getAwayteam()%></td>
				<td><%=rlist.get(3).getAwayscore()%></td>
			</tr>
			<%
				if (rlist.get(3).getResult().equals("우천취소")) {
			%>
			<th><strong><font color="#20B2AA"><%=rlist.get(3).getResult()%></font></strong></th>
			<%
				} else {
			%>
			<th><strong><%=rlist.get(3).getResult()%></strong></th>
			<%
				}
			%>
		</table>

		<table class="result" bordercolor="black" width="180" height="60">
			<tr>
				<td><%=rlist.get(4).getHometeam()%></td>
				<td><%=rlist.get(4).getHomescore()%></td>
			</tr>
			<tr>
				<td><%=rlist.get(4).getAwayteam()%></td>
				<td><%=rlist.get(4).getAwayscore()%></td>
			</tr>
			<%
				if (rlist.get(4).getResult().equals("우천취소")) {
			%>
			<th><strong><font color="#20B2AA"><%=rlist.get(4).getResult()%></font></strong></th>
			<%
				} else {
			%>
			<th><strong><%=rlist.get(4).getResult()%></strong></th>
			<%
				}
			%>
		</table>


	</main>



</body>
</html>