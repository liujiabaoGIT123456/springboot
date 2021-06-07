package com.kafaka.yuqing.controller;



import com.kafaka.yuqing.dto.Test;
import com.kafaka.yuqing.service.TestService;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class TestDBController {
    private final TestService testDBDao;
//    @Autowired
//    private RedisTemplate<String,String> redisTemplate;

    public TestDBController(TestService testDBDao) {
        this.testDBDao = testDBDao;
    }
    private final static Logger logger = LoggerFactory.getLogger(TestDBController.class);


    //连接数据库测试
    @RequestMapping("/test")
    public String test() {

        List<Test> test = testDBDao.test();
//        Test test1 = new Test();
//        test1.setId("12312412");
//        testDBDao.insert(test1);
        System.out.println(test);
        logger.info("test++++++++++");
        return "刘佳宝爱张祝";
    }

//    //kafka测试
//    public static void main(String[] args) {
//        logger.info("test++++++++++");
//        YuqingKfInitInfo yuqingKfInitInfo=new YuqingKfInitInfo();
//        yuqingKfInitInfo.setUser("SDK1");
//        yuqingKfInitInfo.setPasswrod("111111");
//        yuqingKfInitInfo.setEnv("test");
//        YuqingKafkaHandlerMessage yuqingKafkaHandlerMessage=(a)->{
//            //获取所有数据
//            System.out.println(JSONUtil.parse(a).toString());
//        };
//        YuqingKafkaService.initService(yuqingKafkaHandlerMessage,yuqingKfInitInfo);
//
//    }
//
//    //redis测试
//    @RequestMapping("/redis")
//    public String redisTest(){
//        redisTemplate.opsForValue().set("test","redis测试成功");
//        return redisTemplate.opsForValue().get("test");
//    }


}
