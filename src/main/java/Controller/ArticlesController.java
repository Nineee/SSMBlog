package Controller;

import Bean.Articles;
import Bean.ArticlesPage;
import Service.ArticlesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
public class ArticlesController {

    @Autowired
    private ArticlesService articlesService;
    /*主页预加载显示最新发布的前两条文章*/
    @RequestMapping(value = "/load")
    @ResponseBody
    public List<Articles> showArticle(){
        //ajax返回list集合
        List<Articles> allArticles = articlesService.findArticles();
        System.out.println("返回所有数据:"+allArticles);
        return allArticles;
    }

    /*显示所有文章使用js进行分页*/
    @RequestMapping(value = "page")
    @ResponseBody
    public  List<Articles> showPageNum(){
        List<Articles> allArticles = articlesService.findAllArticles();
        System.out.println("page.do动作返回所有数据成功！");
        return allArticles;
    }

    /*catalog.jsp预加载根据目录标签进行分类显示*/
    @ResponseBody
    @RequestMapping(value = "cataName")
    public List<Articles> showArticlesByCataName(String catalog){
        System.out.println("前台传来的cataLog:"+catalog);
        List<Articles> articlesByCataLog = articlesService.findArticlesByCataLog(catalog);
        System.out.println("后台传出的articlesByCataLog:"+articlesByCataLog);
        return articlesByCataLog;
    }

    /*--------------------------后台管理界面请求--------------------------------------*/
    /*写文章页面提交的数据界面*/
    @RequestMapping(value = "/upload")
    @ResponseBody
    public int insertArticle(String title,String content,MultipartFile picture,String tag,String catalog,String comment, HttpSession session) throws IOException{
        Articles articles = new Articles(title,content,tag,catalog,comment);
        System.out.println("传来前："+articles);
        System.out.println("文件名："+picture.getOriginalFilename());
        Date date = new Date();
        String realPath = session.getServletContext().getRealPath("/main/images/"); //生成服务器路径用来存放上传的文章图片
        if(!(picture.getOriginalFilename().equals("") || picture.getOriginalFilename().equals(null))){  //判断上传的文件是否为空
            String curentTime = new SimpleDateFormat("yyyyMMddHHmmss").format(date); //生成固定格式时间戳
            //获取到前台传来的文件名加上时间戳防止文件名重复
            String filename = picture.getOriginalFilename()+curentTime;
            System.out.println("文件名："+filename);
            System.out.println("文件服务器路径："+realPath);
            //设置文件上传路径
            File file = new File(realPath,filename);
            picture.transferTo(file); //上传文件
            //设置article信息保存到数据库
            articles.setDate(date);
            articles.setAuthor(session.getAttribute("username").toString());
            articles.setPicture("images/"+filename);
            System.out.println("文件传来后："+articles);
            int articleID = articlesService.saveArticle(articles);
            System.out.println("返回的文章id："+articleID);
            return articleID;
        }else {
            articles.setPicture(null);
            articles.setDate(date);
            articles.setAuthor(session.getAttribute("username").toString());
            System.out.println("空文件传来后："+articles);
            int articleID = articlesService.saveArticle(articles);
            System.out.println("返回的文章id："+articleID);
            return articleID;
        }
    }

    /*编辑文章界面*/
    @ResponseBody
    @RequestMapping(value = "pageNum")
    public String showArticles(int pagenum,HttpServletRequest request){
        System.out.println("后台接收到的pagenum:"+pagenum);
        List<Articles> allArticles = articlesService.findAllArticles();
        int pagetimes;
       if(allArticles.size()%8==0){
           pagetimes=allArticles.size()/8;
       }else {
           pagetimes=allArticles.size()/8+1;
       }
        ArticlesPage articlesPage = new ArticlesPage(pagenum,(pagenum-1)*8,pagenum*8,pagetimes,allArticles);
        List<Articles> articles = articlesService.ShowArticlesByPageNum(articlesPage);
        System.out.println("分页内容为："+articles);
        HttpSession session = request.getSession();
        session.setAttribute("articles",articles);
        session.setAttribute("articlesPage",articlesPage);
        return "forward:/manage/manage.jsp";
    }
}
