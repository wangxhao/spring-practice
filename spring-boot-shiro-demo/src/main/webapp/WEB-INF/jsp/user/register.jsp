<%--
  Created by IntelliJ IDEA.
  User: doco
  Date: 2017/1/19
  Time: 16:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8"/>
    <title>用户注册</title>
    <link rel="stylesheet" type="text/css" href="/css/easyUI/themes/default/easyui.css"/>
    <link rel="stylesheet" type="text/css" href="/css/easyUI/themes/icon.css"/>

    <script type="text/javascript" src="/js/easyUI/jquery.min.js"></script>
    <script type="text/javascript" src="/js/easyUI/jquery.easyui.min.js"></script>
    <script type="text/javascript">
        $(function(){
           console.log('Hello World.');
        });
    </script>
</head>
<body>
    <h2>用户注册</h2>
    <form action="register" method="post">
    <table>
        <tr>
            <td>用户名</td>
            <td><input type="text" class="easyui-validatebox" name="username"/></td>
        </tr>
        <tr>
            <td>登录账户</td>
            <td><input type="text" class="easyui-validatebox" name="account"/></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="password" name="password"/></td>
        </tr>
        <tr>
            <td>确认密码</td>
            <td><input type="password" name="confirm_password"/></td>
        </tr>
        <tr style="text-align: center;">
            <td colspan="2"><input type="submit" value="注册"/></td>
        </tr>
    </table>

    </form>
</body>
</html>
