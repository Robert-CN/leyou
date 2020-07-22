package com.leyou.service.impl;

import com.leyou.mapper.CategoryMapper;
import com.leyou.pojo.Category;
import com.leyou.result.Result;
import com.leyou.result.Results;
import com.leyou.service.CategoryService;
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
