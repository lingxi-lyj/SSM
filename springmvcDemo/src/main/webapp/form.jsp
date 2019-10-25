<%--
  Created by IntelliJ IDEA.
  User: 96971
  Date: 2019/4/20
  Time: 17:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--请求路径如何写， 永远写"/"
    "/"代表什么？
    此时的上下文处于容器当中，servlet容器，即Tomcat
    /项目名称/URI--%>
    <form action="${ctx}/web/m2" method="post">
        <input type="submit" value="提交">
    </form>
    <form action="${ctx}/web/m4" method="post">
        <input type="submit" value="提交">
    </form>
    <form action="${ctx}/web/m5" method="post">
        <input type="submit" value="提交">
    </form>
    <form action="${ctx}/web/m6" method="post">
        <input type="hidden" name="_method" value="DELETE">
        <input type="submit" value="提交">
    </form>
    <form action="${ctx}/json2/add2" method="post">
        姓名<input type="text" name="name"><br>
        密码<input type="password" name="pwd"><br>
        <input type="submit" value="form表单提交">
    </form>
</body>
</html>
