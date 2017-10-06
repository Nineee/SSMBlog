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
    /*主页预加载实现*/
    @RequestMapping(value = "/load")
    @ResponseBody
    public List<Articles> showArticle(){
        /*modeladnview返回list集合
        response.setCharacterEncoding("UTF-8");
        ModelAndView mav = new ModelAndView("forward:/main/main");
        List<Articles> allArticles = articlesService.findAllArticles();
        System.out.println("文章列表："+allArticles);
        mav.addObject("allArticles",allArticles);
        return mav;
        */

        //ajax返回list集合
        List<Articles> allArticles = articlesService.findAllArticles();
       /* System.out.println("文章列表："+allArticles);*/
        return allArticles;
    }

    /*根据文章页数显示文章*/
    @RequestMapping(value = "page")
    @ResponseBody
    public  List<Articles> showPage(Integer pagenum){
        System.out.println("前台提交的页数为："+pagenum);
        ArticlePage articlePage = new ArticlePage((pagenum-1)*2,2);
        System.out.println("articlePage属性："+articlePage);
        List<Articles> articlesByPageNum = articlesService.findArticlesByPageNum(articlePage);
        return articlesByPageNum;
    }

}
