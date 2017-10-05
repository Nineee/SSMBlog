package Controller;

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
    public List<Articles> showArticle(HttpServletRequest request, HttpServletResponse response){
        /*modeladnview返回list集合
        response.setCharacterEncoding("UTF-8");
        ModelAndView mav = new ModelAndView("forward:/main/main");
        List<Articles> allArticles = articlesService.findAllArticles();
        System.out.println("文章列表："+allArticles);
        mav.addObject("allArticles",allArticles);
        return mav;
        */

        //
        List<Articles> allArticles = articlesService.findAllArticles();
        System.out.println("文章列表："+allArticles);
        return allArticles;

    }
}
