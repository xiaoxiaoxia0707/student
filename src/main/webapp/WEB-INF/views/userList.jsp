<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>用户信息列表页面</title>
</head>
<body>
<table width="100%" border=1>
    <tr>
        <td>Uid</td>
        <td>Username</td>
        <td>Password</td>
        <td>Name</td>
        <td>Emali</td>
        <td>Phone</td>
        <td>Addr</td>
        <td>State</td>
        <td>Code</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${list}" var="user">
    <tr>
        <td>
            <input type="checkbox" name="user" value="${user.uid}">
        </td>
        <td>${user.username }</td>
        <td>${user.password }</td>
        <td>${user.name }</td>
        <td>${user.emali }</td>
        <td>${user.phone }</td>
        <td>${user.addr }</td>
        <td>${user.state }</td>
        <td>${user.code }</td>
        <td>
            <a href="${pageContext.request.contextPath }/rest/user/editor?uid=${user.uid}" rel="external nofollow">修改</a>
            <a href="${pageContext.request.contextPath }/rest/user/del?uid=${user.uid}" rel="external nofollow">删除</a>
        </td>

    </tr>
    </c:forEach>
</body>
</html>
