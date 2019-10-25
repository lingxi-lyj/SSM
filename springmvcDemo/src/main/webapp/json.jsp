
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${ctx}/static/plugins/jQuery/jquery-1.11.3.min.js"></script>
</head>
<body>
    <button id="b1">请求得到一个user</button>
    <button id="b2">请求得到一个map</button>
    <button id="b3">请求得到一个数组</button>
    <button id="b4">请求得到一个list</button>
    <button id="b5">请求得到一个List<>,内容为map类型key为String，value为User1</button>
<div>

</div>
<script>
    $(function () {
        $('#b1').click(function () {
            $.ajax({
                url:'${ctx}/json/m1',
                type:'post',
                success:function (data) {
                    // 这里的data.XXXX的XXXX要与Javabean的属性名一致
                   alert(data.pwd);
                   alert(data.name);
                }
            })
        })

    $('#b2').click(function () {
        $.ajax({
            url:'${ctx}/json/m2',
            type:'post',
            success:function (data) {
                alert(data.name);
                alert(data.age);
            }
        })
    })
    $('#b3').click(function () {
        $.ajax({
            url:'${ctx}/json/m3',
            type:'post',
            success:function (data) {
                for (var i=0;i<data.length;i++){
                    alert(data[i].name);
                    alert(data[i].pwd);
                }
            }
        })
    })

    $('#b4').click(function () {
        $.ajax({
            url:'${ctx}/json/m4',
            type:'post',
            success:function (data) {
                for (var i=0;i<data.length;i++){
                    alert(data[i].name);
                    alert(data[i].pwd);
                }
            }
        })
    })
    $('#b5').click(function () {
        $.ajax({
            url:'${ctx}/json/m5',
            type:'post',
            success:function (data) {
                for (var i=0;i<data.length;i++){
                    alert(data[i].u1.name);
                    alert(data[i].u1.pwd);
                    alert(data[i].u2.name);
                    alert(data[i].u2.pwd);
                }
            }
        })
    })
    })
</script>
</body>
</html>
