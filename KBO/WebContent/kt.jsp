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
background-color: #000000;
font-size : 40px;
text-align : center;
color : #FFFFFF;
}

td {
font-size : 24px;
}

</style>
</head>
<body>

	<main>
		<table width="680" height="370">

			<th><strong>KT 위즈</strong></th>

			<tr>
				<td>연고지 : 경기도 수원시</td>
			</tr>
			<tr>
				<td>단장 : 나도현, 감독 : 이강철</td>
			</tr>
			<tr>
				<td>팀 연혁 : KT 위즈 (2013~)</td>
			</tr>
			<tr>
				<td>우승년도 : 2021</td>
			</tr>
			<tr>
				<td>순위 : <%
					TeamDao dao = new TeamDao();
				String rank = dao.onerank("KT");
				out.println(rank);
				%></td>
			</tr>
			<tr>
				<td>홈구장 : 수원 케이티 위즈 파크</td>
			</tr>

		</table>


	</main>

</body>
</html>