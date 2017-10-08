   /*catalog页面预加载实现根据目录进行查询*/
    $(function () {
         var cataLog = window.location.href.split("=")[1];
         $.ajax({
             type: "POST",
             dataType: "JSON",
             url:"/cataName.do",
             data:{
                 "cataLog":cataLog.toString()
             },
             success: function (data) {
                 var json = eval(data);
                 $.each(json,function (index,item) {
                     $("#title1").html(json[0].title);
                     $("#content1").html(json[0].content.substring(0,150)+"...........");
                     $("#title2").html(json[1].title);
                     $("#content2").html(json[1].content.substring(0,150)+"...........");
                 })
             }
         })
    })