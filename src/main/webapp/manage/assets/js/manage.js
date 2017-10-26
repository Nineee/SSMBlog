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

$(function () {
    $.ajax({
        type: "POST",
        dataType: "JSON",
        url:"/pageNum.do",
        data:{
          pagenum:pagenum
        },
        success: function () {
            return "forward:/manage/manage.jsp";
        },
        error:function () {
            alert("查询失败！")
        }
    })
})

function pagenum1() {
    
}

function pagenum2() {

}
function pagenum3() {

}
function pagenum4() {

}
