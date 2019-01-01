package com.leyou.search.repository;

import com.leyou.search.pojo.Goods;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author zhangwei
 * @date 2018/12/27 14:26
 */
public interface GoodsRepository extends ElasticsearchRepository<Goods,Long> {
}
