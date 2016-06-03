package project.ljy.httputils.utils;

/**
 * Created by liujy006 on 2016/6/3.
 */
public class UrlData {
    public int getType() {
        return Type;
    }

    public void setType(int type) {
        Type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    private int Type;
    private String url;
}
