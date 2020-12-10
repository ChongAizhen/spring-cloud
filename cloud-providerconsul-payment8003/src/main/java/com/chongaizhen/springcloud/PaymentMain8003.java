package com.chongaizhen.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @auther zzyy
 * @create 2020-02-19 16:05
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8003
{
    public static void main(String[] args) {
            SpringApplication.run(PaymentMain8003.class, args);
    }
}
