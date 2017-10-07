package Bean;

/*目录属性类*/
public class CataLog {
    int id;
    String cataName;

    public CataLog() {
    }

    public CataLog(int id, String cataName) {
        this.id = id;
        this.cataName = cataName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCataName() {
        return cataName;
    }

    public void setCataName(String cataName) {
        this.cataName = cataName;
    }

    @Override
    public String toString() {
        return "CataLog{" +
                "id=" + id +
                ", cataName='" + cataName + '\'' +
                '}';
    }
}
