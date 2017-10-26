package Service;

import Bean.Articles;
import Bean.ArticlesPage;

import java.util.List;


public interface ArticlesService {

    /*主页预加载查找文章*/
    List<Articles> findArticles();
    /*显示所有文章js进行分页*/
    List<Articles> findAllArticles();
    /*根据目录名称显示文章*/
    List<Articles> findArticlesByCataLog(String catalog);
    /*保存文章*/
    int saveArticle(Articles articles);
    /*查找显示文章分页处理*/
    List<Articles> ShowArticlesByPageNum(ArticlesPage articlesPage);
}
