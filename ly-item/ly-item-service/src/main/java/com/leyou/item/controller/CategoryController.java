package com.leyou.item.controller;

import com.leyou.item.pojo.Category;
import com.leyou.item.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhangwei
 * @date 2018/12/17 19:04
 */

@RestController
@RequestMapping("category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    /**
     * 根据父节点id查询商品分类
     * @param pid 父节点id
     * @return 查询的所有数据
     */
    @GetMapping("list")
    public ResponseEntity<List<Category>> queryByParentId(@RequestParam("pid")Long pid){
        List<Category> categories = categoryService.queryByParentId(pid);
        return ResponseEntity.ok(categories);
    }
}
