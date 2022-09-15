<%@page import="Dao.PlayerDao"%>
<%@page import="PlayersData.Hitter"%>
<%@page import="java.util.List"%>
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

.hitter {
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
	List<Hitter> listavg = dao.avgTop5();
	List<Hitter> listhom = dao.homrunTop5();
	List<Hitter> listops = dao.opsTop5();
	List<Hitter> listhits = dao.hitTop5();
	List<Hitter> listrbi = dao.rbiTop5();
	%>

	<table class="hitter" width="260" height="150">
		<th><strong>타율 TOP5</strong></th>

		<tr>
			<td><%=1%></td>
			<td><%=listavg.get(0).getName()%></td>
			<td><%=listavg.get(0).getTeam()%></td>
			<td><%=listavg.get(0).getAvg()%></td>
		</tr>
		<!-- 첫번째 줄 끝 -->
		<tr>
			<td><%=2%></td>
			<td><%=listavg.get(1).getName()%></td>
			<td><%=listavg.get(1).getTeam()%></td>
			<td><%=listavg.get(1).getAvg()%></td>
		</tr>

		<tr>
			<td><%=3%></td>
			<td><%=listavg.get(2).getName()%></td>
			<td><%=listavg.get(2).getTeam()%></td>
			<td><%=listavg.get(2).getAvg()%></td>

		</tr>
		<tr>
			<td><%=4%></td>
			<td><%=listavg.get(3).getName()%></td>
			<td><%=listavg.get(3).getTeam()%></td>
			<td><%=listavg.get(3).getAvg()%></td>

		</tr>
		<tr>
			<td><%=5%></td>
			<td><%=listavg.get(4).getName()%></td>
			<td><%=listavg.get(4).getTeam()%></td>
			<td><%=listavg.get(4).getAvg()%></td>

		</tr>

	</table>


	<table class="hitter" width="260" height="150">
		<th><strong>홈런 TOP5</strong></th>

		<tr>
			<td><%=1%></td>
			<td><%=listhom.get(0).getName()%></td>
			<td><%=listhom.get(0).getTeam()%></td>
			<td><%=listhom.get(0).getHomerun()%></td>
		</tr>
		<!-- 첫번째 줄 끝 -->
		<tr>
			<td><%=2%></td>
			<td><%=listhom.get(1).getName()%></td>
			<td><%=listhom.get(1).getTeam()%></td>
			<td><%=listhom.get(1).getHomerun()%></td>
		</tr>

		<tr>
			<td><%=3%></td>
			<td><%=listhom.get(2).getName()%></td>
			<td><%=listhom.get(2).getTeam()%></td>
			<td><%=listhom.get(2).getHomerun()%></td>

		</tr>
		<tr>
			<td><%=4%></td>
			<td><%=listhom.get(3).getName()%></td>
			<td><%=listhom.get(3).getTeam()%></td>
			<td><%=listhom.get(3).getHomerun()%></td>

		</tr>
		<tr>
			<td><%=5%></td>
			<td><%=listhom.get(4).getName()%></td>
			<td><%=listhom.get(4).getTeam()%></td>
			<td><%=listhom.get(4).getHomerun()%></td>

		</tr>

	</table>


	<table class="hitter" width="260" height="150">
		<th><strong>OPS TOP5</strong></th>

		<tr>
			<td><%=1%></td>
			<td><%=listops.get(0).getName()%></td>
			<td><%=listops.get(0).getTeam()%></td>
			<td><%=listops.get(0).getOps()%></td>
		</tr>
		<!-- 첫번째 줄 끝 -->
		<tr>
			<td><%=2%></td>
			<td><%=listops.get(1).getName()%></td>
			<td><%=listops.get(1).getTeam()%></td>
			<td><%=listops.get(1).getOps()%></td>
		</tr>

		<tr>
			<td><%=3%></td>
			<td><%=listops.get(2).getName()%></td>
			<td><%=listops.get(2).getTeam()%></td>
			<td><%=listops.get(2).getOps()%></td>

		</tr>
		<tr>
			<td><%=4%></td>
			<td><%=listops.get(3).getName()%></td>
			<td><%=listops.get(3).getTeam()%></td>
			<td><%=listops.get(3).getOps()%></td>

		</tr>
		<tr>
			<td><%=5%></td>
			<td><%=listops.get(4).getName()%></td>
			<td><%=listops.get(4).getTeam()%></td>
			<td><%=listops.get(4).getOps()%></td>

		</tr>

	</table>


	<table class="hitter" width="260" height="150">
		<th><strong>안타 TOP5</strong></th>

		<tr>
			<td><%=1%></td>
			<td><%=listhits.get(0).getName()%></td>
			<td><%=listhits.get(0).getTeam()%></td>
			<td><%=listhits.get(0).getHits()%></td>
		</tr>
		<!-- 첫번째 줄 끝 -->
		<tr>
			<td><%=2%></td>
			<td><%=listhits.get(1).getName()%></td>
			<td><%=listhits.get(1).getTeam()%></td>
			<td><%=listhits.get(1).getHits()%></td>
		</tr>

		<tr>
			<td><%=3%></td>
			<td><%=listhits.get(2).getName()%></td>
			<td><%=listhits.get(2).getTeam()%></td>
			<td><%=listhits.get(2).getHits()%></td>

		</tr>
		<tr>
			<td><%=4%></td>
			<td><%=listhits.get(3).getName()%></td>
			<td><%=listhits.get(3).getTeam()%></td>
			<td><%=listhits.get(3).getHits()%></td>

		</tr>
		<tr>
			<td><%=5%></td>
			<td><%=listhits.get(4).getName()%></td>
			<td><%=listhits.get(4).getTeam()%></td>
			<td><%=listhits.get(4).getHits()%></td>

		</tr>

	</table>


	<table class="hitter" width="260" height="150">
		<th><strong>타점 TOP5</strong></th>

		<tr>
			<td><%=1%></td>
			<td><%=listrbi.get(0).getName()%></td>
			<td><%=listrbi.get(0).getTeam()%></td>
			<td><%=listrbi.get(0).getRbi()%></td>
		</tr>
		<!-- 첫번째 줄 끝 -->
		<tr>
			<td><%=2%></td>
			<td><%=listrbi.get(1).getName()%></td>
			<td><%=listrbi.get(1).getTeam()%></td>
			<td><%=listrbi.get(1).getRbi()%></td>
		</tr>

		<tr>
			<td><%=3%></td>
			<td><%=listrbi.get(2).getName()%></td>
			<td><%=listrbi.get(2).getTeam()%></td>
			<td><%=listrbi.get(2).getRbi()%></td>

		</tr>
		<tr>
			<td><%=4%></td>
			<td><%=listrbi.get(3).getName()%></td>
			<td><%=listrbi.get(3).getTeam()%></td>
			<td><%=listrbi.get(3).getRbi()%></td>

		</tr>
		<tr>
			<td><%=5%></td>
			<td><%=listrbi.get(4).getName()%></td>
			<td><%=listrbi.get(4).getTeam()%></td>
			<td><%=listrbi.get(4).getRbi()%></td>

		</tr>

	</table>

</body>
</html>