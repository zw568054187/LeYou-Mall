package com.leyou.search.client;

import com.leyou.item.api.GoodsApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author zhangwei
 * @date 2018/12/27 12:04
 */
@FeignClient("item-service")
public interface GoodsClient extends GoodsApi {

}
