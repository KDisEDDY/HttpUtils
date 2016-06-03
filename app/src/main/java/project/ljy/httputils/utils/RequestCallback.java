package project.ljy.httputils.utils;

/**
 * Created by liujy006 on 2016/6/3.
 */
public interface RequestCallback {

    void onFail(int errorType);

    void onSuccess(String content);

}
