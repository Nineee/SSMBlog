package Bean;

/*文章分页类*/
public class ArticlePage {
    private int minpage;
    private int maxpage;
    public ArticlePage(int minpage, int maxpage) {
        this.minpage = minpage;
        this.maxpage = maxpage;
    }


    public ArticlePage() {
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


    @Override
    public String toString() {
        return "ArticlePage{" +
                "minpage=" + minpage +
                ", maxpage=" + maxpage +
                '}';
    }
}
