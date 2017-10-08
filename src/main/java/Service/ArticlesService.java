package Service;

import Bean.ArticlePage;
import Bean.Articles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ArticlesService {

    /*主页预加载查找文章*/
    List<Articles> findAllArticles();
    /*根据页数显示文章*/
    List<Articles> findArticlesByPageNum(ArticlePage articlePage);
    /*根据目录名称显示文章*/
    List<Articles> findArticlesByCataLog(String cataLog);
}
