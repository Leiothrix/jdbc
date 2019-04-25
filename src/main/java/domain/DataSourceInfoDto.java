package domain;

/**
 * @author adam
 * @date 2019/4/25 15:34
 * PS: You may say that I'm a dreamer.But I'm not the only one.
 */
public class DataSourceInfoDto {

    /**
     * 数据库驱动类的名称
     */
    private String className;
    /**
     * 建立数据库使用的连接
     */
    private String url;
    /**
     * 数据库用户名
     */
    private String user;
    /**
     * 用户名对应的密码
     */
    private String pwd;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DataSourceInfoDto that = (DataSourceInfoDto) o;

        if (className != null ? !className.equals(that.className) : that.className != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        if (user != null ? !user.equals(that.user) : that.user != null) return false;
        return pwd != null ? pwd.equals(that.pwd) : that.pwd == null;
    }

    @Override
    public int hashCode() {
        int result = className != null ? className.hashCode() : 0;
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        result = 31 * result + (pwd != null ? pwd.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "DataSourceInfoDto{" +
                "className='" + className + '\'' +
                ", url='" + url + '\'' +
                ", user='" + user + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
