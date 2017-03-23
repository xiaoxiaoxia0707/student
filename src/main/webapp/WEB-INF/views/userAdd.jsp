<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加用户页面</title>
</head>
<body>
<form action="<%=basePath%>rest/user/add" method="post">
  <table border="1" width="400">
    <tr>
      <td>Uid</td>
      <td><input type="text" name="Uid" value=""/></td>
    </tr>
    <tr>
      <td>Username</td>
      <td><input type="text" name="Username" value=""/></td>
    </tr>
    <tr>
      <td>Password</td>
      <td><input type="text" name="Password" value=""/></td>
    </tr>
    <tr>
      <td>Name</td>
      <td><input type="text" name="Name" value=""/></td>
    </tr>
    <tr>
      <td>Emali</td>
      <td><input type="text" name="Emali" value=""/></td>
    </tr>
    <tr>
      <td>Phone</td>
      <td><input type="text" name="Phone" value=""/></td>
    </tr>
    <tr>
      <td>State</td>
      <td><input type="text" name="State" value=""/></td>
    </tr>
    <tr>
      <td>Addr</td>
      <td><input type="text" name="Addr" value=""/></td>
    </tr>
    <tr>
      <td>Code</td>
      <td><input type="text" name="Code" value=""/></td>
    </tr>
    <tr>
      <td colspan="2"><input type="submit" value="添加"/></td>
    </tr>
  </table>
</form>
</body>
</html>
