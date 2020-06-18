package com.leyou.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * @Author Robert
 * @Create 2020/6/18
 * @Desc TODO
 **/
@Configuration
public class GlobalCorsConfig {

    @Bean
    public CorsFilter corsFilter(){
        // 1、添加 CORS 配置信息
        CorsConfiguration config = new CorsConfiguration();
        // ① 允许跨域的域名，推荐不要写 * ，否则无法携带 cookie
        config.addAllowedOrigin("http://manage.leyou.com");
        // ② 是否允许携带 cookie
        config.setAllowCredentials(true);
        // ③ 允许跨域请求的方式，可以写 * ，也可以写具体的请求方式
        config.addAllowedMethod("OPTIONS");
        config.addAllowedMethod("HEAD");
        config.addAllowedMethod("GET");
        config.addAllowedMethod("PUT");
        config.addAllowedMethod("POST");
        config.addAllowedMethod("DELETE");
        config.addAllowedMethod("PATCH");
        // ④ 允许跨域的请求头
        config.addAllowedHeader("*");
        // ⑤ 允许跨域的有效时长
        config.setMaxAge(3600l);
        // 2、添加映射路径
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**",config);
        // 3、返回 CORS 过滤器
        return new CorsFilter(source);
    }
}
