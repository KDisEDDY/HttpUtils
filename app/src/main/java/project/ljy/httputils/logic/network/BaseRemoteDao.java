package project.ljy.httputils.logic.network;

import java.util.List;

import project.ljy.httputils.utils.HttpRequest;
import project.ljy.httputils.utils.RequestCallback;
import project.ljy.httputils.utils.RequestManager;
import project.ljy.httputils.utils.RequestParameter;
import project.ljy.httputils.utils.StockRequestCallback;
import project.ljy.httputils.utils.UrlData;

/**
 * Title: BaseRemoteDao
 * Description:
 * Copyright: Copyright (c) 2014-2016 gjfax.com
 * Company: 广金所
 * Author: 刘加彦
 * Date: 2016/7/7
 * Version: 1.0
 */
public class BaseRemoteDao {

    static RequestManager requestManager;

    public BaseRemoteDao(){
        if(requestManager == null){
            requestManager = new RequestManager();
        }
    }


    public  void request(UrlData urlData , List<RequestParameter> parameters , RequestCallback requestCallback){
        requestManager.addRequest(new HttpRequest(urlData,parameters,requestCallback));
        requestManager.excuteRequest();
    }
}
