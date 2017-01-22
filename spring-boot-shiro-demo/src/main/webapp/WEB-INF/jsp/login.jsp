<%--
  Created by IntelliJ IDEA.
  User: doco
  Date: 2017/1/20
  Time: 16:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8"/>
    <title>登录</title>
    <link rel="stylesheet" type="text/css" href="/css/easyUI/themes/default/easyui.css"/>
    <link rel="stylesheet" type="text/css" href="/css/easyUI/themes/icon.css"/>

    <script type="text/javascript" src="/js/easyUI/jquery.min.js"></script>
    <script type="text/javascript" src="/js/easyUI/jquery.easyui.min.js"></script>
    <script type="text/javascript">
        var USER = {};

        USER.onSubmit = function(){
            $('#user_edit_form').form('submit');
        }
    </script>
</head>
<body>
<div class="easyui-panel" style="padding: 20px;">
    <form action="/login" method="post">
        <p>
            账号：
            <input type="text" class="easyui-textbox" name="username"/>
        </p>
        <p>
            密码：
            <input type="password" class="easyui-textbox" name="password">
        </p>
        <p>
            <a href="javascript:void(0)" class="easyui-linkbutton" onclick="USER.onSubmit()">登录</a>
        </p>
    </form>
</div>
</body>
</html>
