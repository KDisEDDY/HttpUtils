package project.ljy.httputils.logic.network.Interface;

import project.ljy.httputils.utils.RequestStockInfoCallable;

/**
 * Title: IStockinfoDao
 * Description:
 * Copyright: Copyright (c) 2014-2016 gjfax.com
 * Company: 广金所
 * Author: 刘加彦
 * Date: 2016/7/7
 * Version: 1.0
 */
public interface IStockinfoDao {

    /**
     * 传入参数，在实现类里面封装好parameter类
     * @param url api地址
     * @param stockId 股票代码
     * @param listNum 获取的数据条数
     * @param requestStockInfoCallable 股票信息的回调
     */
    void queryStockInfo(String url ,String stockId,int listNum , RequestStockInfoCallable requestStockInfoCallable);
}
