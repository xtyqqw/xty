<%--
  Created by IntelliJ IDEA.
  User: HelloWorld
  Date: 2019/9/9
  Time: 21:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页</title>
    <script src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#imgCode").click(function () {
                var time=new Date().getTime();
                $("#imgCode").attr("src","<%=request.getContextPath()%>/validateCodeServlet?time"+time)
            });
        });
    </script>
  </head>
  <body>
      <form action="<%=request.getContextPath()%>/user/login" method="post">
        <span style="color: red">${msg}</span><br>
        用户名:<input type="text" name="name" id="name" placeholder="请输入用户名"><br>
        密码:<input type="password" name="pwd" id="pwd" placeholder="请输入密码"><br>
        验证码:<input type="text" id="code" name="code" placeholder="请输入验证码"><img id="imgCode" src="<%=request.getContextPath()%>/validateCodeServlet"><br>
        <input type="submit" value="提交">
      </form>
  </body>
</html>
