package com.leyou.search.client;

import com.leyou.item.api.CategoryApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author zhangwei
 * @date 2018/12/27 11:28
 */
@FeignClient("item-service")
public interface CategoryClient extends CategoryApi {
}
