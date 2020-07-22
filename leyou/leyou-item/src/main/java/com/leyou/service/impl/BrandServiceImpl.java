package com.leyou.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.leyou.mapper.BrandMapper;
import com.leyou.pojo.Brand;
import com.leyou.result.Result;
import com.leyou.result.Results;
import com.leyou.service.BrandService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

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
    public Result findBrandList(Integer page, Integer size, String sortBy, Boolean desc, String search) {
        PageHelper.startPage(page, size);
        String isDesc = null;
        if (StringUtils.isNotEmpty(sortBy)) {
            isDesc = (desc ? "DESC" : "ASC");
        }
        List<Brand> brands = brandMapper.findBrandList(sortBy, isDesc, search);
        PageInfo<Brand> info = new PageInfo<>(brands);
        return Results.success(info);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED)
    public Result save(String name, String letter, String image, String categoryId) {
        Brand brand = Brand.builder()
                .name(name)
                .letter(letter)
                .image(image)
                .build();
        brandMapper.insertSelective(brand);
        String[] categoryIds = categoryId.split(",");
        brandMapper.save(categoryIds, brand.getId());
        return Results.success();
    }
}
