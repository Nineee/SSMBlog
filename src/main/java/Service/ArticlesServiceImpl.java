package Service;

import Bean.Articles;
import Bean.ArticlesPage;
import Dao.ArticlesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.SERIALIZABLE)
@Service
public class ArticlesServiceImpl implements ArticlesService{

    @Autowired
    private ArticlesDao articlesDao;

    /*主页预加载查找文章*/
    @Override
    public List<Articles> findArticles() {
        return articlesDao.findArticles();
    }

    /*显示所有文章js进行分页*/
    @Override
    public List<Articles> findAllArticles() {
        return articlesDao.findAllArticles();
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

    /*查找显示文章分页处理*/
    @Override
    public List<Articles> ShowArticlesByPageNum(ArticlesPage articlesPage) {
        return articlesDao.ShowArticlesByPageNum(articlesPage);
    }
}
