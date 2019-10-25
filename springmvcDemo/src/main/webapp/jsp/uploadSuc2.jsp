<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 96971
  Date: 2019/4/22
  Time: 15:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--多个文件上传--%>
<c:forEach items="${filelist}" var="obj">
    <h3>${obj}</h3>
</c:forEach>
</body>
</html>
