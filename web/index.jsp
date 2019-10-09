<%--
  Created by IntelliJ IDEA.
  User: HelloWorld
  Date: 2019/9/11
  Time: 9:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页跳转登录</title>
    <script>
      location.href="<%=request.getContextPath()%>/user/toLogin";
    </script>
  </head>
  <body>

  </body>
</html>
