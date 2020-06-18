package com.leyou.module.controller;

import com.leyou.module.service.CategoryService;
import com.leyou.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
    public Result list(Integer pid){
        return categoryService.findCategoryList(pid);
    }
}
