package com.leyou.search.pojo;

import java.util.Map;

/**
 * @author zhangwei
 * @date 2018/12/28 17:15
 */
public class SearchRequest {
    /**
     * key 搜索字段
     * page 当前页
     * DEFAULT_SIZE 每页大小，不从页面接收，而是固定大小
     * DEFAULT_PAGE 默认页
     */
    private String key;
    private Integer page;

    private Map<String,String> filter;
    private static final Integer DEFAULT_SIZE = 20;
    private static final Integer DEFAULT_PAGE = 1;
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Integer getPage() {
        if(page == null){
            return DEFAULT_PAGE;
        }
        // 获取页码时做一些校验，不能小于1
        return Math.max(DEFAULT_PAGE, page);
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return DEFAULT_SIZE;
    }

    public Map<String, String> getFilter() {
        return filter;
    }
}
