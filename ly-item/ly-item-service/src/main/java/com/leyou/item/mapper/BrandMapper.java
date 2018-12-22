package com.leyou.item.mapper;

import com.leyou.item.pojo.Brand;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author zhangwei
 * @date 2018/12/19 19:52
 */
public interface BrandMapper extends Mapper<Brand> {
    /**
     * 新增品牌
     * @param cid
     * @param bid
     * @return
     */
    @Insert("INSERT INTO tb_category_brand (category_id, brand_id) VALUES (#{cid},#{bid})")
    int insertCategoryBrand(@Param("cid")Long cid,@Param("bid")Long bid);

    /**
     * 通过cid查询品牌信息
     * @param cid
     * @return
     */
    @Select("select b.* from tb_category_brand cb left join tb_brand b on cb.brand_id = b.id where cb.category_id = #{cid}")
    List<Brand> queryBrandByCid(@Param("cid") Long cid);
}
