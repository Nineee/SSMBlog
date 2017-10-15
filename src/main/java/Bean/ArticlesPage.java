package Bean;

public class ArticlesPage {

    private int currentpage;
    private int minpage;
    private int maxpage;

    public ArticlesPage() {
    }

    public ArticlesPage(int currentpage, int minpage, int maxpage) {
        this.currentpage = currentpage;
        this.minpage = minpage;
        this.maxpage = maxpage;
    }

    public int getCurrentpage() {
        return currentpage;
    }

    public void setCurrentpage(int currentpage) {
        this.currentpage = currentpage;
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
        return "ArticlesPage{" +
                "currentpage=" + currentpage +
                ", minpage=" + minpage +
                ", maxpage=" + maxpage +
                '}';
    }
}
