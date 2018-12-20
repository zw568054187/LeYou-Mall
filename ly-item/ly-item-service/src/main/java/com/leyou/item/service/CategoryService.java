package com.leyou.item.service;

import com.leyou.common.enums.ExceptionEnum;
import com.leyou.common.exception.LyException;
import com.leyou.item.mapper.CategoryMapper;
import com.leyou.item.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @author zhangwei
 * @date 2018/12/17 20:05
 */
@Service
public class  CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;
    public List<Category> queryByParentId(Long pid) {
        Category category = new Category();
        category.setParentId(pid);
        List<Category> list = categoryMapper.select(category);
        //判断结果
        if (CollectionUtils.isEmpty(list)) {
            throw new LyException(ExceptionEnum.CATEGORY_NOT_FOUND);
        }
        return list;
    }

    public List<Category> queryByIds(List<Long> ids){
        List<Category> list = categoryMapper.selectByIdList(ids);
        if (CollectionUtils.isEmpty(list)) {
            throw new LyException(ExceptionEnum.CATEGORY_NOT_FOUND);
        }
        return list;
    }
}
