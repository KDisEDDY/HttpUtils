package project.ljy.httputils.Exception;

import android.content.Context;

/**
 * Created by liujy006 on 2016/6/8.
 */
public class BaseCrashHandler implements Thread.UncaughtExceptionHandler {

    Context context;
    public BaseCrashHandler(Context cntext){
            context = cntext;
    }

    @Override
    public void uncaughtException(Thread thread, Throwable throwable) {

    }
}
