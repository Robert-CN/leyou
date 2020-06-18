package com.leyou.result;

/**
 * @Author Robert
 * @Create 2020/6/16
 * @Desc TODO
 **/
public class Results<T> {
    public static <T> Result<T> build(Integer code, String msg, T data) {
        return new Result<>(code, msg, data);
    }

    public static <T> Result<T> build(Integer code, String msg) {
        return new Result<>(code, msg, null);
    }

    public static <T> Result<T> success() {
        return build(Tips.SUCCESS.code, Tips.SUCCESS.msg);
    }

    public static <T> Result<T> success(T data) {
        return build(Tips.SUCCESS.code, Tips.SUCCESS.msg, data);
    }

    public static <T> Result<T> success(String msg, T data) {
        return build(Tips.SUCCESS.code, msg, data);
    }

    public static <T> Result<T> failure() {
        return build(Tips.FAILURE.code, Tips.FAILURE.msg);
    }

    public static <T> Result<T> failure(String msg) {
        return build(Tips.FAILURE.code, msg);
    }

    public static <T> Result<T> failure(Integer code, String msg) {
        return build(code, msg);
    }
}
