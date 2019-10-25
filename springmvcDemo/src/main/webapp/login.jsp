<%--
  Created by IntelliJ IDEA.
  User: 96971
  Date: 2019/4/21
  Time: 0:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${ctx}/user2/login" method="post">
    <%--如果使用的是@RequestMapping则需要下面的，如果使用的是@PostMapping则不需要下面的--%>
    <%--<input type="hidden" name="_method" value="put">--%>
    <%--这里的name值要与控制器方法里的形参值一致--%>
    <input type="text" name="name"><br>
    <input type="password" name="password"><br>
    <input type="text" name="birth"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
