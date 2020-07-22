package com.leyou.service;

import com.leyou.result.Result;

/**
 * @Author Robert
 * @Create 2020/6/18
 * @Desc TODO
 **/
public interface BrandService {
    Result findBrandList(Integer page, Integer size, String sortBy, Boolean desc, String search);

    Result save(String name, String letter, String image, String categoryId);
}
