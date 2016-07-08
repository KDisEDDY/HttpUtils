package project.ljy.httputils.utils;


import android.os.Build;
import android.os.Handler;
import android.os.Message;

import org.apache.http.params.CoreConnectionPNames;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ch.boye.httpclientandroidlib.HttpResponse;
import ch.boye.httpclientandroidlib.HttpStatus;
import ch.boye.httpclientandroidlib.client.HttpClient;
import ch.boye.httpclientandroidlib.client.entity.UrlEncodedFormEntity;
import ch.boye.httpclientandroidlib.client.methods.HttpGet;
import ch.boye.httpclientandroidlib.client.methods.HttpPost;
import ch.boye.httpclientandroidlib.client.methods.HttpUriRequest;
import ch.boye.httpclientandroidlib.impl.client.HttpClients;
import ch.boye.httpclientandroidlib.message.BasicNameValuePair;
import ch.boye.httpclientandroidlib.protocol.HTTP;
import project.ljy.httputils.logic.request.BaseReq;
import project.ljy.httputils.logic.response.BaseRsp;

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

    int StatusCode = -1;

    Map<String,String> mHeader;
    public HttpRequest(UrlData urlData, List<RequestParameter> parameters, RequestCallback mCallback){
        this.mParameter = parameters;
        this.mCallback = mCallback;
        this.urlData = urlData;
        if (httpClient == null) {
            httpClient = HttpClients.createDefault();
        }
        mHeader = new HashMap<>();
    }

    static Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {

        }
    };

    public HttpUriRequest getRequest() {
        return request;
    }

    public void setRequest(HttpUriRequest request) {
        this.request = request;
    }

    HttpUriRequest request;


    @Override
    public void run() {
        if (urlData.getType() == REQUEST_GET){
            StringBuffer arg = new StringBuffer("");
            String newUrl ;
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

        request.getParams().setParameter(
                CoreConnectionPNames.CONNECTION_TIMEOUT, 30000);
        request.getParams().setParameter(CoreConnectionPNames.SO_TIMEOUT,
                30000);

        //设置Header
        setHeader(request);
        // 获取状态

        try {
            response = httpClient.execute(request);
            StatusCode = response.getStatusLine().getStatusCode();

        } catch (IOException e) {
            e.printStackTrace();
        }
        if(mCallback != null){
            final ByteArrayOutputStream content = new ByteArrayOutputStream();
            try {
                response.getEntity().writeTo(content);
            } catch (IOException e) {
                e.printStackTrace();
            }
            final String strResponse = new String(content.toByteArray()).trim();
            handler.post(new Runnable() {
                @Override
                public void run() {
                    mCallback.onExcute(StatusCode,strResponse);
                }
            });
        }
    }

    void setHeader(HttpUriRequest httpUriRequest){
        mHeader.clear();
        mHeader.put("Accept-Charset","UTF-8,*");
        mHeader.put("User-Agent", Build.MODEL + "," + Build.VERSION.RELEASE);
        mHeader.put("apikey", BaseReq.apikey);
        if(httpUriRequest != null && mHeader != null){
            for (final Map.Entry<String, String> entry : mHeader.entrySet()){
                    httpUriRequest.addHeader(entry.getKey(),entry.getValue());
            }
        }
    }

}
