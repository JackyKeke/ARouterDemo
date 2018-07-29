package com.jackykeke.commonbusinesslibrary.base;

import android.app.Application;

import com.alibaba.android.arouter.BuildConfig;
import com.alibaba.android.arouter.launcher.ARouter;


/**
 * Created by JackyKeke on 18-7-17.
 * e-mail：kyl794106786@gmail.com
 * github:https://github.com/JackyKeke
 * desc:  整个app的application
 */

public class BaseApplication extends Application {

    private static BaseApplication application;


    public static BaseApplication getApplication(){
        return application;
    }


    @Override
    public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) {
            ARouter.openLog();     // 打印日志
            ARouter.openDebug();   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        }

        ARouter.init(this);

        application = this;
    }
}
