<%--
  Created by IntelliJ IDEA.
  User: Mr.Yan
  Date: 2019/6/14
  Time: 0:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
    <div>
        <h5>${msg}</h5>
        <form method="post" action="${pageContext.request.contextPath}/user/login">
            用户名：<input type="text" name="username"/><br>
            密码：<input type="text" name="password"/><br>
            <input type="submit"/>
        </form>
    </div>
</body>
</html>
