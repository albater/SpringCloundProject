package com.application;

import com.config.Rules;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author alpha
 * @className: OrderMain80
 * @date 2022/7/4 12:03
 * @Description
 */
/*
    name: 指定要调用的服务名
    configuration: 自定义负载均衡的规则
 */
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = Rules.class)
@EnableEurekaClient
@SpringBootApplication
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class,args);
    }
}




