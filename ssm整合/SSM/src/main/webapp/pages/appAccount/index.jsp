<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 96971
  Date: 2019/4/21
  Time: 15:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>APP信息管理系统</title>
    <!--    引入CSS，否则没有样式-->
    <link rel="stylesheet" href="${ctx}/static/plugins/layui/css/layui.css">

</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
    <%--这里引用文件，开头加不加斜杠都可以，建议加上，这样保证在更换了文件位置能确保能运行起来--%>
    <jsp:include page="/pages/common/header.jsp"/>

    <div class="layui-body">
        <!-- 内容主体区域 -->
        <div style="padding: 15px;">
            <table class="layui-table">
                <thead>
                <tr>
                    <td>APP账号ID</td>
                    <td>App账号编号</td>
                    <td>App介绍</td>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${appAcount}" var="item">
                    <tr>
                        <td>${item.id}</td>
                        <td>${item.no}</td>
                        <td>${item.descroption}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>

            app信息管理
        </div>
    </div>

    <div class="layui-footer">
        <!-- 底部固定区域 -->
        © layui.com - 底部固定区域
    </div>
</div>
<script src="${ctx}/static/plugins/layui/layui.js"></script>
<script>
    //JavaScript代码区域
    layui.use('element', function(){
        var element = layui.element;

    });

</script>
</body>
</html>