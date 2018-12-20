package com.leyou.common.vo;

import lombok.Data;

import java.util.List;

/**
 * @author zhangwei
 * @date 2018/12/19 19:58
 */
//value obiect 渲染视图给页面用的
@Data
public class PageResult<T>{
    /**
     * total 总条数
     * totalPage 总页数
     * items 当前页的数据
     */
    private Long total;
    private Integer totalPage;
    private List<T> items;

    public PageResult() {
    }

    public PageResult(Long total, List<T> items) {
        this.total = total;
        this.items = items;
    }

    public PageResult(Long total, Integer totalPage, List<T> items) {
        this.total = total;
        this.totalPage = totalPage;
        this.items = items;
    }
}
