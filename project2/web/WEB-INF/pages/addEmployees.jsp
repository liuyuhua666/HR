<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2018/1/31
  Time: 19:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"/>
    <title></title>
</head>
<body>
<c:forEach items="${sessionScope.employeeList}" var="employee">
    <c:if test="${employee.e_workstatus==0}">
        <a href=toAddEmployee?e_id=${employee.e_id}>${employee.e_realname}</a>
    </c:if>
</c:forEach>
</body>
</html>