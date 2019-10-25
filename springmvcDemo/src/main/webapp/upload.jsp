<%--
  Created by IntelliJ IDEA.
  User: 96971
  Date: 2019/4/22
  Time: 13:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--添加一个enctype="multipart/form-data"用于后台解释，要不然提交不了，文件上传要用给后台--%>
<form action="${ctx}/file/upload" method="post" enctype="multipart/form-data">
    <input type="file" name="file"><br>
    <input type="submit" value="上传">
</form>
</body>
</html>
