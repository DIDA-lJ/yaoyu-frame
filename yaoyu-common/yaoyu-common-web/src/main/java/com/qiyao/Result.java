package com.qiyao;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName Result
 * @Description
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/09/15
 */
@Data
public class Result<T> implements Serializable {

    private Boolean success;

    private Integer code;

    private String message;

    private T data;

    public static Result ok(Integer resultCode, String message) {
        Result result = new Result();
        result.setSuccess(true);
        result.setCode(resultCode);
        result.setMessage(message);
        return result;
    }

    public static <T> Result ok(Integer resultCode, String message, T data) {
        Result result = new Result();
        result.setSuccess(true);
        result.setCode(resultCode);
        result.setMessage(message);
        result.setData(data);
        return result;
    }

    public static <T> Result ok(T data) {
        Result result = new Result();
        result.setSuccess(true);
        result.setCode(ResultCode.SUCCESS);
        result.setMessage(ResultMessage.SUCCESS);
        result.setData(data);
        return result;
    }


    public static Result fail(Integer resultCode, String message) {
        Result result = new Result();
        result.setSuccess(true);
        result.setCode(resultCode);
        result.setMessage(message);
        return result;
    }

    public static <T> Result fail(Integer resultCode, String message, T data) {
        Result result = new Result();
        result.setSuccess(true);
        result.setCode(resultCode);
        result.setMessage(message);
        result.setData(data);
        return result;
    }

    public static <T> Result fail(T data) {
        Result result = new Result();
        result.setSuccess(true);
        result.setCode(ResultCode.ERROR);
        result.setMessage(ResultMessage.ERROR);
        result.setData(data);
        return result;
    }
}

