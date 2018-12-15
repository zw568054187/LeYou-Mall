package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author zhangwei
 * @date 2018/12/13 21:04
 */

@SpringCloudApplication
@EnableZuulProxy
public class LyApiGateway {
    public static void main(String[] args) {
        SpringApplication.run(LyApiGateway.class);
    }
}
