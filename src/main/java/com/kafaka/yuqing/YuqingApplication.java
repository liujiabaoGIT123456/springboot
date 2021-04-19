package com.kafaka.yuqing;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.kafaka.yuqing.dao")
public class YuqingApplication {
    public static void main(String[] args) {
        SpringApplication.run(YuqingApplication.class, args);
    }



}
