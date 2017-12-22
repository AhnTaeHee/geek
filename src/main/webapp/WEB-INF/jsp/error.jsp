<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:choose>
		<c:when test="${status == 404}">
			페이지를 찾을 수 없습니다.
		</c:when>
		<c:otherwise>
			오류가 발생했습니다.
			<!--
				Request URL : ${requestUrl}
				Exception Message : ${exception.message}
					<c:forEach items="${exception.stackTrace}" var="el">${el}
					</c:forEach>
			-->
		</c:otherwise>
	</c:choose>
</body>
</html>