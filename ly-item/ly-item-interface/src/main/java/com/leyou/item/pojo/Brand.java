package com.leyou.item.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author zhangwei
 * @date 2018/12/19 19:47
 */
@Data
@Table(name = "tb_brand")
public class Brand {
    /**
     * id
     * 品牌名称
     * 品牌图片
     */
    @Id
    @KeySql(useGeneratedKeys = true)
    private Long id;
    private String name;
    private String image;
    private Character letter;
}
