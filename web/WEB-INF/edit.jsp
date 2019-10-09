<%--
  Created by IntelliJ IDEA.
  User: HelloWorld
  Date: 2019/9/11
  Time: 11:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改保存页面</title>
</head>
<body>
    <form action="<%=request.getContextPath()%>/user/edit" method="post">
        <input type="hidden" name="uid" value="${user.uid}">
        姓名：<input type="text" name="name" value="${user.name}">
        电话：<input type="text" name="phone" value="${user.phone}">
        <input type="submit" value="保存">
    </form>
</body>
</html>
