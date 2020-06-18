package com.leyou.module.service.impl;

import com.leyou.module.mapper.BrandMapper;
import com.leyou.module.pojo.Brand;
import com.leyou.module.service.BrandService;
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
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandMapper brandMapper;

    @Override
    public Result findBrandList() {
        List<Brand> brands = brandMapper.selectAll();
        return Results.success(brands);
    }
}
