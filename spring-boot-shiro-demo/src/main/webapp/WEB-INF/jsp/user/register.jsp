<%--
  Created by IntelliJ IDEA.
  User: doco
  Date: 2017/1/19
  Time: 16:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8"/>
    <title>用户注册</title>
    <link rel="stylesheet" type="text/css" href="/css/easyUI/themes/default/easyui.css"/>
    <link rel="stylesheet" type="text/css" href="/css/easyUI/themes/icon.css"/>

    <script type="text/javascript" src="/js/easyUI/jquery.min.js"></script>
    <script type="text/javascript" src="/js/easyUI/jquery.easyui.min.js"></script>
    <script type="text/javascript">
        $.extend($.fn.validatebox.defaults.rules, {
            equals:{
                validator: function(value, param){
                    //value: 当前值
                    //param: 其他参数
                    return value === $(param[0]).val();
                },
                message:'两次密码不一致。'
            }
        });
        var USER = {};

        USER.onSubmit = function(){
            $('#user_edit_form').form('submit');
        }

        USER.onClear = function(){
            $('#user_edit_form').form('clear');
        }

        $(function(){
           console.log('Hello World.');
        });
    </script>
</head>
<body>
<h2>用户注册</h2>
<div class="easyui-panel" style="width: 100%;padding: 10px;">
    <form id="user_edit_form" action="register" method="post">
        <table>
            <tr>
                <td>用户名</td>
                <td><input type="text" class="easyui-textbox" name="username" required="required"/></td>
            </tr>
            <tr>
                <td>登录账户</td>
                <td><input type="text" class="easyui-textbox" name="account" required="required"/></td>
            </tr>
            <tr>
                <td>密码</td>
                <td><input type="password" class="easyui-textbox" id="passwd" name="password" required="required"/></td>
            </tr>
            <tr>
                <td>确认密码</td>
                <td><input type="password" class="easyui-textbox" name="confirm_password" required="required"
                           validType="equals['#passwd']"/></td>
            </tr>
            <tr style="text-align: center;">
                <td colspan="2">
                    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="USER.onSubmit()">注册</a>
                    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="USER.onClear()">重置</a>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
