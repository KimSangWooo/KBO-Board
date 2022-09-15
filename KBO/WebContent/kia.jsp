<%@page import="Dao.TeamDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="./resource/js/jquery-3.4.1.min.js"></script>
<title>Insert title here</title>
<style>

table {

	width: 100%;
	border-collapse: seperate;
	border-spacing: 20px 30px;
}

th {
background-color: #FF0000;
font-size : 40px;
text-align : center;
}

td {
font-size : 24px;
}

</style>
</head>
<style>

</style>
<body>
	<main>
		<table width="680" height="370">

			<th><strong>기아 타이거즈</strong></th>

			<tr>
				<td>연고지 : 광주광역시</td>
			</tr>
			<tr>
				<td>단장 : 장정석, 감독 : 김종국</td>
			</tr>
			<tr>
				<td>팀 연혁 : 해태 타이거즈 (1982~2001) / KIA 타이거즈 (2001~)</td>
			</tr>
			<tr>
				<td>우승년도 : 1883(해태), 1886(해태), 1887(해태), 1888(해태), 1889(해태),
					1991(해태), 1993(해태), 1996(해태), 1997(해태), 2009(기아), 2017(기아)</td>
			</tr>
			<tr>
				<td>순위 : <%
					TeamDao dao = new TeamDao();
				String rank = dao.onerank("kia");
				out.println(rank);
				%></td>
			</tr>
			<tr>
				<td>홈구장 : 챔피언스 필드</td>
			</tr>

		</table>


	</main>
</body>
</html>