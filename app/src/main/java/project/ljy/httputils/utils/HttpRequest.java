package project.ljy.httputils.utils;


import android.os.Handler;
import android.os.Message;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import ch.boye.httpclientandroidlib.HttpResponse;
import ch.boye.httpclientandroidlib.client.HttpClient;
import ch.boye.httpclientandroidlib.client.entity.UrlEncodedFormEntity;
import ch.boye.httpclientandroidlib.client.methods.HttpGet;
import ch.boye.httpclientandroidlib.client.methods.HttpPost;
import ch.boye.httpclientandroidlib.client.methods.HttpUriRequest;
import ch.boye.httpclientandroidlib.impl.client.HttpClients;
import ch.boye.httpclientandroidlib.message.BasicNameValuePair;
import ch.boye.httpclientandroidlib.protocol.HTTP;

/**
 * 对请求的封装
 * Created by liujy006 on 2016/6/3.
 */
public class HttpRequest implements Runnable{

    // 区分get还是post的枚举
    public static final int REQUEST_GET = 1;
    public static final int REQUEST_POST = 2;

    static HttpClient httpClient ;

    RequestCallback mCallback;

    UrlData urlData ;

    HttpResponse response ;

    List<RequestParameter> mParameter;

    HttpRequest(UrlData urlData, List<RequestParameter> parameters, RequestCallback mCallback){
        this.mParameter = parameters;
        this.mCallback = mCallback;
        this.urlData = urlData;
        if (httpClient == null) {
            httpClient = HttpClients.createDefault();
        }

    }

    static Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {

        }
    };

//    public HttpUriRequest getRequest() {
//        return request;
//    }
//
//    public void setRequest(HttpUriRequest request) {
//        this.request = request;
//    }

    HttpUriRequest request;


    @Override
    public void run() {
        if (urlData.getType() == REQUEST_GET){
            StringBuffer arg = new StringBuffer("");
            String newUrl = null;
            if (mParameter != null && mParameter.size() > 0){
                for(int i = 0 ;i < mParameter.size() ;i ++){
                    arg.append(mParameter.get(i).getName()).append("=").append(mParameter.get(i).getValue());
                    if (i != mParameter.size() -1) {
                        arg.append("&");
                    }
                }
                newUrl = urlData.getUrl() + "?" + arg.toString().trim();
            }
            else{
                newUrl = urlData.getUrl();
            }

            request = new HttpGet(newUrl);

        }
        else if(urlData.getType() == REQUEST_POST){
            request = new HttpPost(urlData.getUrl());

            List<BasicNameValuePair> list = new ArrayList<>();
            for(RequestParameter parameter : mParameter){
                list.add(new BasicNameValuePair(parameter.getName(),parameter.getValue()));
            }
            try {
                ((HttpPost) request).setEntity(new UrlEncodedFormEntity(
                        list, HTTP.UTF_8));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        else {
            return ;
        }


    }

}
