package project.ljy.httputils;

import android.app.Application;
import android.content.Context;
import android.os.Looper;
import android.widget.Toast;

/**
 * Created by liujy006 on 2016/6/8.
 */
public class BaseCrashHandler implements Thread.UncaughtExceptionHandler {
    Context context;
    
    Thread.UncaughtExceptionHandler mCrashHandler;


    public BaseCrashHandler(Context context) {
            this.context = context;
            mCrashHandler = Thread.getDefaultUncaughtExceptionHandler();
    }

    @Override
    public void uncaughtException(Thread thread, final Throwable ex) {

        if( mCrashHandler != null){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //提示
            new Thread() {
                @Override
                public void run() {
                    Looper.prepare();
                    Toast.makeText(context, ex.getMessage(), Toast.LENGTH_SHORT).show();
                    Looper.loop();
                }
            }.start();

            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(1);

        }
    }
}
