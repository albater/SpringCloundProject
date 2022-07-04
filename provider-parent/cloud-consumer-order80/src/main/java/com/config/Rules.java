package com.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author alpha
 * @className: Rules
 * @date 2022/7/4 15:43
 * @Description
 */
@Configuration
public class Rules {
    @Bean
    public IRule getRule(){
        return new RandomRule();
    }
}
