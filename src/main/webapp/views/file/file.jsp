<%--
  Created by IntelliJ IDEA.
  User: zhu
  Date: 2018/9/13
  Time: 1:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>简单文件上传示例</title>
</head>
<body>
<form method="post" action="/file/upload" enctype="multipart/form-data">
    <input type="file" name="multiFiles"/><br/>
    <input type="file" name="multiFiles"/><br/>
    <input type="file" name="multiFiles"/><br/>
    <input type="submit" value="上传"/>
</form>
<div>
    <h3>code:${code},message:${message}</h3>
</div>
</body>
</html>
