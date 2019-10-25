<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${ctx}/static/plugins/jQuery/jquery-1.11.3.min.js"></script>
</head>
<body>
    <button id="b1">发送一个User对象给后台，并且是以Ajax形式发送</button>
    <button id="b2">发送一个一组User对象给后台，并且是以Ajax形式发送</button>
<script>
    $(function () {
        $('#b1').click(function () {
            // 这里的obj是封装数据程Ajax形式用来传递给后台的
            var obj={
                'name':"武则天",
                'pwd':"123456"
            }
            $.ajax({
                url:'${ctx}/json2/add',
                type:'post',
                //contentType的定义是保证后台能拿到数据的保证charset=utf-8,是指定编码格式，可以不写，
                contentType:'application/json;charset=utf-8',
                // 这里的data用来发送数据给后台
                data:JSON.stringify(obj),
                success:function () {
                }
            })
        })
        $('#b2').click(function () {
            var obj={
                'name':'霍元甲',
                'pwd':"1111"
            };
            var obj2={
                'name':"陈真",
                'pwd':'22222'
            };
            var arr=new Array();
            arr.push(obj);
            arr.push(obj2);
            $.ajax({
                url:'${ctx}/json2/addList',
                type:'post',
                contentType:'application/json;charset=utf-8',
                data:JSON.stringify(arr),
                success:function (data) {
                    if (data.code==2000)
                        alert("成功把数据递交给后台！")
                }
            })
        })
    })
</script>
</body>
</html>
