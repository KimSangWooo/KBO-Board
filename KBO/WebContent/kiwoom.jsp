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
	background-color: #800000;
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

			<th><strong>키움 히어로즈</strong></th>

			<tr>
				<td>연고지 : 서울특별시</td>
			</tr>
			<tr>
				<td>단장 : 장정석, 감독 : 김종국</td>
			</tr>
			<tr>
				<td>팀 연혁 : 우리 히어로즈(2008) / 서울 히어로즈(2008~2009) / 넥센
					히어로즈(2010~2018) / 키움 히어로즈(2019~)</td>
			</tr>
			<tr>
				<td>우승년도 : 0회</td>
			</tr>
			<tr>
				<td>순위 : <%
					TeamDao dao = new TeamDao();
				String rank = dao.onerank("키움");
				out.println(rank);
				%></td>
			</tr>
			<tr>
				<td>홈구장 : 고척 스카이돔</td>
			</tr>

		</table>


	</main>
</body>
</html>