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
background-color: #B90000;
font-size : 40px;
text-align : center;
}

td {
font-size : 24px;
}

</style>
</head>
<body>

	<main>
		<table width="680" height="370">

			<th><strong>LG 트윈스</strong></th>

			<tr>
				<td>연고지 : 서울특별시</td>
			</tr>
			<tr>
				<td>단장 : 차명석, 감독 : 류지현</td>
			</tr>
			<tr>
				<td>팀 연혁 : MBC 청룡 (1982~1989) / LG 트윈스 (1990~)</td>
			</tr>
			<tr>
				<td>우승년도 : 1990, 1994</td>
			</tr>
			<tr>
				<td>순위 : <% TeamDao dao = new TeamDao(); String rank = dao.onerank("LG"); out.println(rank); %></td>
			</tr>
			<tr>
				<td>홈구장 : 서울 잠실 종합운동장 야구장</td>
			</tr>

		</table>


	</main>

</body>
</html>