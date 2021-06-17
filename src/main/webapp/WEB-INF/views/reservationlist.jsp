<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>reservationlist.jsp</h2>
	로그인아이디: ${sessionScope.loginMember} <br>
	<table>
		<tr>
			<td>예약아이디</td>
			<td>예약날짜</td>
		</tr>
		<c:forEach var="reservation" items="${reservationList}">
			<tr>
				<td>${reservation.rid}</td>
				<td>${reservation.rdate}</td>
			</tr>
		</c:forEach>
	</table>
	
	
</body>
</html>