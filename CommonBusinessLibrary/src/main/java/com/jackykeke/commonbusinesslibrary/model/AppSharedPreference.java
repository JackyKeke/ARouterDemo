package com.jackykeke.commonbusinesslibrary.model;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by JackyKeke on 18-7-18.
 * e-mail：kyl794106786@gmail.com
 * github:https://github.com/JackyKeke
 * desc:
 */

public final class AppSharedPreference {


    private static SharedPreferences sp;

    private static  SharedPreferences getSp(Context context) {

        return context.getSharedPreferences(AppContants.SYS_CONF.SYS_SHAREDPREF, Context.MODE_PRIVATE);//不跨进程的数据私用调用

        //跟getSharedPreferences(AppContants.SYS_CONF.SYS_SHAREDPREF, 0)一样了

    }

//    public static long getLastLoginTime(Context c) {
//        sp = getSp(c);
//        return sp.getLong(AppContants.SYS_CONF.LAST_LOGIN_TIME, System.currentTimeMillis());
//    }
//
//    public static void setLastLoginTime(Context c, long loginTime) {
//        sp = getSp(c);
//        sp.edit().putLong(AppContants.SYS_CONF.LAST_LOGIN_TIME, loginTime).apply();
//    }


    /**
     * 是否有新消息
     *
     * @param c
     * @param count
     */
//    public static void setHaveNews(Context c, int count) {
//        sp = c.getSharedPreferences(AppContants.SYS_CONF.SYS_SHAREDPREF, Context.MODE_MULTI_PROCESS);  //跨进程的数据调用，否则就是第一次塞进的数据
//        sp.edit().putInt(AppContants.SYS_CONF.HAVE_NEWS, count).apply();
//    }
//
//    public static int getHaveNews(Context c) {
//        sp = c.getSharedPreferences(AppContants.SYS_CONF.SYS_SHAREDPREF, Context.MODE_MULTI_PROCESS);
//        return sp.getInt(AppContants.SYS_CONF.HAVE_NEWS, 0);
//    }

}
