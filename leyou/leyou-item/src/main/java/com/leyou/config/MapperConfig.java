package com.leyou.config;

import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Author Robert
 * @Create 2020/6/18
 * @Desc TODO
 **/
@Configuration
@MapperScan(basePackages = "com.leyou.module.mapper")
public class MapperConfig {
}
