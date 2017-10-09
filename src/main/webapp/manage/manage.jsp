<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html class="no-js">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Sharefree Admin DashBoard</title>
<meta name="description" content="这是一个 index 页面">
<meta name="keywords" content="index">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<meta name="renderer" content="webkit">
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="icon" type="image/png" href="assets/i/favicon.png">
<link rel="apple-touch-icon-precomposed" href="assets/i/app-icon72x72@2x.png">
<meta name="apple-mobile-web-app-title" content="Amaze UI" />
<link rel="stylesheet" href="assets/css/amazeui.min.css"/>
<link rel="stylesheet" href="assets/css/admin.css">
    <link rel="stylesheet" href="assets/css/bootstrap.min.css">
<script src="assets/js/jquery.min.js"></script>
<script src="assets/js/app.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script src="https://unpkg.com/wangeditor/release/wangEditor.min.js"></script>
</head>

<!--[if lte IE 9]><p class="browsehappy">升级你的浏览器吧！ <a href="http://se.360.cn/" target="_blank">升级浏览器</a>以获得更好的体验！</p><![endif]-->
</head>

<script type="text/javascript">
    $(function () {
        var E = window.wangEditor;
        var editor = new E('#editorwan')
        editor.create()
    })
</script>
<script>
    $(function() {
        $("#myButtons3 .btn").click(function(){
            $(this).button('loading').delay(1000).queue(function() {
                $(this).button('reset');
            });
        });
    });
</script>
<body>
<header class="am-topbar admin-header">
  <div class="am-topbar-brand"><img src="assets/i/logo.png"></div>

  <div class="am-collapse am-topbar-collapse" id="topbar-collapse">
    <ul class="am-nav am-nav-pills am-topbar-nav admin-header-list">

      <li class="soso">

<p>
	<select data-am-selected="{btnWidth: 70, btnSize: 'sm', btnStyle: 'default'}">
          <option value="b">全部</option>
          <option value="o">产品</option>
          <option value="o">会员</option>
        </select>
</p>

<p class="ycfg"><input type="text" class="am-form-field am-input-sm" placeholder="圆角表单域" /></p>
<p><button class="am-btn am-btn-xs am-btn-default am-xiao"><i class="am-icon-search"></i></button></p>
 </li>
      <li class="am-hide-sm-only" style="float: right;"><a href="javascript:;" id="admin-fullscreen"><span class="am-icon-arrows-alt"></span> <span class="admin-fullText">开启全屏</span></a></li>
    </ul>
  </div>
</header>

<div class="am-cf admin-main">
<div class="nav-navicon admin-main admin-sidebar">
    <div class="sideMenu am-icon-dashboard" style="color:#aeb2b7; margin: 10px 0 0 0;">ShareFree</div>
    <div class="sideMenu">
      <h3 class="am-icon-flag"><em></em> <a href="#">文章</a></h3>
      <ul>
        <li><a href="">写文章</a></li>
        <li><a href="">发布文章</a></li>
        <li><a href="">文章管理</a></li>
        <li><a href="">草稿夹</a></li>
      </ul>
      <h3 class="am-icon-cart-plus"><em></em> <a href="#"> 工具</a></h3>
      <ul>
        <li><a href="">偏好设置</a></li>
        <li><a href="">分类管理</a></li>
        <li><a href="">导航管理</a></li>
        <li><a href="">链接管理</a></li>
        <li><a href="">用户管理</a></li>
        <li><a href="">插件管理</a></li>
        <li><a href="">插件管理</a></li>
        <li><a href="">其他</a></li>
      </ul>
      <h3 class="am-icon-volume-up"><em></em> <a href="#">信息通知</a></h3>
      <ul>
        <li><a href="">评论管理</a> </li>
      </ul>
      <h3 class="am-icon-gears"><em></em> <a href="#">关于</a></h3>
      <ul>
        <li><a href="">关于</a></li>
      </ul>
    </div>
    <!-- sideMenu End -->
    <script type="text/javascript">
			jQuery(".sideMenu").slide({
				titCell:"h3", //鼠标触发对象
				targetCell:"ul", //与titCell一一对应，第n个titCell控制第n个targetCell的显示隐藏
				effect:"slideDown", //targetCell下拉效果
				delayTime:300 , //效果时间
				triggerTime:150, //鼠标延迟触发时间（默认150）
				defaultPlay:true,//默认是否执行效果（默认true）
				returnDefault:true //鼠标从.sideMen移走后返回默认状态（默认false）
				});
		</script>
</div>

<div class=" admin-content">
    <div class="admin">
        <div class="container-fluid">
            <div class="row-fluid">
                <div class="span12">
                    <h5><small>标题：</small></h5>
                    <input type="text" class="form-control" placeholder="在此输入标题">
                    <h5><small>正文：</small></h5>
                </div>
                <div id="editorwan"></div>
                <div class="form-group">
                    <h5><small>文件上传<a href="#" class="tooltip-test" data-toggle="tooltip" title="上传的为图片格式.png.jpg设置文章显示图片">(?)</a></small></h5>
                    <label class="sr-only" for="inputfile">文件输入</label>
                    <input type="file" id="inputfile">
                </div>
                <div id="myButtons3" class="bs-example">
                    <h5><small>标签：(使用赢状态下的“;”符号进行分隔)</small></h5>
                    <input type="text" class="form-control" placeholder="标签1;标签2;标签3;">
                    <h5><small>链接：(其他人访问的地址)</small></h5>
                    <input type="text" class="form-control" placeholder="/xxx">
                    <h5><small>说说出你的心情：</small></h5>
                    <textarea class="form-control" rows="3"></textarea>
                    </br>
                    <button type="button" class="btn btn-primary" data-loading-text="Loading...">取消发布
                    </button>&nbsp;&nbsp;&nbsp;&nbsp;
                    <button type="button" class="btn btn-primary" data-loading-text="Loading...">发布
                    </button></br></br></br>
                </div>
             </div>
        </div>
    </div>
</div>



<!--[if lt IE 9]>
<script src="http://libs.baidu.com/jquery/1.11.1/jquery.min.js"></script>
<script src="http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js"></script>
<script src="assets/js/polyfill/rem.min.js"></script>
<script src="assets/js/polyfill/respond.min.js"></script>
<script src="assets/js/amazeui.legacy.js"></script>
<![endif]-->
<!--[if (gte IE 9)|!(IE)]><!--> 
<script src="assets/js/amazeui.min.js"></script>
<!--<![endif]-->
</div>
</body>
</html>