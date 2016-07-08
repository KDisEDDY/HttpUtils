package project.ljy.httputils.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import project.ljy.httputils.logic.response.StockRsp;

/**
 * Title: StockBO
 * Description: 股票数据的业务对象
 * Copyright: Copyright (c) 2014-2016 gjfax.com
 * Company: 广金所
 * Author: 刘加彦
 * Date: 2016/7/8
 * Version: 1.0
 */
public class StockBO {
    /**
     * errNum : 0
     * errMsg : success
     * retData : {"stockinfo":[{"name":"青岛啤酒","code":"00168","date":"2016/06/08 11:34","openningPrice":28.6,"closingPrice":28.6,"hPrice":29,"lPrice":28.25,"currentPrice":29,"growth":0.4,"growthPercent":1.399,"dealnumber":336000,"turnover":9640850,"52hPrice":50.95,"52lPrice":26.1}],"market":{"shanghai":{"name":"上证指数","curdot":2922.983,"curprice":-13.0619,"rate":-0.44,"dealnumber":786794,"turnover":9736129},"shenzhen":{"name":"深证成指","curdot":10298.07,"curprice":-49.768,"rate":-0.48,"dealnumber":115528975,"turnover":20549747},"DJI":{"name":"道琼斯","date":"2016-06-08 07:33:05","curdot":17938.28,"rate":0.1,"growth":17.95,"startdot":17936.22,"closedot":17920.33,"hdot":18003.23,"ldot":17936.22,"turnover":0},"IXIC":{"name":"纳斯达克","date":"2016-06-08 05:40:00","curdot":4961.75,"rate":-0.14,"growth":-6.96,"startdot":4972.14,"closedot":4968.71,"hdot":4979.38,"ldot":4960.28,"turnover":1712138834},"INX":{"name":"纳斯达克","date":"2016-06-08 05:40:00","curdot":2112.13,"rate":0.13,"growth":2.72,"startdot":2110.18,"closedot":2109.41,"hdot":2119.22,"ldot":2110.18,"turnover":0},"HSI":{"name":"恒生指数","date":"2016/06/08 11:51","curdot":21275.3,"rate":-0.25,"growth":-52.94,"startdot":21294.27,"closedot":21328.24,"hdot":21298.2,"ldot":21179.95,"turnover":29677294,"52hdot":27470.5,"52ldot":18278.8}}}
     */

    private int errNum;
    private String errMsg;
    /**
     * stockinfo : [{"name":"青岛啤酒","code":"00168","date":"2016/06/08 11:34","openningPrice":28.6,"closingPrice":28.6,"hPrice":29,"lPrice":28.25,"currentPrice":29,"growth":0.4,"growthPercent":1.399,"dealnumber":336000,"turnover":9640850,"52hPrice":50.95,"52lPrice":26.1}]
     * market : {"shanghai":{"name":"上证指数","curdot":2922.983,"curprice":-13.0619,"rate":-0.44,"dealnumber":786794,"turnover":9736129},"shenzhen":{"name":"深证成指","curdot":10298.07,"curprice":-49.768,"rate":-0.48,"dealnumber":115528975,"turnover":20549747},"DJI":{"name":"道琼斯","date":"2016-06-08 07:33:05","curdot":17938.28,"rate":0.1,"growth":17.95,"startdot":17936.22,"closedot":17920.33,"hdot":18003.23,"ldot":17936.22,"turnover":0},"IXIC":{"name":"纳斯达克","date":"2016-06-08 05:40:00","curdot":4961.75,"rate":-0.14,"growth":-6.96,"startdot":4972.14,"closedot":4968.71,"hdot":4979.38,"ldot":4960.28,"turnover":1712138834},"INX":{"name":"纳斯达克","date":"2016-06-08 05:40:00","curdot":2112.13,"rate":0.13,"growth":2.72,"startdot":2110.18,"closedot":2109.41,"hdot":2119.22,"ldot":2110.18,"turnover":0},"HSI":{"name":"恒生指数","date":"2016/06/08 11:51","curdot":21275.3,"rate":-0.25,"growth":-52.94,"startdot":21294.27,"closedot":21328.24,"hdot":21298.2,"ldot":21179.95,"turnover":29677294,"52hdot":27470.5,"52ldot":18278.8}}
     */

    private StockRsp.RetDataBean retData;

    public int getErrNum() {
        return errNum;
    }

    public void setErrNum(int errNum) {
        this.errNum = errNum;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public StockRsp.RetDataBean getRetData() {
        return retData;
    }

    public void setRetData(StockRsp.RetDataBean retData) {
        this.retData = retData;
    }

}
