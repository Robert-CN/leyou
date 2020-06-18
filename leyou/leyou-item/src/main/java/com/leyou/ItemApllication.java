package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author Robert
 * @Create 2020/6/16
 * @Desc TODO
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class ItemApllication {
    public static void main(String[] args) {
        SpringApplication.run(ItemApllication.class);
    }
}
