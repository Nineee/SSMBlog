package Service;

import Bean.Articles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ArticlesService {

    List<Articles> findAllArticles();
}
