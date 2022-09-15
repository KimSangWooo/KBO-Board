<%@page import="PlayersData.Pitchers"%>
<%@page import="java.util.List"%>
<%@page import="PlayersData.Hitter"%>
<%@page import="Dao.PlayerDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String player = request.getParameter("player");
	PlayerDao dao = new PlayerDao();
	%>

	<table bordercolor="#40E0D0" bgcolor="#AFEEEE" width="700" height="100"
		align="center">
		<tr bgcolor="skybule" align="center">
		</tr>

		<%
			if (!dao.getPosition(player).equals("투수")) {
			Hitter h = dao.hitterRead(player);
		%>

		<tr align="center" bgcolor="#FFFFF0">
			<td>이름</td>
			<td>팀</td>
			<td>포지션</td>
			<td>타율</td>
			<td>타점</td>
			<td>홈런</td>
			<td>안타</td>
			<td>OPS</td>
			<td>타석</td>
		</tr>

		<tr align="center">
			<td><%=h.getName()%></td>
			<td><%=h.getTeam()%></td>
			<td><%=h.getPosition()%></td>
			<td><%=h.getAvg()%></td>
			<td><%=h.getRbi()%></td>
			<td><%=h.getHomerun()%></td>
			<td><%=h.getHits()%></td>
			<td><%=h.getOps()%></td>
			<td><%=h.getPa()%></td>
		</tr>

		<%
			} else if (dao.getPosition(player).equals("투수")) {
		Pitchers p = dao.pitcherRead(player);
		%>
		<tr align="center" bgcolor="#FFFFF0">
			<td>이름</td>
			<td>팀</td>
			<td>포지션</td>
			<td>평균자책점</td>
			<td>승</td>
			<td>패</td>
			<td>세이브</td>
			<td>탈삼진</td>
			<td>이닝</td>
		</tr>

		<tr align="center">
			<td><%=p.getName()%></td>
			<td><%=p.getTeam()%></td>
			<td><%=p.getPosition()%></td>
			<td><%=p.getEra()%></td>
			<td><%=p.getWins()%></td>
			<td><%=p.getLoses()%></td>
			<td><%=p.getSaves()%></td>
			<td><%=p.getKk()%></td>
			<td><%=p.getInningInt() + "  " + p.getInningFlo()%></td>
		</tr>

		<%
			} else if (dao.getPosition(player) == null) {
		%>

		<td><%="일치하는 선수가 없습니다"%></td>

		<%
			}
		%>
	
</body>
</html>