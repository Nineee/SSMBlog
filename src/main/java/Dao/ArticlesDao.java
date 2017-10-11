package Dao;

import Bean.ArticlePage;
import Bean.Articles;

import java.util.List;

public interface ArticlesDao {
    /*主页预加载查找文章*/
    List<Articles> findAllArticles();
    /*显示所有文章js进行分页*/
    List<Articles> findArticlesByPageNum();
    /*根据目录名称显示文章*/
    List<Articles> findArticlesByCataLog(String catalog);
    /*保存文章*/
    String saveArticle(Articles articles);
}
