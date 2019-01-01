package com.leyou.search.client;

import com.leyou.item.api.BrandApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author zhangwei
 * @date 2018/12/27 12:19
 */
@FeignClient("item-service")
public interface BrandClient extends BrandApi {
}
