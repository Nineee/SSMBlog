/*时间处理方法*/

function getDateTime(date) {    //date为js中Date数据类型
    var year = date.getFullYear();
    var month = date.getMonth() + 1;
    var day = date.getDate();
    var hh = date.getHours();
    var mm = date.getMinutes();
    var ss = date.getSeconds();
    return year + "-" + month + "-" + day + " " + hh + ":" + mm + ":" + ss;
}


/*预加载请求所以文章*/
/*$(function () {
    var articles = document.getElementById("articles");
    $.ajax({
        type: "POST",
        dataType: "JSON",
        url:"/page.do",
        success: function (dataB) {
            var str = "";
            console.info(new Date(dataB[0].date));
            for(var i=0;i<8;i++){
                str += "<tr>"+
                    "<td>"+dataB[i].title+"</td>"+
                    "<td>"+dataB[i].author+"</td>"+
                    "<td>"+dataB[i].comment+"</td>"+
                    "<td>"+dataB[i].catalog+"</td>"+
                    "<td>"+getDateTime(new Date(dataB[i].date))+"</td>"+
                     "</tr>";
            }
            articles.innerHTML = str;
        },
        error:function () {
            alert("查询失败！")
        }
    })
})*/

/*获取当前页面www.sharefree.com?pagenum=后面传递的参数*/
function getQueryString(name) {
    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
    var r = window.location.search.substr(1).match(reg);
    if (r != null) return unescape(r[2]);
    return null;
}

/*预加载和点击页码文章显示*/
$(function () {
    var pagenum = getQueryString("pagenum");
    if(pagenum=="" || pagenum==null || "undefined" == typeof pagenum){
        pagenum=1;
    }else {
        pagenum=getQueryString("pagenum");
    }
    $.ajax({
        type: "POST",
        dataType: "JSON",
        url:"/pageNum.do",
        data:{
          pagenum:pagenum
        },
        success: function (data) {
            console.info(data)
            $("#articles").html("")
            for (var i=0;i<data.length;i++){
                $("#articles").append(
                '<tr><td>'+data[i].title+'</td>'+
                '<td>'+data[i].author+'</td>'+
                '<td>'+data[i].comment+'</td>'+
                '<td>'+data[i].catalog+'</td>'+
                '<td>'+getDateTime(new Date(data[i].date))+'</td></tr>'
                );
            }
        },
        error:function () {
            alert("no data")
        }
    })



})

/*下一页文章显示*/
function pagedown() {
    $("#pagenum1").text(parseInt(document.getElementById("pagenum1").innerHTML)+1);
    $("#pagenum2").text(parseInt(document.getElementById("pagenum2").innerHTML)+1);
    $("#pagenum3").text(parseInt(document.getElementById("pagenum3").innerHTML)+1);
    $("#pagenum4").text(parseInt(document.getElementById("pagenum4").innerHTML)+1);
    $('#pagenum1').attr('href','?pagenum='+(parseInt(document.getElementById("pagenum1").innerHTML)+1));
    $('#pagenum2').attr('href','?pagenum='+(parseInt(document.getElementById("pagenum2").innerHTML)+1));
    $('#pagenum3').attr('href','?pagenum='+(parseInt(document.getElementById("pagenum3").innerHTML)+1));
    $('#pagenum4').attr('href','?pagenum='+(parseInt(document.getElementById("pagenum4").innerHTML)+1));
    var pagenum = getQueryString("pagenum");
    if(pagenum=="" || pagenum==null || "undefined" == typeof pagenum){
        pagenum=1;
    }else {
        pagenum=parseInt(getQueryString("pagenum"))+1;
    }
    $.ajax({
        type: "POST",
        dataType: "JSON",
        url:"/pageNum.do",
        data:{
            pagenum:pagenum
        },
        success: function (data) {
            console.info(data)
            $("#articles").html("")
            for (var i=0;i<data.length;i++){
                $("#articles").append(
                    '<tr><td>'+data[i].title+'</td>'+
                    '<td>'+data[i].author+'</td>'+
                    '<td>'+data[i].comment+'</td>'+
                    '<td>'+data[i].catalog+'</td>'+
                    '<td>'+getDateTime(new Date(data[i].date))+'</td></tr>'
                );
            }
        },
        error:function () {
            alert("no data")
        }
    })
}

/*上一页文章显示*/
function pageup() {
    $("#pagenum1").text(parseInt(document.getElementById("pagenum1").innerHTML)-1);
    $("#pagenum2").text(parseInt(document.getElementById("pagenum2").innerHTML)-1);
    $("#pagenum3").text(parseInt(document.getElementById("pagenum3").innerHTML)-1);
    $("#pagenum4").text(parseInt(document.getElementById("pagenum4").innerHTML)-1);
    $('#pagenum1').attr('href','?pagenum='+(parseInt(document.getElementById("pagenum1").innerHTML)-1));
    $('#pagenum2').attr('href','?pagenum='+(parseInt(document.getElementById("pagenum2").innerHTML)-1));
    $('#pagenum3').attr('href','?pagenum='+(parseInt(document.getElementById("pagenum3").innerHTML)-1));
    $('#pagenum4').attr('href','?pagenum='+(parseInt(document.getElementById("pagenum4").innerHTML)-1));
    var pagenum = getQueryString("pagenum");
    if(pagenum=="" || pagenum==null || "undefined" == typeof pagenum){
        pagenum=1;
    }else {
        pagenum=parseInt(getQueryString("pagenum"))-1;
    }
    $.ajax({
        type: "POST",
        dataType: "JSON",
        url:"/pageNum.do",
        data:{
            pagenum:pagenum
        },
        success: function (data) {
            console.info(data)
            $("#articles").html("")
            for (var i=0;i<data.length;i++){
                $("#articles").append(
                    '<tr><td>'+data[i].title+'</td>'+
                    '<td>'+data[i].author+'</td>'+
                    '<td>'+data[i].comment+'</td>'+
                    '<td>'+data[i].catalog+'</td>'+
                    '<td>'+getDateTime(new Date(data[i].date))+'</td></tr>'
                );
            }
        },
        error:function () {
            alert("no data")
        }
    })
}

