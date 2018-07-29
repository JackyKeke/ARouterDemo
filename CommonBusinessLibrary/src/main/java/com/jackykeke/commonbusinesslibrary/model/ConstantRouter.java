package com.jackykeke.commonbusinesslibrary.model;

import android.app.Application;

import com.jackykeke.commonbusinesslibrary.R;
import com.jackykeke.commonbusinesslibrary.base.BaseApplication;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by JackyKeke on 18-7-17.
 * e-mail：kyl794106786@gmail.com
 * github:https://github.com/JackyKeke
 * desc:   静态路由跳转页
 */

public class ConstantRouter {


    //各个模块首页和跳转地址的映射
    public static Map<String, String> moduleRouterMap = new HashMap<>();

    //主页
    public static String APP_MAINACTIVITY = "/app/MainActivity";

    //订单首页
    public static String ORDER_MAINACTIVITY = "/OrderModule/OrderMainActivity";

    //评价首页
    public static String EVALUATION_MAINACTIVITY = "/EvaluationModule/EvaluationMainActivity";

    //统计首页
    public static String STATISTICS_MAINACTIVITY = "/StatisticsModule/StatisticsMainActivity";

    //更多首页
    public static String MORE_MAINACTIVITY = "/MoreModule/MoreMainActivity";


    static {
        moduleRouterMap.put(BaseApplication.getApplication().getString(R.string.label_app), APP_MAINACTIVITY);
        moduleRouterMap.put(BaseApplication.getApplication().getString(R.string.label_order_module), ORDER_MAINACTIVITY);
        moduleRouterMap.put(BaseApplication.getApplication().getString(R.string.label_evaluation_module), EVALUATION_MAINACTIVITY);
        moduleRouterMap.put(BaseApplication.getApplication().getString(R.string.label_statistics_module), STATISTICS_MAINACTIVITY);
        moduleRouterMap.put(BaseApplication.getApplication().getString(R.string.label_more_module), MORE_MAINACTIVITY);

    }


    public static String getNowRouter(String label) {
        return moduleRouterMap.get(label);
    }


}
