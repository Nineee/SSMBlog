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
    @Override
    public List<Articles> findAllArticles() {
        return articlesDao.findAllArticles();
    }
}
