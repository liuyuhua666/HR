<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2018/2/3
  Time: 11:59
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
<div>
    用户名：${sessionScope.employee.e_name}<br>
    密码：${sessionScope.employee.e_password}<br>
    真实姓名：${sessionScope.employee.e_realname}<br>
    年龄：${sessionScope.employee.e_age}<br>
    民族：${sessionScope.employee.e_ethnicity}<br>
    电话：${sessionScope.employee.e_phone}<br>
    婚姻状态：${sessionScope.employee.e_marrige}<br>
    住址： ${sessionScope.employee.e_address}<br>
    公司：${sessionScope.employee.e_cname}<br>
    部门：${sessionScope.employee.e_dname}<br>
    职位：${sessionScope.employee.e_jname}<br>
    基本工资${sessionScope.employee.e_basicwage}<br>
    入职时间：${sessionScope.employee.e_hiretime}<br>
    上班时间：${sessionScope.employee.e_workstarttime}<br>
    下班时间：${sessionScope.employee.e_workendtime}<br>
    状态：
    <c:choose>
        <c:when test="${sessionScope.employee.e_workstatus==2}"><%--如果--%>
            ${"试用期"}
        </c:when>
        <c:when test="${sessionScope.employee.e_workstatus==3}"><%--如果--%>
            ${"在职"}
        </c:when>
        <c:otherwise><%--否则--%>
            ${"离职"}
        </c:otherwise>
    </c:choose>
</div>
<a href="returnEmployeeMain">返回</a>
</body>
</html>