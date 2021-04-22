package com.kafaka.yuqing.controller;


import cn.hutool.json.JSONUtil;
import com.kafaka.yuqing.dto.Test;
import com.kafaka.yuqing.service.TestService;

import com.yuqing.kafka.client.config.YuqingKfInitInfo;
import com.yuqing.kafka.client.dto.YuqingKafkaDTO;
import com.yuqing.kafka.client.interfaces.YuqingKafkaHandlerMessage;
import com.yuqing.kafka.client.service.YuqingKafkaService;
import lombok.extern.log4j.Log4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class TestDBController {
    private final TestService testDBDao;

    public TestDBController(TestService testDBDao) {
        this.testDBDao = testDBDao;
    }
    private final static Logger logger = LoggerFactory.getLogger(TestDBController.class);


    //连接数据库测试
    @RequestMapping("/test")
    public List<Test> test() {

        List<Test> test = testDBDao.test();
        Test test1 = new Test();
        test1.setId("12312412");
        testDBDao.insert(test1);
        System.out.println(test);
        logger.info("test++++++++++");
        return testDBDao.test();
    }

    public static void main(String[] args) {
        logger.info("test++++++++++");
        YuqingKfInitInfo yuqingKfInitInfo=new YuqingKfInitInfo();
        yuqingKfInitInfo.setUser("SDK1");
        yuqingKfInitInfo.setPasswrod("111111");
        yuqingKfInitInfo.setEnv("test");
        YuqingKafkaHandlerMessage yuqingKafkaHandlerMessage=(a)->{
            //获取所有数据
            System.out.println(JSONUtil.parse(a).toString());
        };
        YuqingKafkaService.initService(yuqingKafkaHandlerMessage,yuqingKfInitInfo);

    }


}
