package io.github.n7m.single.core.response;
// +----------------------------------------------------------------------
// | 官方网站: www.c2b666.com
// +----------------------------------------------------------------------
// | 功能描述: RESTFul 返回结果 JSON 格式化类
// +----------------------------------------------------------------------
// | 时　　间: 2019-12-02 13:21
// +----------------------------------------------------------------------
// | 代码创建: 朱荻 <292018748@qq.com>
// +----------------------------------------------------------------------
// | 版本信息: V1.0.0
// +----------------------------------------------------------------------
// | 代码修改:（修改人 - 修改时间）
// +----------------------------------------------------------------------


import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.n7m.single.core.json.GeneralViews;
import java.io.Serializable;

public class ResultFormat<T> implements Serializable {

    public final static Integer SUCCESS_CODE = 200;
    public final static Integer ERROR_CODE = 300;

    @JsonView(value = GeneralViews.Normal.class)
    private Integer code;

    @JsonView(value = GeneralViews.Normal.class)
    private String message;

    @JsonView(value = GeneralViews.Normal.class)
    private T result;

    public static <T> ResultFormat<T> response(int code, String message, T data) {
        ResultFormat<T> result = new ResultFormat<T>();
        result.setCode(code);
        result.setMessage(message);
        if (data == null) {
            data = (T) "";
        }
        result.setResult(data);
        return result;
    }

    public static <T> ResultFormat<T> success(String message, T data) {
        return ResultFormat.response(ResultFormat.SUCCESS_CODE, message, data);
    }

    public static <T> ResultFormat<T> success(T data) {
        return ResultFormat.success("success", data);
    }

    public static <T> ResultFormat<T> success(String message) {
        return ResultFormat.success(message, null);
    }

    public static <T> ResultFormat<T> error(String message) {
        return ResultFormat.response(ResultFormat.ERROR_CODE, message, null);
    }

    public static <T> ResultFormat<T> error() {
        return ResultFormat.error("error");
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public String toJson() {
        try {
            return new ObjectMapper().writeValueAsString(ResultFormat.response(code, message, result));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return "";
        }
    }

}
