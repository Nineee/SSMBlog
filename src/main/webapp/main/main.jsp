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

<script type="text/javascript">
/*  $(function() {
      var article = document.getElementById("article");
      article.action="/load.do";
      article.submit();
  })*/
<%--预加载网页文章--%>
 $(function() {
     $.ajax({
         type: "POST",
         dataType: "JSON",
         url: '${contextPath}/load.do',
         success: function (data) {
             console.info(data)
             var json = eval(data);
             $.each(json,function (index,item) {
                     $("#title1").html(json[0].title);
                     $("#content1").html(json[0].content);
                    $("#title2").html(json[1].title);
                    $("#content2").html(json[1].content);
             })
             }
         });
     });

    function pagenum1(){
        var page1 = parseInt(document.getElementById("page1").innerHTML);
            alert(page1)
            $.ajax({
                type: "POST",
                dataType: "JSON",
                data:{
                    "pagenum":document.getElementById("page1").innerHTML
                },
                url: '${contextPath}/page.do',
                success: function (data) {
                    var json = eval(data);
                    $.each(json,function (index,item) {
                        $("#title1").html(json[0].title);
                        $("#content1").html(json[0].content);
                        $("#title2").html(json[1].title);
                        $("#content2").html(json[1].content);
                    })
                }
            })
        }
    function pagenum2(){
        var  page2 = parseInt(document.getElementById("page2").innerHTML);
        alert(page2)
            $.ajax({
                type: "POST",
                dataType: "JSON",
                data:{
                    "pagenum":document.getElementById("page2").innerHTML
                },
                url: '${contextPath}/page.do',
                success: function (data) {
                    var json = eval(data);
                    $.each(json,function (index,item) {
                        $("#title1").html(json[0].title);
                        $("#content1").html(json[0].content);
                        $("#title2").html(json[1].title);
                        $("#content2").html(json[1].content);
                    })
                }
            })
        }

    function pagenum3(){
        var  page3 = document.getElementById("page3").innerHTML.toString();
        alert(page3)
            $.ajax({
                type: "POST",
                dataType: "JSON",
                data:{
                    "pagenum":document.getElementById("page3").innerHTML
                },
                url: '${contextPath}/page.do',
                success: function (data) {
                    var json = eval(data);
                    console.info(json)
                    $.each(json,function (index,item) {
                        $("#title1").html(json[0].title);
                        $("#content1").html(json[0].content);
                        $("#title2").html(json[1].title);
                        $("#content2").html(json[1].content);
                    })
                }
            })
        }
</script>


<body>
<header>
    <nav id="nav">
        <ul>
            <li><a href="/">ShareFree</a></li>
            <li><a href="/download/" target="_blank">模板</a></li>
            <li><a href="/web/" target="_blank">关于我们</a></li>
            <li><a href="/jstt/" target="_blank">我们的故事</a></li>
            <li><a href="/newshtml5/" target="_blank">我们的蜜月</a></li>
            <li><a href="/news/case/" target="_blank">婚礼现场</a></li>
            <li><a href="/news/s/" target="_blank">婚纱摄影</a></li>
            <li><a href="/newstalk/" target="_blank">我们的博客</a></li>
            <li><a href="/news/jsex/" target="_blank">Contact m</a></li>
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
        <section><a href="#"><img src="images/text02.jpg"></a>
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
<%--            <form id="article" type="post">
            <c:forEach items="${allarticles}" var="a" varStatus="status">--%>
            <article>
            <h2 class="title"><a id="title1" href="/" ></a></h2>
            <ul class="text">
                <p id="content1"></p>
                <p class="textimg"><img src="images/text02.jpg"></p>
            </ul>

            <div class="textfoot">
                <a href="/">阅读全文</a><a href="/">评论</a><a href="/">转载</a>
            </div>
            </article>
<%--            </c:forEach>
            </form>--%>
        <article>

            <h2 class="title"><a id="title2" href="/"></a></h2>
            <ul class="text">
                <p id="content2"></p>
                <p class="textimg"><img src="images/text01.jpg"></p>
            </ul>
            <div class="textfoot">
                <a href="/">阅读全文</a><a href="/">评论</a><a href="/">转载</a>
            </div>
        </article>
        <div class="pages">
            <a href=""  hidefocus="" onclick="pagenum1()" id="page1" >1</a>
            <a href="" hidefocus="" onclick="pagenum2()" id="page2">2</a>
            <a href="" hidefocus="" onclick="pagenum3()" id="page3">3</a>
            <a href="${pageContext.request.contextPath}/nextpage.do"class="next">下一页&gt;&gt;</a>
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