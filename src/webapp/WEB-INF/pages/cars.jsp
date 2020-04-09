<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<body>
<%--<c:forEach var="msq" items="${messages}">--%>
<%--    <h1>${msq}</h1>--%>
<%--</c:forEach>--%>
<c:forEach items="${names}" var="msq"><h1 border ="1" width="500" align="center">${msq}</h1></c:forEach>
<table border ="1" width="500" align="center">
    <tr>
        <th><b>Имя машины</b></th>
        <th><b>Серия машины</b></th>
        <th><b>Срок годности</b></th>
    </tr>
    <c:forEach items="${messages}" var="qwe">
        <tr>
            <td>${qwe.name}</td>
            <td>${qwe.series}</td>
            <td>${qwe.oldCar}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
