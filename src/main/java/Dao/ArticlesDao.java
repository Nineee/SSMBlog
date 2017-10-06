package Dao;

import Bean.ArticlePage;
import Bean.Articles;

import java.util.List;

public interface ArticlesDao {
    /*主页预加载查找文章*/
    List<Articles> findAllArticles();
    /*根据文章页数显示文章*/
    List<Articles> findArticlesByPageNum(ArticlePage articlePage);
}
