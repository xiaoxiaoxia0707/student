<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/3/19
  Time: 17:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>编辑用户界面</title>
</head>
<body>
<form  action="/rest/user/editor" method="post">
  修改商品信息：
  <table width="100%" border=1>
    <tr>
      <td>Uid</td>
      <td><input type="text" name="user.uid" value="${user.uid }"/></td>
    </tr>
    <tr>
      <td>Username</td>
      <td><input type="text" name="user.username" value="${user.username}"/></td>
    </tr>
    <tr>
      <td>Password</td>
      <td><input type="text" name="user.password" value="${user.password}"/></td>
    </tr>
    <tr>
      <td>Name</td>
      <td><input type="text" name="user.name" value="${user.name}"/></td>
    </tr>
    <tr>
      <td>Emali</td>
      <td><input type="text" name="user.emali" value="${user.emali}"/></td>
    </tr>
    <tr>
      <td>Phone</td>
      <td><input type="text" name="user.phone" value="${user.phone}"/></td>
    </tr>
    <tr>
      <td>State</td>
      <td><input type="text" name="user.state" value="${user.state}"/></td>
    </tr>
    <tr>
      <td>Code</td>
      <td><input type="text" name="user.code" value="${user.code}"/></td>
    </tr>

    <tr>
      <td colspan="2" align="center"><input type="submit" value="提交"/>
      </td>
    </tr>
  </table>

</form>

</body>
</html>
