package com.qiyao.entity;

import com.baomidou.mybatisplus.core.metadata.IPage;
import lombok.Data;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName PageResult
 * @Description
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/09/19
 */

@Data
public class PageResult<T> implements Serializable {

    private Long total;

    private Long size;

    private Long current;

    private Long pages;

    private List<T> records = Collections.emptyList();

    public  void loadData(IPage<T> pageData) {
        this.setCurrent(pageData.getCurrent());
        this.setPages(pageData.getPages());
        this.setTotal(pageData.getSize());
        this.setTotal(pageData.getTotal());
        this.setRecords(pageData.getRecords());
    }
}
