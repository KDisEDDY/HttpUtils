package project.ljy.httputils;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import project.ljy.httputils.logic.StockApi;
import project.ljy.httputils.logic.response.StockRsp;
import project.ljy.httputils.utils.HttpRequest;
import project.ljy.httputils.utils.RequestManager;
import project.ljy.httputils.utils.RequestParameter;
import project.ljy.httputils.utils.StockRequestCallback;
import project.ljy.httputils.utils.UrlData;

public class MainActivity extends AppCompatActivity {

    RequestManager requestManager ;

    //控件
    TextView text1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        //初始化网络管理类和填写参数
        requestManager = new RequestManager();
        UrlData urlData = new UrlData();
        urlData.setType(HttpRequest.REQUEST_GET);
        urlData.setUrl(StockApi.StockUrl);
        List<RequestParameter> parameters = new ArrayList<>();
        parameters.add(new RequestParameter("stockid","00168"));
        parameters.add(new RequestParameter("list","1"));
        requestManager.addRequest(new HttpRequest(urlData,parameters,new StockRequestCallback(){
            @Override
            public void onFail(int errorType) {
                super.onFail(errorType);
            }

            @Override
            public void onSuccess(String content) {
                Gson gson  =  new Gson();
                final StockRsp stockRsp = gson.fromJson(
                        content, StockRsp.class);
                text1.setText(stockRsp.getRetData().getMarket().getShenzhen().getName());
            }
        }));

        requestManager.excuteRequest();
    }

    @Override
    protected void onPause() {
        super.onPause();
        requestManager.cancelAllRequest();
    }

    private void initView(){
        text1 = (TextView) findViewById(R.id.text1);
    }
}
