package project.ljy.httputils.utils;

import java.util.ArrayList;
import java.util.List;

import project.ljy.httputils.utils.threadpool.ThreadPool;


/**
 * Created by liujy006 on 2016/6/3.
 */
public class RequestManager {

    List<HttpRequest> requestList;

    ThreadPool pool ;

    public RequestManager() {
        requestList = new ArrayList<>();
        pool = ThreadPool.getInstance();
    }

    public void addRequest(HttpRequest httpRequest){
        if(requestList != null)
        requestList.add(httpRequest);
    }

    public void excuteRequest(){
        for(HttpRequest request :requestList){
            pool.excute(request);
        }
    }

    public void cancelAllRequest(){
        if(requestList != null)
        for(HttpRequest request : requestList){
            if(request.getRequest() != null){
                try {
                    request.getRequest().abort();
                    requestList.remove(request.getRequest());
                } catch (final UnsupportedOperationException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
