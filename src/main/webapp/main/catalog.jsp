<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="gb2312">
    <title>www.Sharefree.co</title>
    <link href="css/styles.css" rel="stylesheet">
    <script type="text/javascript" src="/jquery-3.2.1.min.js"></script>
    <!--[if lt IE 9]>
    <script src="js/modernizr.js"></script>
    <![endif]-->
</head>
<%--主页交互JS--%>
<script type="text/javascript" src="js/main.js"></script>
<script type="text/javascript" src="js/catalog.js"></script>
<body>
<header>
    <nav id="nav">
        <ul>
            <li><a href="main.jsp">ShareFree</a></li>
            <li><a href="javascript:catalog1()" target="_blank" id="catalog1"></a></li>
            <li><a href="javascript:catalog2()" target="_blank" id="catalog2"></a></li>
            <li><a href="javascript:catalog3()" target="_blank" id="catalog3"></a></li>
            <li><a href="javascript:catalog4()" target="_blank" id="catalog4"></a></li>
            <li><a href="javascript:catalog5()" target="_blank" id="catalog5"></a></li>
            <li><a href="javascript:catalog6()" target="_blank" id="catalog6"></a></li>
            <li><a href="javascript:catalog7()" target="_blank" id="catalog7"></a></li>
            <li><a href="" target="_blank">Connect Me</a></li>
        </ul>
        <script src="js/silder.js"></script><!--获取当前页导航 高亮显示标题-->
    </nav>
</header>
<div class="mainContent">
    <div class="ulist">
        <section><a href="#"> <img src="images/s5.jpg"></a>
            <ul>
                <h2><a href="#">18岁的年纪</a></h2>
                <p>学校赋予的所谓的”知识“</p>
            </ul>
        </section>
        <section><a href="#"><img src="images/s7.jpg"></a>
            <ul>
                <h2><a href="#">25岁的年纪</a></h2>
                <p>低头去学习社会知识和技能</p>
            </ul>
        </section>
        <section><a href="#"><img src="images/s7.jpg"></a>
            <ul>
                <h2><a href="#">30岁的年纪</a></h2>
                <p>也许是有一次的人生转折点</p>
            </ul>
        </section>
    </div>
</div>
<div class="mainContent2">
    <aside>
        <div class="avatar">
            <a href="#"><span>ShareFree</span></a>
        </div>
        <section class="topspaceinfo">
            <h1>Sharefree</h1>
            <p>个性签名：www.sharefree.co</p>
        </section>
        <div class="userinfo">
            <p class="q-fans"> 粉丝：<a href="/" target="_blank">167</a></p>
            <p class="btns"><a href="/" target="_blank">私信</a><a href="/" target="_blank">相册</a><a href="/"
                                                                                                   target="_blank">存档</a>
            </p>
        </div>
        <section class="newpic">
            <h2>最新照片</h2>
            <ul>
                <li><a href="/"><img src="images/01.jpg"></a></li>
                <li><a href="/"><img src="images/s3.jpg"></a></li>
                <li><a href="/"><img src="images/s0.jpg"></a></li>
                <li><a href="/"><img src="images/s2.jpg"></a></li>
                <li><a href="/"><img src="images/s5.jpg"></a></li>
                <li><a href="/"><img src="images/s6.jpg"></a></li>
                <li><a href="/"><img src="images/s7.jpg"></a></li>
                <li><a href="/"><img src="images/s8.jpg"></a></li>
            </ul>
        </section>
        <section class="taglist">
            <h2>全部标签</h2>
            <ul>
                <li><a href="/">青空</a></li>
                <li><a href="/">情感聊吧</a></li>
                <li><a href="/">study</a></li>
                <li><a href="/">青青唠叨</a></li>
            </ul>
        </section>
    </aside>
    <div class="blogitem" >
        <article id="article1">
            <h2 class="title"><a id="title1" href="/" ></a></h2>
            <ul class="text">
                <p id="content1"></p>
                <p class="textimg"><img id="img1" src=""></p>
            </ul>
            <div class="textfoot">
                <a href="/">阅读全文</a><a href="/">评论</a><a href="/">转载</a><a id="id_num1"></a>
            </div>
        </article>
        <article id="article2">
            <h2 class="title"><a id="title2" href="/"></a></h2>
            <ul class="text">
                <p id="content2"></p>
                <p class="textimg" ><img id="img2" src=""></p>
            </ul>
            <div class="textfoot">
                <a href="/">阅读全文</a><a href="/">评论</a><a href="/">转载</a><a id="id_num2"></a>
            </div>
        </article>
        <div class="pages">
            <a hidefocus="" href="javascript:pagenum11()" id="page1" >1</a>
            <a hidefocus="" href="javascript:pagenum12()" id="page2">2</a>
            <a hidefocus="" href="javascript:pagenum13()" id="page3">3</a>
            <a class="next" href="javascript:nextpage1()">下一页&gt;&gt;</a>
        </div>
    </div>
</div>
<footer>
    <div class="footavatar">
        <img src="images/s8.jpg" class="footphoto">
        <ul class="footinfo">
            <p class="fname"><a href="/dancesmile">青轻飞扬</a></p>
            <p class="finfo">性别：女 年龄：25岁</p>
            <p>现居：人们心中的'魔都'</p></ul>
    </div>
    <section class="visitor">
        <h2>最近访客</h2>
        <ul>
            <li><a href="/"><img src="images/s0.jpg"></a></li>
            <li><a href="/"><img src="images/s1.jpg"></a></li>
            <li><a href="/"><img src="images/s2.jpg"></a></li>
            <li><a href="/"><img src="images/s3.jpg"></a></li>
            <li><a href="/"><img src="images/s5.jpg"></a></li>
            <li><a href="/"><img src="images/s6.jpg"></a></li>
            <li><a href="/"><img src="images/s7.jpg"></a></li>
            <li><a href="/"><img src="images/s8.jpg"></a></li>
        </ul>
    </section>
    <div class="Copyright">
        <ul>
            <a href="/">帮助中心</a><a href="/">空间客服</a><a href="/">投诉中心</a><a href="/">空间协议</a>
        </ul>
        <p>Design by DanceSmile</p>
    </div>
</footer>
</body>
</html>