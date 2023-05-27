package io.github.n7m.single.core.json;
// +----------------------------------------------------------------------
// | 官方网站: www.c2b666.com
// +----------------------------------------------------------------------
// | 功能描述: 
// +----------------------------------------------------------------------
// | 时　　间: 2020/6/15 22:02
// +----------------------------------------------------------------------
// | 代码创建: 朱荻 <292018748@qq.com>
// +----------------------------------------------------------------------
// | 版本信息: V1.0.0
// +----------------------------------------------------------------------
// | 代码修改:（修改人 - 修改时间）
// +----------------------------------------------------------------------

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.util.List;

public class GsonUtil {

    public static <T> List<T> toList(String json, Class<T> cls) {
        List<T> list = new GsonBuilder()
                .setPrettyPrinting()
                .create()
                .fromJson(json, TypeToken.getParameterized(List.class, cls).getType());
        return list;
    }

    public static String toJson(Object object) {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        return gson.toJson(object);
    }

    public static <T> T toClass(String str, Class<T> cls) {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        return gson.fromJson(str, cls);
    }

}
