package com.weapes.util;

import java.lang.reflect.Field;

/**
 * Created by 不一样的天空 on 2017/6/26.
 */
public class Helper {
    public static String getPaperMetricsUrl(String url){
        int index1 = url.indexOf("/full");
        String subString = url.substring(0, index1);
        String subString1 = url.substring(index1);
        int index2 = subString1.indexOf(".html");
        String subString2 = subString1.substring(5, index2);
        return subString + subString2 + "/metrics";
    }
    /**
     * 判断一个对象的是否含有为空的属性
     */
    public static boolean hasEmptyField(Object object) {
        for (Field field : object.getClass().getDeclaredFields()) {
            try {
                field.setAccessible(true);
                String value = (String) field.get(object);
                if (value == null || value.equals("")) {
                    return true;
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
