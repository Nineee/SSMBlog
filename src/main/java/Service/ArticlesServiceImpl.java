package Service;

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

    /*显示所有文章js进行分页*/
    @Override
    public List<Articles> findArticlesByPageNum() {
        return articlesDao.findArticlesByPageNum();
    }

    /*根据目录名称显示文章*/
    @Override
    public List<Articles> findArticlesByCataLog(String catalog) {
        return articlesDao.findArticlesByCataLog(catalog);
    }

    /*保存文章*/
    @Override
    public int saveArticle(Articles articles) {
        return articlesDao.saveArticle(articles);
    }
}
