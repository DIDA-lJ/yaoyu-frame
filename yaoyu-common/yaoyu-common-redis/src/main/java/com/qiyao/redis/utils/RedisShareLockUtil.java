package com.qiyao.redis.utils;

import com.qiyao.redis.exception.ShareLockException;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName RedisShareLockUtil
 * @Description
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/09/30
 */
@Component
public class RedisShareLockUtil {
    @Resource
    private RedisUtil redisUtil;

    private Long TIME_OUT = 10000L;

    /**
     * 分布式锁加锁
     *
     * @param lockKey   锁对象
     * @param requestId 用于区别两个锁的类型
     * @param time      加锁时间
     * @return
     */
    public boolean lock(String lockKey, String requestId, Long time) {
        //1.参数校验
        if (StringUtils.isBlank(lockKey) || StringUtils.isBlank(requestId) || time <= 0) {
            //分布式锁异常:分布式锁中传输的锁定参数异常，导致加锁失败。
            throw new ShareLockException("ShareLockException:The lock parameters transmitted in distributed locks are abnormal, causing the lock failure.");
        }
        long currentTime = System.currentTimeMillis();
        long outTime = currentTime + TIME_OUT;
        Boolean result = false;
        //2.加锁可以自旋转
        while (currentTime < outTime) {
            //3.利用 Redis 的 setnx 来进行锁的设置
            result = redisUtil.setNx(lockKey, requestId, time, TimeUnit.MILLISECONDS);
            if (result) {
                return result;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            currentTime = System.currentTimeMillis();
        }
        return result;
    }

    /**
     * 分布式锁解锁
     *
     * @param lockKey   解锁对象
     * @param requestId 解锁对象的 ID
     * @return
     */
    public boolean unlock(String lockKey, String requestId) {
        if (StringUtils.isBlank(lockKey) || StringUtils.isBlank(requestId)) {
            //分布式锁异常:分布式锁中传输的锁定参数异常，导致加锁失败。
            throw new ShareLockException("ShareLockException:The lock parameter abnormalities transmitted in the distributed unlock operation cause the unlock failure.");
        }
        try {
            //查看 Redis 中是否获取到
            String value = redisUtil.get(lockKey);
            if (value != null || value.equals(requestId)) {
                // 根据 lockKey 删除锁对象
                boolean del = redisUtil.del(lockKey);
                if (del) {
                    return true;
                }
            }
        } catch (Exception e) {
            //todo 后续补充一下日志
        }
        return false;
    }

    /**
     * 分布式锁尝试加锁
     * 快速失败策略:与加锁操作差不多，但是直接返回加锁结果就可以了
     * @param lockKey   锁对象
     * @param requestId 用于区别两个锁的类型
     * @param time      加锁时间
     * @return
     */
    public boolean trylock(String lockKey, String requestId, Long time) {
        //1.参数校验
        if (StringUtils.isBlank(lockKey) || StringUtils.isBlank(requestId) || time <= 0) {
            //分布式锁异常:分布式锁中传输的锁定参数异常，导致尝试加锁失败。
            throw new ShareLockException("ShareLockException:The lock parameters transmitted in the distributed lock are abnormal, causing the attempt to lock failure.");
        }
        // 直接返回是否加锁成功，不成功也不继续尝试
        return redisUtil.setNx(lockKey, requestId, time, TimeUnit.MILLISECONDS);
    }
}
