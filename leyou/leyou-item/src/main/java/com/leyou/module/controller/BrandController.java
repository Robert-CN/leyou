package com.leyou.module.controller;

import com.leyou.module.service.BrandService;
import com.leyou.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/list")
    public Result list(){
        return brandService.findBrandList();
    }
}
