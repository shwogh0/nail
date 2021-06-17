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
	<h2>reservation.jsp</h2>
	로그인아이디: ${sessionScope.loginMember}<br>
	
	<form action="reservationdate" method="get">
		
		예약 날짜 잡기 : <input type="date" name="rdate"><br>
		예약아이디 : <input type="text" value="${sessionScope.loginMember}" name="rid"><br>
		<input type="submit" value="예약하기">
	</form>
	<a href="reservationlist">예약조회</a>
</body>
</html>