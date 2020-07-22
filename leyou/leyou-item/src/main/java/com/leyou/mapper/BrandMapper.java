package com.leyou.mapper;

import com.leyou.pojo.Brand;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @Author Robert
 * @Create 2020/6/18
 * @Desc TODO
 **/
public interface BrandMapper extends Mapper<Brand> {
    List<Brand> findBrandList(@Param("sortBy") String sortBy, @Param("isDesc") String isDesc, @Param("search") String search);

    void save(@Param("categoryIds") String[] categoryIds, @Param("brandId") Long brandId);
}
