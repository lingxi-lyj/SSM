<%--
  Created by IntelliJ IDEA.
  User: 96971
  Date: 2019/4/22
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--多个文件上传--%>
<form action="${ctx}/file/upload2" method="post" enctype="multipart/form-data">
    <input type="file" name="file"><br>
    <input type="file" name="file"><br>
    <input type="file" name="file"><br>
    <input type="file" name="file"><br>
    <input type="file" name="file"><br>
    <input type="submit" value="上传">
</form>

</body>
</html>
