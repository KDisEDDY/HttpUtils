package project.ljy.httputils.logic.network;

import java.util.ArrayList;
import java.util.List;

import project.ljy.httputils.logic.network.Interface.IStockinfoDao;
import project.ljy.httputils.utils.RequestParameter;
import project.ljy.httputils.utils.StockRequestCallback;
import project.ljy.httputils.utils.UrlData;

/**
 * Title: StockinfoDaoImpl
 * Description:
 * Copyright: Copyright (c) 2014-2016 gjfax.com
 * Company: 广金所
 * Author: 刘加彦
 * Date: 2016/7/7
 * Version: 1.0
 */
public class StockinfoDaoImpl extends BaseRemoteDao implements IStockinfoDao {


    @Override
    public void queryStockInfo(String url, String stockId, int listNum, StockRequestCallback stockRequestCallback) {
        UrlData urlData = new UrlData();
        if(url != null && !url.equals("")){
            urlData.setUrl(url);
        }
        List<RequestParameter> parameters = new ArrayList<>();

        if(listNum > -1 && stockId != null && !stockId.equals("")){
            parameters.add(new RequestParameter("stockid",stockId));
            parameters.add(new RequestParameter("list" , listNum + ""));
        }

        request(urlData,parameters,stockRequestCallback);
    }
}
