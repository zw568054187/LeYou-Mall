package com.leyou.page.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhangwei
 * @date 2019/1/27 11:54
 */
@Controller
@RequestMapping("item")
public class PageController {

    @GetMapping("{id}.html")
    public String GoodsController(@PathVariable("id")Long id,Model model){

        return "item";
    }
}
