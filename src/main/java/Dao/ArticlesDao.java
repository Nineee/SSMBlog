package Dao;

import Bean.Articles;

import java.util.List;

public interface ArticlesDao {
    List<Articles> findAllArticles();
}
