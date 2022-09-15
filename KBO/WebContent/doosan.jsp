<%@page import="Dao.TeamDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
table {
	width: 100%;
	border-collapse: seperate;
	border-spacing: 20px 30px;
}

th {
	background-color: #FFFAFA;
	font-size: 40px;
	text-align: center;
}

td {
	font-size: 24px;
}
</style>
</head>

<body>


	<main>
		<table width="680" height="370">

			<th><strong>두산 베어스</strong></th>

			<tr>
				<td>연고지 : 서울특별시</td>
			</tr>
			<tr>
				<td>단장 : 정민철, 감독 : 카를로스 수베로</td>
			</tr>
			<tr>
				<td>팀 연혁 : OB 베어스 (1982~1998) / 두산 베어스 (1999~)</td>
			</tr>
			<tr>
				<td>우승년도 : 1982(OB), 1995(OB), 2001(두산), 2015(두산), 2016(두산),
					2019(두산)</td>
			</tr>
			<tr>
				<td>순위 : <%
					TeamDao dao = new TeamDao();
				String rank = dao.onerank("두산");
				out.println(rank);
				%></td>
			</tr>
			<tr>
				<td>홈구장 : 서울 잠실 종합운동장 야구장</td>
			</tr>

		</table>


	</main>

</body>
</html>