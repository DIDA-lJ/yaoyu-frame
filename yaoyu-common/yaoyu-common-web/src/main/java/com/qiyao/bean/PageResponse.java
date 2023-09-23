package com.qiyao.bean;

import lombok.Data;

import java.util.Collections;
import java.util.List;

/**
 * @ClassName PageResponse
 * @Description
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/09/19
 */
@Data
public class PageResponse<T> {

    private Long pageNo = 1L;

    private Long pageSize = 10L;

    private Long total = 0L;

    private Long totalPages = 0L;

    private List<T> result = Collections.emptyList();

    private Long start = 1L;

    private Long end = 0L;

    public PageResponse() {
    }

    public void setRecords(List<T> result) {
        this.result = result;
        if (result != null && result.size() > 0 && this.total == 0) {
            setTotal(Long.valueOf(result.size()));
        }
    }

    public void setCurrent(Long pageNo) {
        if (pageNo != null && pageNo > 0) {
            this.pageNo = pageNo;
        }
    }

    public void setPageSize(Long pageSize) {
        if (pageSize != null && pageSize > 0) {
            this.pageSize = pageSize;
        }
    }

    public Long getPageStart() {
        return (this.pageNo - 1) * pageSize;
    }

    public void setTotal(Long total) {
        this.total = total;
        if (total == -1) {
            this.pageNo = 1L;
            return;
        }
        if (this.pageSize > 0) {
            this.totalPages = (total / this.pageSize) + (total % this.pageSize == 0 ? 0 : 1);
        } else {
            this.totalPages = 0L;
        }
        this.start = (this.pageNo > 0 ? (this.pageNo - 1) * this.pageSize : 0) + 1;
        this.end = (this.start - 1 + this.pageSize * (this.pageNo > 0 ? 1 : 0));
    }
}
