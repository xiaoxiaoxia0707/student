<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/3/22
  Time: 12:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>

<head>
  <base href="<%=basePath%>">
  <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
  <title>用户管理</title>
  <link rel="stylesheet" type="text/css" href="<%=basePath%>static/css/master.css">
</head>

<body>
<div class="warp">
  <div class="head">
    <div class="title">
      <h2>管理平台</h2>
    </div>
    <div></div>
  </div>
  <div class="content">
    <div class="nav">
      <ul>
        <li>
          平台概况
        </li>
        <li>
          内容管理
        </li>
        <li>
          用户管理
        </li>
      </ul>
    </div>
    <div class="main">
      <div class="main-head">
        <h3>用户管理</h3>
      </div>
      <div class="main-content">
        <div class="title">
          <h6>新增用户</h6>
        </div>
        <div class="user-form">
          <div>
            <label>姓名：
              <input type="text" id="name">
            </label>
          </div>
          <div>
            <label>地址：
              <input type="text" id="address" />
            </label>
          </div>
          <div>
            <label>性别：
              <input type="text" id="sex">
            </label>
          </div>
          <div>
            <input type="button" value="确认保存" id="saveBtn">
          </div>
        </div>
      </div>
    </div>
  </div>
</div>
<script type="text/javascript" src="<%=basePath%>static/js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="<%=basePath%>static/js/add-student.js"></script>
</body>

</html>

