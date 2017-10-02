<%--
  Created by IntelliJ IDEA.
  User: Ninee
  Date: 2017/10/2
  Time: 17:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ShareFree.login</title>
    <link rel="stylesheet" type="text/css" href="login/css/normalize.css" />
    <link rel="stylesheet" type="text/css" href="login/css/demo.css" />
    <link rel="stylesheet" type="text/css" href="login/css/component.css" />
    <script src="login/js/html5.js"></script>
</head>
<script type="text/javascript">
    function login() {
        var loginform=document.getElementById("login_form");
        loginform.action="/login.do";
        loginform.submit();
    }
</script>
<body>
<div class="container demo-1">
    <div class="content">
        <div id="large-header" class="large-header">
            <canvas id="demo-canvas"></canvas>
            <div class="logo_box">
                <h3>欢迎你</h3>
                <form action="/login.do" name="login_form" id="login_form"  method="post">
                    <div class="input_outer">
                        <span class="u_user"></span>
                        <input name="username" class="text" style="color: #FFFFFF !important" type="text" placeholder="请输入账户">
                    </div>
                    <div class="input_outer">
                        <span class="us_uer"></span>
                        <input name="password" class="text" style="color: #FFFFFF !important; position:absolute; z-index:100;"value="" type="password" placeholder="请输入密码">
                    </div>
                    <div class="mb2"><a class="act-but submit" onclick="login()" style="color: #FFFFFF">登录</a></div>
                </form>
            </div>
        </div>
    </div>
</div><!-- /container -->
<script src="login/js/TweenLite.min.js"></script>
<script src="login/js/EasePack.min.js"></script>
<script src="login/js/rAF.js"></script>
<script src="login/js/demo-1.js"></script>
<div style="text-align:center;">
</div>
</body>
</html>
