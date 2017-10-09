package Service;

import Bean.ArticlePage;
import Bean.Articles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ArticlesService {

    /*主页预加载查找文章*/
    List<Articles> findAllArticles();
    /*显示所有文章js进行分页*/
    List<Articles> findArticlesByPageNum();
    /*根据目录名称显示文章*/
    List<Articles> findArticlesByCataLog(String catalog);
/*    *//*根据文章页数和目录分类进行显示*//*
    List<Articles> findArticlesByCataNameNum(ArticlePage articlePage);*/

}
