package Bean;

/*用户属性类*/
public class User {

    private int id;
    private String username;
    private String password;
    private int age;
    private char sex;
    private String address;
    private String sign;
    private String headpic;
    private int browser;


    public User() {
    }

    public User(int id, String username, String password, int age, char sex, String address, String sign, String headpic, int browser) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.sign = sign;
        this.headpic = headpic;
        this.browser = browser;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getHeadpic() {
        return headpic;
    }

    public void setHeadpic(String headpic) {
        this.headpic = headpic;
    }

    public int getBrowser() {
        return browser;
    }

    public void setBrowser(int browser) {
        this.browser = browser;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", address='" + address + '\'' +
                ", sign='" + sign + '\'' +
                ", headpic='" + headpic + '\'' +
                ", browser=" + browser +
                '}';
    }
}
