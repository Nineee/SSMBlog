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
    /*主页预加载显示文章*/
    @RequestMapping(value = "/load")
    @ResponseBody
    public List<Articles> showArticle(){
        //ajax返回list集合
        List<Articles> allArticles = articlesService.findAllArticles();
        return allArticles;
    }

    /*根据文章页数显示文章*/
    @RequestMapping(value = "page")
    @ResponseBody
    public  List<Articles> showPageNum(int pagenum){
        System.out.println("前台提交的页数为："+pagenum);
        ArticlePage articlePage = new ArticlePage((pagenum-1)*2,2); //设置文章页数属性(与limit(1,3)类似对应)
        List<Articles> articlesByPageNum = articlesService.findArticlesByPageNum(articlePage);
        return articlesByPageNum;
    }

    /*catalog.jsp预加载根据目录标签进行分类显示*/
    @ResponseBody
    @RequestMapping(value = "cataName")
    public List<Articles> showArticlesByCataName(String cataLog){
        System.out.println("前台传来的cataLog:"+cataLog);
        List<Articles> articlesByCataLog = articlesService.findArticlesByCataLog(cataLog);
        System.out.println("后台传出的articlesByCataLog:"+articlesByCataLog);
        return articlesByCataLog;
    }

}
