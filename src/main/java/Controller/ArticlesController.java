package Controller;

import Bean.Articles;
import Service.ArticlesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class ArticlesController {

    @Autowired
    private ArticlesService articlesService;
    @RequestMapping(value = "/load")
    public void showArticle(HttpServletRequest request, HttpServletResponse response){

        response.setCharacterEncoding("UTF-8");
        for (Articles articles1 : articlesService.findAllArticles()) {
            System.out.println("文章："+articles1);
            request.getSession().setAttribute("article",articles1);
        }
    }
}
