package project.ljy.httputils.logic.network.Interface;

import project.ljy.httputils.utils.DownFileCallble;

/**
 * Title: IDownloadDao
 * Description:
 * Copyright: Copyright (c) 2014-2016 gjfax.com
 * Company: 广金所
 * Author: 刘加彦
 * Date: 2016/10/31
 * Version: 1.0
 */
public interface IDownloadDao {

    void downloadFile(String url , DownFileCallble callble);
}
