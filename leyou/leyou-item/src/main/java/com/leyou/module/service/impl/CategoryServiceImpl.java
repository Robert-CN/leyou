package com.leyou.module.service.impl;

import com.leyou.module.mapper.CategoryMapper;
import com.leyou.module.pojo.Category;
import com.leyou.module.service.CategoryService;
import com.leyou.result.Result;
import com.leyou.result.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Robert
 * @Create 2020/6/18
 * @Desc TODO
 **/
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public Result findCategoryList(Integer pid) {
        List<Category> categoryList = categoryMapper.findCategoryList(pid);
        return Results.success(categoryList);
    }
}
