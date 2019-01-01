package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author zhangwei
 * @date 2018/12/27 11:07
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class LySearchApplication {
    public static void main(String[] args) {
        SpringApplication.run(LySearchApplication.class);
    }
}
