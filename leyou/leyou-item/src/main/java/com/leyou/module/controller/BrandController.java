package com.leyou.module.controller;

import com.leyou.module.service.BrandService;
import com.leyou.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author Robert
 * @Create 2020/6/18
 * @Desc TODO
 **/
@RestController
@RequestMapping("/brand")
public class BrandController {

    @Autowired
    private BrandService brandService;

    @GetMapping("/page")
    public Result findBrandList(
            @RequestParam(required = true) Integer page,
            @RequestParam(required = true) Integer size,
            @RequestParam(required = false) String sortBy,
            @RequestParam(required = false) Boolean desc,
            @RequestParam(required = false) String search
    ) {
        return brandService.findBrandList(page, size, sortBy, desc, search);
    }

    @PostMapping()
    public Result save(
            @RequestParam(required = true) String name,
            @RequestParam(required = true) String letter,
            @RequestParam(required = false) String image,
            @RequestParam(required = true) String categoryId
    ){
        return brandService.save(name, letter, image, categoryId);
    }
}
