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
background-color: #FF4500;
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

			<th><strong>한화 이글스</strong></th>

			<tr>
				<td>연고지 : 대전광역시</td>
			</tr>
			<tr>
				<td>단장 : 정민철, 감독 : 카를로스 수베로</td>
			</tr>
			<tr>
				<td>팀 연혁 : 빙그레 이글스 (1986~1993) / 한화 이글스 (1994~)</td>
			</tr>
			<tr>
				<td>우승년도 : 1999</td>
			</tr>
			<tr>
				<td>순위 : <% TeamDao dao = new TeamDao(); String rank = dao.onerank("한화"); out.println(rank); %></td>
			</tr>
			<tr>
				<td>홈구장 : 대전 한화생명 이글스파크, 청주종합운동장 야구장</td>
			</tr>

		</table>


	</main>


</body>
</html>