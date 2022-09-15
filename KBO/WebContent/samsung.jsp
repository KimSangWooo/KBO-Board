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
background-color: #0000FF;
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

			<th><strong>삼성 라이온즈</strong></th>

			<tr>
				<td>연고지 : 대구광역시</td>
			</tr>
			<tr>
				<td>단장 : 홍준학, 감독대행 : 박진만</td>
			</tr>
			<tr>
				<td>팀 연혁 : 삼성 라이온즈 (1982~)</td>
			</tr>
			<tr>
				<td>우승년도 : 1985, 2002, 2005, 2006, 2011, 2012, 2013, 2014</td>
			</tr>
			<tr>
				<td>순위 : <% TeamDao dao = new TeamDao(); String rank = dao.onerank("삼성"); out.println(rank); %></td>
			</tr>
			<tr>
				<td>홈구장 : 대구 삼성 라이온즈 파크</td>
			</tr>

		</table>


	</main>


</body>
</html>