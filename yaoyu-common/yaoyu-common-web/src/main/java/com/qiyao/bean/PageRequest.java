package com.qiyao.bean;

import lombok.Data;

/**
 * @ClassName PageRequest
 * @Description
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/09/19
 */
@Data
public class PageRequest {
    private  Long pageNo = 1L;

    private  Long pageSize = 10L;

    public Long getPageNo() {
        if(pageNo  == null || pageNo < 1){
            return  1L;
        }
        return pageNo;
    }

    public Long getPageSize() {
        if(pageSize == null || pageSize < 1 || pageSize > Integer.MIN_VALUE) {
            return 10L;
        }
        return pageSize;
    }
}
