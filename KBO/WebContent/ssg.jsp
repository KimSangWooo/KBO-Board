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
background-color: #DC143C;
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

			<th><strong>SSG 랜더스</strong></th>

			<tr>
				<td>연고지 : 인천광역시</td>
			</tr>
			<tr>
				<td>단장 : 류선규, 감독 : 김원형</td>
			</tr>
			<tr>
				<td>팀 연혁 : SK 와이번스 (2000 ~ 2020) / SSG 랜더스 (2021 ~)</td>
			</tr>
			<tr>
				<td>우승년도 : 2007(SK), 2008(SK), 2010(SK), 2018(SK)</td>
			</tr>
			<tr>
				<td>순위 : <% TeamDao dao = new TeamDao(); String rank = dao.onerank("SSG"); out.println(rank); %></td>
			</tr>
			<tr>
				<td>홈구장 : 인천  SSG 랜더스필드</td>
			</tr>

		</table>


	</main>


</body>
</html>