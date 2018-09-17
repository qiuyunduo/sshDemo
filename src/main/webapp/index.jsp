<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
    <script type="text/javascript">
        alert("sds");
        function test() {
            alert("sdsdsddd....");
            $.ajax({
                url:"/ssh/index/test",
                type:"GET",
                dataType:"json",
                success:function (data) {
                    alert(data[1].message);
                    alert(data[0]);
                    alert(data[1].rank1.name);
                    alert(data[1].rank1.level);
                    alert((data[1].ranks)[0].name)
                    alert((data[1].ranks)[1].name)
                }
            },"json");
        }

    </script>
</head>
<body>
<h2>Hello World!</h2>
<input type="button" onclick="javascript:test()" value="点一下">
</body>
</html>
