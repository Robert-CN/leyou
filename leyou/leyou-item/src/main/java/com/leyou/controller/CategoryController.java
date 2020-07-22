package com.leyou.controller;

import com.leyou.result.Result;
import com.leyou.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Robert
 * @Create 2020/6/16
 * @Desc TODO
 **/
@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/list")
    public Result findCategoryList(@RequestParam(required = true) Integer pid) {
        return categoryService.findCategoryList(pid);
    }
}
