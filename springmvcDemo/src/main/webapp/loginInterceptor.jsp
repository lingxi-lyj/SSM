<%--
  Created by IntelliJ IDEA.
  User: 96971
  Date: 2019/4/23
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${ctx}/userInterceptor/login" method="post">
    账号<input type="text" name="username"><br>
    密码<input type="password" name="password"><br>
    <input type="submit" value="登录">
</form>



</body>
</html>
