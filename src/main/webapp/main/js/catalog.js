   /*catalog页面预加载实现根据目录进行查询*/
    $(function () {
         $.ajax({
             type: "POST",
             dataType: "JSON",
             url:"/cataName.do",
             data:{
                 "catalog":window.location.href.split("=")[1]
             },
             success: function (data) {
                 var json = eval(data);
                 if(parseInt(json.length)==parseInt(0)){
                     console.info(json);
                     alert("没有这么多哦！^_^")
                 }else {
                     if(parseInt(json.length)==parseInt(1)){
                         document.getElementById("article2").style.visibility="visible";
                         $("#title1").html(json[0].title);
                         $("#content1").html(json[0].content.substring(0,150)+"••••••••••");
                         $("#img1").attr("src",json[0].picture);
                         $("#id_num1").html(json[0].id);
                         document.getElementById("article2").style.visibility="hidden";//设置标签隐藏
                     }else {
                         document.getElementById("article2").style.visibility="visible";
                         $("#title1").html(json[0].title);
                         $("#content1").html(json[0].content.substring(0,150)+"••••••••••");
                         $("#img1").attr("src",json[0].picture);
                         $("#id_num1").html(json[0].id);
                         $("#title2").html(json[1].title);
                         $("#content2").html(json[1].content.substring(0,150)+"••••••••••");
                         $("#img2").attr("src",json[1].picture);
                         $("#id_num2").html(json[1].id);
                     }
                 }

              }
         })
    })

   function pagenum11() {
       $.ajax({
           type: "POST",
           async:false,
           dataType: "JSON",
           data:{
               "catalog":window.location.href.split("=")[1]
           },
           url: "/cataName.do",
           success: function (data) {
               var json = eval(data);
               console.info(json)
                       if(parseInt(json.length)==parseInt(0)){
                           alert("没有这么多哦！^_^")
                       }else {
                           if(parseInt(json.length)==parseInt(1)){
                               document.getElementById("article2").style.visibility="visible";
                               $("#title1").html(json[0].title);
                               $("#content1").html(json[0].content.substring(0,150)+"••••••••••");
                               $("#img1").attr("src",json[0].picture);
                               $("#id_num1").html(json[0].id);
                               document.getElementById("article2").style.visibility="hidden";//设置标签隐藏
                           }else {
                               document.getElementById("article2").style.visibility="visible";
                               $("#title1").html(json[0].title);
                               $("#content1").html(json[0].content.substring(0,150)+"••••••••••");
                               $("#img1").attr("src",json[0].picture);
                               $("#id_num1").html(json[0].id);
                               $("#title2").html(json[1].title);
                               $("#content2").html(json[1].content.substring(0,150)+"••••••••••");
                               $("#img2").attr("src",json[1].picture);
                               $("#id_num2").html(json[1].id);
                           }

                       }
           }
       })
   }
   
   function pagenum12() {
       $.ajax({
           type: "POST",
           async:false,
           dataType: "JSON",
           data:{
               "catalog":window.location.href.split("=")[1]
           },
           url: "/cataName.do",
           success: function (data) {
               var json = eval(data);
               console.info(json)
               if(parseInt(json.length)<=parseInt(2)){
                   alert("没有这么多哦！^_^")
               }else {
                   if(parseInt(json.length)==parseInt(3)){
                       document.getElementById("article2").style.visibility="visible";
                       $("#title1").html(json[2].title);
                       $("#content1").html(json[2].content.substring(0,150)+"••••••••••");
                       $("#img1").attr("src",json[2].picture);
                       $("#id_num1").html(json[2].id);
                       document.getElementById("article2").style.visibility="hidden";//设置标签隐藏
                   }else {
                       document.getElementById("article2").style.visibility="visible";
                       $("#title1").html(json[2].title);
                       $("#content1").html(json[2].content.substring(0,150)+"••••••••••");
                       $("#img1").attr("src",json[2].picture);
                       $("#id_num1").html(json[2].id);
                       $("#title2").html(json[3].title);
                       $("#content2").html(json[3].content.substring(0,150)+"••••••••••");
                       $("#img2").attr("src",json[3].picture);
                       $("#id_num2").html(json[3].id);
                   }
               }
           }
       })
   }
    
   function pagenum13() {
       var page1 = parseInt(document.getElementById("page3").innerHTML);
       $.ajax({
           type: "POST",
           async:false,
           dataType: "JSON",
           data:{
               "catalog":window.location.href.split("=")[1]
           },
           url: "/cataName.do",
           success: function (data) {
               var json = eval(data);
               console.info(json)
                   if(parseInt(json.length)<=parseInt(4)){
                       alert("已经到底啦，^_^");
                   }else {
                       if(parseInt(json.length)==parseInt(5)){
                           document.getElementById("article2").style.visibility="visible";
                           $("#title1").html(json[4].title);
                           $("#content1").html(json[4].content.substring(0,150)+"••••••••••");
                           $("#img1").attr("src",json[4].picture);
                           $("#id_num1").html(json[4].id);
                           document.getElementById("article2").style.visibility="hidden";//设置标签隐藏
                       }else {
                           document.getElementById("article2").style.visibility="visible";
                           $("#title1").html(json[4].title);
                           $("#content1").html(json[4].content.substring(0,150)+"••••••••••");
                           $("#img1").attr("src",json[4].picture);
                           $("#id_num1").html(json[4].id);
                           $("#title2").html(json[5].title);
                           $("#content2").html(json[5].content.substring(0,150)+"••••••••••");
                           $("#img2").attr("src",json[5].picture);
                           $("#id_num2").html(json[5].id);
                       }
                   }
           }
       })
   }

   //下一页实现
   function nextpage1() {
       var title = document.getElementById("title2").innerHTML;
       $.ajax({
           type: "POST",
           async:false,
           dataType: "JSON",
           data:{
               "catalog":window.location.href.split("=")[1]
           },
           url: "/cataName.do",
           success: function (data) {
               var json = eval(data);
               $.each(json,function (index,item) {
                   if((json[index].title)==title.toString()){
                       if(json[index+1]==null){
                           alert("已经到底啦，^_^");
                       }else {
                           if(json[index+2]==null){
                               document.getElementById("article2").style.visibility="visible";
                               $("#title1").html(json[index+1].title);
                               $("#content1").html(json[index+1].content.substring(0,150)+"••••••••••");
                               $("#img1").attr("src",json[index+1].picture);
                               $("#id_num1").html(json[index+1].id);
                               document.getElementById("article2").style.visibility="hidden";//设置标签隐藏
                           }else {
                               document.getElementById("article2").style.visibility="visible";
                               $("#title1").html(json[index+1].title);
                               $("#content1").html(json[index+1].content.substring(0,150)+"••••••••••");
                               $("#img1").attr("src",json[index+1].picture);
                               $("#id_num1").html(json[index+1].id);
                               $("#title2").html(json[index+2].title);
                               $("#content2").html(json[index+2].content.substring(0,150)+"••••••••••");
                               $("#img2").attr("src",json[index+2].picture);
                               $("#id_num2").html(json[index+2].id);
                           }
                       }
                       if(parseInt(index+1)==parseInt(json.length)){
                            if(parseInt(index/2)==parseInt(0)){
                                document.getElementById("article2").style.visibility="visible";
                                $("#title1").html(json[index+1].title);
                                $("#content1").html(json[index+1].content.substring(0,150)+"••••••••••");
                                $("#img1").attr("src",json[index+1].picture);
                                $("#id_num1").html(json[index+1].id);
                                $("#title2").html(json[index+2].title);
                                $("#content2").html(json[index+2].content.substring(0,150)+"••••••••••");
                                $("#img2").attr("src",json[index+2].picture);
                                $("#id_num2").html(json[index+2].id);
                            }else {
                                document.getElementById("article2").style.visibility="visible";
                                $("#title1").html(json[index+1].title);
                                $("#content1").html(json[index+1].content.substring(0,150)+"••••••••••");
                                $("#img1").attr("src",json[index+1].picture);
                                $("#id_num1").html(json[index+1].id);
                                document.getElementById("article2").style.visibility="hidden";//设置标签隐藏
                            }
                       }
                   }
               })
           }
       })
   }