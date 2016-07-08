package project.ljy.httputils.utils;

import com.google.gson.Gson;

import project.ljy.httputils.logic.response.BaseRsp;

/**
 * Created by liujy006 on 2016/6/3.
 */
public abstract  class RequestCallback<T extends BaseRsp> {


    private Class<T> rspClass = null;

    public RequestCallback(Class<T> rspClass){
        this.rspClass = rspClass;
    }

    public abstract void onFail(int errorType);

    public  void onExcute(int codeType,String content){
          if(content != null && !content.equals("")){
              Gson gson  =  new Gson();
              final T rsp = gson.fromJson(
                      content, rspClass);
              onSuccess(rsp);
              return ;
          }
        onFail(codeType);
    }

    public void onSuccess(T content){

    }

}
