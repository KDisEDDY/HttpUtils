package project.ljy.httputils;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import project.ljy.httputils.logic.StockApi;
import project.ljy.httputils.logic.network.StockinfoDaoImpl;
import project.ljy.httputils.logic.response.StockRsp;
import project.ljy.httputils.model.StockBO;
import project.ljy.httputils.utils.HttpRequest;
import project.ljy.httputils.utils.RequestManager;
import project.ljy.httputils.utils.RequestParameter;
import project.ljy.httputils.utils.RequestStockInfoCallable;
import project.ljy.httputils.utils.SingletonFactory;
import project.ljy.httputils.utils.StockRequestCallback;
import project.ljy.httputils.utils.UrlData;

public class MainActivity extends AppCompatActivity {

    //控件
    TextView text1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        SingletonFactory.getInstance(StockinfoDaoImpl.class).queryStockInfo(StockApi.StockUrl,"00168",1, new RequestStockInfoCallable(){
            @Override
            public void onCallbackFail(int errorType) {
                super.onCallbackFail(errorType);
            }

            @Override
            public void queryStockInfo(StockBO stockBO) {
                if(stockBO.getRetData() != null && stockBO.getRetData().getStockinfo().size() > 0){
                    text1.setText(stockBO.getRetData().getMarket().getShenzhen().getName());
                }
            }
        });

    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    private void initView(){
        text1 = (TextView) findViewById(R.id.text1);
    }
}
