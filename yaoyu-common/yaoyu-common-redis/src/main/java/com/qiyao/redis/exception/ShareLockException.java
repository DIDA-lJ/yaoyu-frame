package com.qiyao.redis.exception;

/**
 * @ClassName ShareLockException
 * @Description 分布式锁异常类
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/10/01
 */
public class ShareLockException extends RuntimeException {
    public ShareLockException(String message) {
        super(message);
    }

}
