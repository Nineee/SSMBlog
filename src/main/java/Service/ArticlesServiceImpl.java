package Service;

import Bean.ArticlePage;
import Bean.Articles;
import Dao.ArticlesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticlesServiceImpl implements ArticlesService{

    @Autowired
    private ArticlesDao articlesDao;

    /*主页预加载查找文章*/
    @Override
    public List<Articles> findAllArticles() {
        return articlesDao.findAllArticles();
    }

    /*根据文章页数显示文章*/
    @Override
    public List<Articles> findArticlesByPageNum(ArticlePage articlePage) {
        return articlesDao.findArticlesByPageNum(articlePage);
    }

    /*根据目录名称显示文章*/
    @Override
    public List<Articles> findArticlesByCataLog(String cataLog) {
        return articlesDao.findArticlesByCataLog(cataLog);
    }
}
