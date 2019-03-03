package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author zhangwei
 * @date 2019/1/27 11:13
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class LyGoodsPage {
    public static void main(String[] args) {
        SpringApplication.run(LyGoodsPage.class);
    }
}
