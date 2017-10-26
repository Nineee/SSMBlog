package Bean;

import java.util.ArrayList;
import java.util.List;

public class ArticlesPage {


    private int pagenum; //第几页
    private int minpage; //开始条目
    private int maxpage; //结束条目
    private int pagetimes; //总页数
    List<Articles> articles = new ArrayList<Articles>(); //所有文章

    public ArticlesPage(int pagenum, int minpage, int maxpage, int pagetimes, List<Articles> articles) {
        this.pagenum = pagenum;
        this.minpage = minpage;
        this.maxpage = maxpage;
        this.pagetimes = pagetimes;
        this.articles = articles;
    }

    public ArticlesPage() {
    }

    public int getPagenum() {
        return pagenum;
    }

    public void setPagenum(int pagenum) {
        this.pagenum = pagenum;
    }

    public int getMinpage() {
        return minpage;
    }

    public void setMinpage(int minpage) {
        this.minpage = minpage;
    }

    public int getMaxpage() {
        return maxpage;
    }

    public void setMaxpage(int maxpage) {
        this.maxpage = maxpage;
    }

    public int getPagetimes() {
        return pagetimes;
    }

    public void setPagetimes(int pagetimes) {
        this.pagetimes = pagetimes;
    }

    public List<Articles> getArticles() {
        return articles;
    }

    public void setArticles(List<Articles> articles) {
        this.articles = articles;
    }

    @Override
    public String toString() {
        return "ArticlesPage{" +
                "pagenum=" + pagenum +
                ", minpage=" + minpage +
                ", maxpage=" + maxpage +
                ", pagetimes=" + pagetimes +
                ", articles=" + articles +
                '}';
    }
}
