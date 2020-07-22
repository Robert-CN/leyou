package com.leyou.result;

/**
 * @Author Robert
 * @Create 2020/6/16
 * @Desc TODO
 **/
public enum Tips {
    SUCCESS(200,"成功"),
    FAILURE(400,"失败"),
    INVALID_FILE_TYPE("无效的文件类型"),
    FILE_UPLOAD_ERROR("文件上传失败")
    ;
    public Integer code;
    public String msg;

    Tips(String msg) {
        this.msg = msg;
    }

    Tips(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
