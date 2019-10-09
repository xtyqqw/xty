<%--
  Created by IntelliJ IDEA.
  User: HelloWorld
  Date: 2019/9/11
  Time: 10:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>列表页面</title>
</head>
<body>
<table width="950px" border="1px">
    <tr>
        <td>ID</td>
        <td>姓名</td>
        <td>电话</td>
        <td>创建日期</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${pb.list }" var="user">
        <tr>
            <td>${user.uid }</td>
            <td>${user.name }</td>
            <td>${user.phone }</td>
            <td><fmt:formatDate value="${user.createTime }" type="date" pattern="yyyy-MM-dd HH:mm:ss"/></td>
            <td>
                <a href="<%=request.getContextPath()%>/user/toEdit/${user.uid}">修改</a>
                <a>删除</a>
            </td>
        </tr>
    </c:forEach>
    <tr>
        <td colspan="6" align="center">
            <a href="<%=request.getContextPath()%>/user/list?currentPage=1">首页</a>
            <!-- 上一页 -->
            <c:if test="${pb.currentPage > 1 }">
                <a href="<%=request.getContextPath()%>/user/list?currentPage=${pb.currentPage-1}">上一页</a>
            </c:if>
            <!-- 区间显示页数 -->
            <c:forEach begin="${pb.currentPage - 3 > 0 ? pb.currentPage-3 : 1 }" end="${pb.currentPage + 4 < pb.totalPage ? pb.currentPage+4 : pb.totalPage }" var="i">
                <!-- 如果当前页被选中红色显示 -->
                <c:if test="${pb.currentPage == i }">
                    <a href="#" style="color: red">${i }</a>
                </c:if>
                <c:if test="${pb.currentPage !=i }">
                    <a href="<%=request.getContextPath()%>/user/list?currentPage=${i}">${i }</a>
                </c:if>
            </c:forEach>

            <!-- 下一页 -->
            <c:if test="${pb.currentPage < pb.totalPage }">
                <a href="<%=request.getContextPath()%>/user/list?currentPage=${pb.currentPage+1}">下一页</a>
            </c:if>
            <a href="<%=request.getContextPath()%>/user/list?currentPage=${pb.totalPage}">尾页</a>
            <span style="color: blue;">当前位置 ${pb.currentPage}/${pb.totalPage} ,总条数${pb.totalCount }</span>
        </td>
    </tr>
</table>

</body>
</html>