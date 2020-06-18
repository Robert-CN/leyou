package com.leyou.module.controller;

import com.leyou.module.service.CategoryService;
import com.leyou.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
