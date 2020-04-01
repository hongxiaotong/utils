package com.hxt.tools;

/**
 * fastjson解析json工具类
 */

import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

public class FastJsonUtils {

    /**
     * 功能描述：把JSON数据转换成指定的java对象
     *
     * @param json  JSON数据
     * @param clazz 指定的java对象
     * @return 指定的java对象
     */
    public static <T> T jsonToBean(String json, Class<T> clazz) {
        return JSON.parseObject(json, clazz);
    }

    /**
     * 功能描述：把java对象转换成JSON数据
     *
     * @param object java对象
     * @return JSON数据
     */
    public static String toJson(Object object) {
        return JSON.toJSONString(object);
    }

    /**
     * 功能描述：把JSON数据转换成指定的java对象列表
     *
     * @param json  JSON数据
     * @param clazz 指定的java对象
     * @return List<T>
     */
    public static <T> List<T> jsonToList(String json, Class<T> clazz) {
        return JSON.parseArray(json, clazz);
    }

    /**
     * 功能描述：把JSON数据转换成较为复杂的List<Map<String, Object>>
     *
     * @param json JSON数据
     * @return List<Map < String, Object>>
     */
    public static List<Map<String, Object>> jsonToListMaps(String json) {
        return JSON.parseObject(json, new TypeReference<List<Map<String, Object>>>() {
        });
    }
}