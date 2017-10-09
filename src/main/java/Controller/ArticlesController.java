package Controller;

import Bean.ArticlePage;
import Bean.Articles;
import Service.ArticlesService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ArticlesController {

    @Autowired
    private ArticlesService articlesService;
    /*主页预加载显示所有文章*/
    @RequestMapping(value = "/load")
    @ResponseBody
    public List<Articles> showArticle(){
        //ajax返回list集合
        List<Articles> allArticles = articlesService.findAllArticles();
        System.out.println("返回所有数据:"+allArticles);
        return allArticles;
    }

    /*显示所有文章使用js进行分页*/
    @RequestMapping(value = "page")
    @ResponseBody
    public  List<Articles> showPageNum(){
        List<Articles> allArticles = articlesService.findArticlesByPageNum();
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

   /* *//*catalog.jsp根据文章页数和目录分类进行显示*//*
    @ResponseBody
    @RequestMapping(value = "pageCataLog")
    public List<Articles> showArticlesByCataNameNum(int pagenum,String catalog){
        System.out.println("前台传来的cataLog:"+catalog+";l"+"pagenum:"+pagenum);
        ArticlePage articlePage = new ArticlePage(pagenum*2+1,2,catalog); //设置文章页数属性(与limit(1,3)类似对应)
        List<Articles> articlesByCataLog = articlesService.findArticlesByCataNameNum(articlePage);
        System.out.println("后台传出的articlesByCataLog:"+articlesByCataLog);
        return articlesByCataLog;
    }*/

}
