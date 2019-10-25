<%--
  Created by IntelliJ IDEA.
  User: 96971
  Date: 2019/4/21
  Time: 10:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <form action="${ctx}/dog/login" method="post">
            <input type="text" name="name"><br>
            <input type="submit" value="提交">
        </form>
</body>
</html>
