package project.ljy.httputils;

import android.app.Application;

/**
 * Created by liujy006 on 2016/6/8.
 */
public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Thread.setDefaultUncaughtExceptionHandler(new BaseCrashHandler(this));
    }
}
