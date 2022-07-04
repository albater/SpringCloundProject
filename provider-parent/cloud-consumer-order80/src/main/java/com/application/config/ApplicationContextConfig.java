package com.application.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author alpha
 * @className: ApplicationContextConfig
 * @date 2022/7/4 14:34
 * @Description
 */

@SpringBootConfiguration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced//添加ribbon负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
