package com.leyou.module.mapper;

import com.leyou.module.pojo.Category;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @Author Robert
 * @Create 2020/6/18
 * @Desc TODO
 **/
public interface CategoryMapper extends Mapper<Category> {
    List<Category> findCategoryList(@Param("pid") Integer pid);
}
