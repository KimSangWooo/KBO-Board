<%@page import="PlayersData.Pitchers"%>
<%@page import="java.util.List"%>
<%@page import="Dao.PlayerDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<style>
@import
	url('https://fonts.googleapis.com/css2?family=Song+Myung&display=swap')
	;

th {
	font-size: 19px;
	background-color: #F0FFFF;
	font-style: italic
}

tr {
	font-size: 14px;
	font-weight: bold
}

.ft {
	margin-top: 60px;
	margin-left: 25px;
	float: left;
	background-color: #FFFFF;
	font-size: 17px;
}

table {
	border-collapse: seperate;
	background-color: #B0E0E6;
}
</style>
<title>Insert title here</title>


</head>
<body>
	<%
		PlayerDao dao = new PlayerDao();
	List<Pitchers> listera = dao.eraTop5();
	List<Pitchers> listwin = dao.winsTop5();
	List<Pitchers> listkk = dao.kTop5();
	List<Pitchers> listsave = dao.saveTop5();
	List<Pitchers> listInning = dao.inningTop5();
	%>

	<main>

		<table class="ft" width="260" height="150">


			<th><strong>평균자책 top5</strong></th>
			<tr>
				<td><%=1%></td>
				<td><%=listera.get(0).getName()%></td>
				<td><%=listera.get(0).getTeam()%></td>
				<td><%=listera.get(0).getEra()%></td>
			</tr>

			<tr>
				<td><%=2%></td>
				<td><%=listera.get(1).getName()%></td>
				<td><%=listera.get(1).getTeam()%></td>
				<td><%=listera.get(1).getEra()%></td>
			</tr>
			<tr>
				<td><%=3%></td>
				<td><%=listera.get(2).getName()%></td>
				<td><%=listera.get(2).getTeam()%></td>
				<td><%=listera.get(2).getEra()%></td>

			</tr>
			<tr>
				<td><%=4%></td>
				<td><%=listera.get(3).getName()%></td>
				<td><%=listera.get(3).getTeam()%></td>
				<td><%=listera.get(3).getEra()%></td>

			</tr>
			<tr>
				<td><%=5%></td>
				<td><%=listera.get(4).getName()%></td>
				<td><%=listera.get(4).getTeam()%></td>
				<td><%=listera.get(4).getEra()%></td>

			</tr>

		</table>

		<table class="ft" width="260" height="150">

			<th><strong>다승 top5</strong></th>

			<tr>
				<td id="num"><%=1%></td>
				<td><%=listwin.get(0).getName()%></td>
				<td><%=listwin.get(0).getTeam()%></td>
				<td><%=listwin.get(0).getWins()%></td>
			</tr>

			<tr>
				<td id="num"><%=2%></td>
				<td><%=listwin.get(1).getName()%></td>
				<td><%=listwin.get(1).getTeam()%></td>
				<td><%=listwin.get(1).getWins()%></td>
			</tr>
			<tr>
				<td id="num"><%=3%></td>
				<td><%=listwin.get(2).getName()%></td>
				<td><%=listwin.get(2).getTeam()%></td>
				<td><%=listwin.get(2).getWins()%></td>

			</tr>
			<tr>
				<td id="num"><%=4%></td>
				<td><%=listwin.get(3).getName()%></td>
				<td><%=listwin.get(3).getTeam()%></td>
				<td><%=listwin.get(3).getWins()%></td>

			</tr>
			<tr>
				<td id="num"><%=5%></td>
				<td><%=listwin.get(4).getName()%></td>
				<td><%=listwin.get(4).getTeam()%></td>
				<td><%=listwin.get(4).getWins()%></td>

			</tr>

		</table>

		<table class="ft" width="260" height="150">

			<th><span>탈삼진 top5</span></th>

			<tr>
				<td><%=1%></td>
				<td><%=listkk.get(0).getName()%></td>
				<td><%=listkk.get(0).getTeam()%></td>
				<td><%=listkk.get(0).getKk()%></td>
			</tr>

			<tr>
				<td><%=2%></td>
				<td><%=listkk.get(1).getName()%></td>
				<td><%=listkk.get(1).getTeam()%></td>
				<td><%=listkk.get(1).getKk()%></td>
			</tr>
			<tr>
				<td><%=3%></td>
				<td><%=listkk.get(2).getName()%></td>
				<td><%=listkk.get(2).getTeam()%></td>
				<td><%=listkk.get(2).getKk()%></td>

			</tr>
			<tr>
				<td><%=4%></td>
				<td><%=listkk.get(3).getName()%></td>
				<td><%=listkk.get(3).getTeam()%></td>
				<td><%=listkk.get(3).getKk()%></td>

			</tr>
			<tr>
				<td><%=5%></td>
				<td><%=listkk.get(4).getName()%></td>
				<td><%=listkk.get(4).getTeam()%></td>
				<td><%=listkk.get(4).getKk()%></td>

			</tr>

		</table>

		<table class="ft" width="260" height="150">

			<th><span>세이브 top5</span></th>

			<tr>
				<td><%=1%></td>
				<td><%=listsave.get(0).getName()%></td>
				<td><%=listsave.get(0).getTeam()%></td>
				<td><%=listsave.get(0).getSaves()%></td>
			</tr>

			<tr>
				<td><%=2%></td>
				<td><%=listsave.get(1).getName()%></td>
				<td><%=listsave.get(1).getTeam()%></td>
				<td><%=listsave.get(1).getSaves()%></td>
			</tr>
			<tr>
				<td><%=3%></td>
				<td><%=listsave.get(2).getName()%></td>
				<td><%=listsave.get(2).getTeam()%></td>
				<td><%=listsave.get(2).getSaves()%></td>

			</tr>
			<tr>
				<td><%=4%></td>
				<td><%=listsave.get(3).getName()%></td>
				<td><%=listsave.get(3).getTeam()%></td>
				<td><%=listsave.get(3).getSaves()%></td>

			</tr>
			<tr>
				<td><%=5%></td>
				<td><%=listsave.get(4).getName()%></td>
				<td><%=listsave.get(4).getTeam()%></td>
				<td><%=listsave.get(4).getSaves()%></td>

			</tr>

		</table>

		<table class="ft" width="260" height="150">

			<th><span>이닝 top5</span></th>

			<tr>
				<td><%=1%></td>
				<td><%=listInning.get(0).getName()%></td>
				<td><%=listInning.get(0).getTeam()%></td>
				<td><%=listInning.get(0).getInningInt() + " " + listInning.get(0).getInningFlo()%></td>
			</tr>

			<tr>
				<td><%=2%></td>
				<td><%=listInning.get(1).getName()%></td>
				<td><%=listInning.get(1).getTeam()%></td>
				<td><%=listInning.get(1).getInningInt() + " " + listInning.get(1).getInningFlo()%></td>
			</tr>
			<tr>
				<td><%=3%></td>
				<td><%=listInning.get(2).getName()%></td>
				<td><%=listInning.get(2).getTeam()%></td>
				<td><%=listInning.get(2).getInningInt() + " " + listInning.get(2).getInningFlo()%></td>

			</tr>
			<tr>
				<td><%=4%></td>
				<td><%=listInning.get(3).getName()%></td>
				<td><%=listInning.get(3).getTeam()%></td>
				<td><%=listInning.get(3).getInningInt() + " " + listInning.get(3).getInningFlo()%></td>

			</tr>
			<tr>
				<td><%=5%></td>
				<td><%=listInning.get(4).getName()%></td>
				<td><%=listInning.get(4).getTeam()%></td>
				<td><%=listInning.get(4).getInningInt() + " " + listInning.get(4).getInningFlo()%></td>

			</tr>

		</table>

		     
	</main>
</body>
</html>