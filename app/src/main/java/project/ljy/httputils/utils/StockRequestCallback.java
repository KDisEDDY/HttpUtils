package project.ljy.httputils.utils;

/**
 * Created by liujy006 on 2016/6/3.
 */
abstract public class StockRequestCallback extends RequestCallback {

    public StockRequestCallback(Class rspClass) {
        super(rspClass);
    }

    @Override
    public void onFail(int errorType) {

    }

}
