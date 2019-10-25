<%--
  Created by IntelliJ IDEA.
  User: 96971
  Date: 2019/4/21
  Time: 22:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="${ctx}/static/plugins/layui/css/layui.css">
    <%--<script src="${ctx}/static/plugins/jQuery/jquery-1.11.3.min.js"></script>--%>
    <style>
        form>div{
            width: 300px;
            margin: auto;
        }
    </style>
</head>
<body>
    <form class="layui-form" action="${ctx}/user4/register" method="post">
        <div class="layui-form-item">
            <label class="layui-form-label">姓名</label>
            <div class="layui-input-block">
                <input type="text" name="name" required  lay-verify="required" placeholder="请输入姓名" autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">密码</label>
                <div class="layui-input-block">
                    <input type="password" name="pwd" required  lay-verify="required" placeholder="请输入密码" autocomplete="off" class="layui-input">
                </div>

        <%--姓名<input id="name" type="text" name="name"><span id="msg"></span><br>--%>
        <%--密码<input  id="password" type="password" name="pwd"><br>--%>
        <input type="submit" value="注册">
    </form>
    <script src="${ctx}/static/plugins/layui/layui.js"></script>
<script>
    layui.use(['element','jquery','layer'], function(){
        var element = layui.element;
        // var jquery,$= layui.jquery;// var jquery,$代表把jQuery引进来。
        var jquery=$= layui.jquery;// 这里是把$等于jquery,可以把下面的函数开头的$换成jquery.。
        var layer=layui.layer;
        jquery(function () {
        $('input[name=name]').blur(function () {
            // 获取名字
            var name=$('input[name=name]').val();
            var obj={
                //这里左边的的属性加''也可以不加，但最好加上
                'name':name
            }
            $.ajax({
                url:'${ctx}/user4/checkname',
                type:'post',
                contentType:'application/json',
                data:JSON.stringify(obj),
                success:function (data) {
                    if (data.code==2000){
                        //名字可以使用
                        // $('#msg').html('用户名可以注册')
                        layer.msg("用户名可以注册");
                    }
                    else{
                        //名字不可用，已经被注册了。
                        // $('#msg').html("用户名已被注册")
                        // layer.warn("用户名已被注册");
                        layer.msg('用户名已被注册', {icon: 6});
                    }
                }
            })
        })
    })

    });

</script>

</body>
</html>
