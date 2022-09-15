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
background-color: 	#00008B;
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

			<th><strong>NC 다이노스</strong></th>

			<tr>
				<td>연고지 : 경상남도 창원시</td>
			</tr>
			<tr>
				<td>단장 : 임선남, 감독대행 : 강인권</td>
			</tr>
			<tr>
				<td>팀 연혁 : NC 다이노스 (2012~)</td>
			</tr>
			<tr>
				<td>우승년도 : 2020 </td>
			</tr>
			<tr>
				<td>순위 : <% TeamDao dao = new TeamDao(); String rank = dao.onerank("NC"); out.println(rank); %></td>
			</tr>
			<tr>
				<td>홈구장 : 창원 NC 파크</td>
			</tr>

		</table>


	</main>

</body>
</html>