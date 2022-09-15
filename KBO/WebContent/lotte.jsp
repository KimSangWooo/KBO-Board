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
background-color: #191970;
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

			<th><strong>롯데 자이언츠</strong></th>

			<tr>
				<td>연고지 : 부산광역시</td>
			</tr>
			<tr>
				<td>단장 : 성민규, 감독 : 래리 서튼</td>
			</tr>
			<tr>
				<td>팀 연혁 : 롯데 자이언츠(1982~)</td>
			</tr>
			<tr>
				<td>우승년도 : 1984, 1992</td>
			</tr>
			<tr>
				<td>순위 : <%
					TeamDao dao = new TeamDao();
				String rank = dao.onerank("롯데");
				out.println(rank);
				%></td>
			</tr>
			<tr>
				<td>홈구장 : 사직 야구장, 울산 문수 야구장</td>
			</tr>

		</table>


	</main>

</body>
</html>