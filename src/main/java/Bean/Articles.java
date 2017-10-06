package Bean;

/*文章属性类*/
import java.util.Date;
import java.util.List;

public class Articles {

    private int id;
    private String title;
    private String author;
    private String content;
    private String catalog;
    private String tag;
    private String comment;
    private Date date;
    public Articles() {
    }

    public Articles(int id, String title, String content,String author, String catalog, String tag, String comment, Date date) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
        this.catalog = catalog;
        this.tag = tag;
        this.comment = comment;
        this.date = date;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    @Override
    public String toString() {
        return "Articles{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                ", catalog='" + catalog + '\'' +
                ", tag='" + tag + '\'' +
                ", comment='" + comment + '\'' +
                ", date=" + date +
                '}';
    }
}
