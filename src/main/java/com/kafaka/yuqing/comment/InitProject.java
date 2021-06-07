package com.kafaka.yuqing.comment;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.yml")
public class InitProject implements ApplicationRunner {
    //获取项目端口号
    @Value("${spring.datasource.url}")
    private String servePrort;
    @Value("${name}")
    private String name;

    private final static Logger logger = LoggerFactory.getLogger(InitProject.class);
    @Override
    public void run(ApplicationArguments args) throws Exception {

        logger.info("开始写入日志------------------------");
        System.out.println("启动项目成功:"+servePrort);
        logger.info("环境："+name);
        logger.info("项目初始化成功-----------------");

    }
}
