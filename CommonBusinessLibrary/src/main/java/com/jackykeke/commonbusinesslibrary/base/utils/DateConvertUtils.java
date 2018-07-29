package com.jackykeke.commonbusinesslibrary.base.utils;

import android.annotation.SuppressLint;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by JackyKeke on 18-7-17.
 * e-mail：kyl794106786@gmail.com
 * github:https://github.com/JackyKeke
 * desc:  日期转换工具类
 */

public class DateConvertUtils {

    public static final String DATA_FORMAT_PATTEN_YYYY_MMMM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";
    public static final String DATA_FORMAT_PATTEN_YYYY_MMMM_DD_HH_MM = "yyyy-MM-dd HH:mm";
    public static final String DATA_FORMAT_PATTEN_YYYY_MMMM_DD = "yyyy-MM-dd";
    public static final String DATA_FORMAT_PATTEN_MMMM_DD = "MM-dd";

    public static final String DATA_FORMAT_PATTEN_HH_MM_SS = "HH:mm:ss";

    /**
     * 将时间转换为时间戳
     *
     * @param data             待转换的日期
     * @param dataFormatPatten 待转换日期格式
     */
    public static long dateToTimeStamp(String data, String dataFormatPatten) {
        @SuppressLint("SimpleDateFormat")
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dataFormatPatten);
        Date date = null;
        try {
            date = simpleDateFormat.parse(data);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        assert date != null;
        return date.getTime();
    }

    /**
     * 将时间戳转换为日期
     *
     * @param time             待转换的时间戳
     * @param dataFormatPatten 转换出的日期格式
     */
    public static String timeStampToDate(long time, String dataFormatPatten) {
        @SuppressLint("SimpleDateFormat")
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dataFormatPatten);
        Date date = new Date(time);
        return simpleDateFormat.format(date);
    }


}
