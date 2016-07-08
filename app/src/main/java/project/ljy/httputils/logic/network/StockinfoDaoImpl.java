package project.ljy.httputils.logic.network;

import java.util.ArrayList;
import java.util.List;

import project.ljy.httputils.logic.network.Interface.IStockinfoDao;
import project.ljy.httputils.logic.response.StockRsp;
import project.ljy.httputils.model.StockBO;
import project.ljy.httputils.utils.HttpRequest;
import project.ljy.httputils.utils.RequestCallback;
import project.ljy.httputils.utils.RequestParameter;
import project.ljy.httputils.utils.RequestStockInfoCallable;
import project.ljy.httputils.utils.UrlData;

/**
 * Title: StockinfoDaoImpl
 * Description: 股票查询的获取数据操作实现类
 * Copyright: Copyright (c) 2014-2016 gjfax.com
 * Company: 广金所
 * Author: 刘加彦
 * Date: 2016/7/7
 * Version: 1.0
 */
public class StockinfoDaoImpl extends BaseRemoteDao implements IStockinfoDao {


    @Override
    public void queryStockInfo(String url, String stockId, int listNum, final RequestStockInfoCallable requestStockInfoCallable) {
        UrlData urlData = new UrlData();
        if(url != null && !url.equals("")){
            urlData.setUrl(url);
        }
        urlData.setType(HttpRequest.REQUEST_GET);
        List<RequestParameter> parameters = new ArrayList<>();

        if(listNum > -1){
            parameters.add(new RequestParameter("list" , listNum + ""));
        }

        if(stockId != null && !stockId.equals("")){
            parameters.add(new RequestParameter("stockid",stockId));
        }

        request(urlData, parameters, new RequestCallback<StockRsp>(StockRsp.class) {
            @Override
            public void onFail(int errorType) {
                requestStockInfoCallable.onCallbackFail(errorType);
            }

            @Override
            public void onSuccess(StockRsp content) {
                StockBO stockBO = new StockBO();
                    stockBO.setRetData(content.getRetData());
                    stockBO.setErrMsg(content.getErrMsg());
                    stockBO.setErrNum(content.getErrNum());
                requestStockInfoCallable.queryStockInfo(stockBO);
            }
        });
    }
}
