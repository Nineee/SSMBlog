/*主页预加载文章书籍前两条*/
$(function() {
    $.ajax({
        type: "POST",
        dataType: "JSON",
        url:"/load.do",
        success: function (data) {
            var json = eval(data);
            $.each(json,function (index,item) {
                $("#title1").html(json[0].title);
                $("#content1").html(json[0].content);
                $("#title2").html(json[1].title);
                $("#content2").html(json[1].content);
                $("#id_num1").html(json[0].id);
                $("#id_num2").html(json[1].id);
            })
        }
    });
/*主页预加载目录内容*/
    $.ajax({
        type: "POST",
        dataType: "JSON",
        url:"/loadCata.do",
        success: function (data) {

            console.info(data)
            var json = eval(data);
            $.each(json,function (index,item) {
                $("#catalog1").html(json[0].cataName);
                $("#catalog2").html(json[0].cataName);
                $("#catalog3").html(json[0].cataName);
                $("#catalog4").html(json[0].cataName);
                $("#catalog5").html(json[0].cataName);
                $("#catalog6").html(json[0].cataName);
                $("#catalog7").html(json[0].cataName);
            })
        }
    })
});

/*第一页，第二页,第三页点击事件数据交互*/
function pagenum1(){
    var page1 = parseInt(document.getElementById("page1").innerHTML);
    $.ajax({
        type: "POST",
        async:false,
        dataType: "JSON",
        data:{
            "pagenum": parseInt(document.getElementById("page1").innerHTML)
        },
        url: "/page.do",
        success: function (data) {
            var json = eval(data);
            $.each(json,function (index,item) {
                $("#title1").html(json[0].title);
                $("#content1").html(json[0].content);
                $("#title2").html(json[1].title);
                $("#content2").html(json[1].content);
                $("#id_num1").html(json[0].id);
                $("#id_num2").html(json[1].id);
            })
        }
    })
}
function pagenum2(){
    var  page2 = parseInt(document.getElementById("page2").innerHTML);
    $.ajax({
        type: "POST",
        async:false,
        dataType: "JSON",
        data:{
            "pagenum":parseInt(document.getElementById("page2").innerHTML)
        },
        url:"/page.do",
        success: function (data) {
            var json = eval(data);
            console.info(json)
            $.each(json,function (index,item) {
                $("#title1").html(json[0].title);
                $("#content1").html(json[0].content);
                $("#title2").html(json[1].title);
                $("#content2").html(json[1].content);
                $("#id_num1").html(json[0].id);
                $("#id_num2").html(json[1].id);
            })
        }
    })
}

function pagenum3(){
    var  page3 = parseInt(document.getElementById("page3").innerHTML);
    $.ajax({
        type: "POST",
        async:false,
        dataType: "JSON",
        data:{
            "pagenum":parseInt(document.getElementById("page3").innerHTML)
        },
        url:"/page.do",
        success: function (data) {
            var json = eval(data);
            $.each(json,function (index,item) {
                $("#title1").html(json[0].title);
                $("#content1").html(json[0].content);
                $("#title2").html(json[1].title);
                $("#content2").html(json[1].content);
                $("#id_num1").html(json[0].id);
                $("#id_num2").html(json[1].id);
            })
        }
    })
}

/*下一页点击事件数据交互*/
function nextpage() {
    var nextpagenum = parseInt(document.getElementById("id_num2").innerHTML)/2+1;
    $.ajax({
        type: "POST",
        async:false,
        dataType: "JSON",
        data:{
            "pagenum":parseInt(document.getElementById("id_num2").innerHTML)/2+1
        },
        url:"/page.do",
        success: function (data) {
            var json = eval(data);
            $.each(json,function (index,item) {
                $("#title1").html(json[0].title);
                $("#content1").html(json[0].content);
                $("#title2").html(json[1].title);
                $("#content2").html(json[1].content);
                $("#id_num1").html(json[0].id);
                $("#id_num2").html(json[1].id);
            })
        }
    })
}