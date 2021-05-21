<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
	<title><spring:message code="member.register"/></title>
</head>
<body>
	<p>
		<%-- <strong>${formData.name}님</strong> 회원 가입을 완료했습니다. --%>
		<spring:message code="register.done">
			<spring:argument value="${registerRequest.name}"/>
			<spring:argument value="${registerRequest.email}"/>
		</spring:message>
	</p>
	<p>
		<a href="<c:url value='/main'/>">[<spring:message code="go.main"/>]</a>
	</p>
</body>
</html>