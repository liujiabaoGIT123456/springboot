package com.kafaka.yuqing.service;


import com.kafaka.yuqing.dao.TestDao;
import com.kafaka.yuqing.dto.Test;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class TestService {
    private  final TestDao testDao;

    public TestService(TestDao testDao) {
        this.testDao = testDao;
    }

    public List<Test> test() {
        return testDao.test();
    }

    public List<Test> testPlus() {
        List<Test> tests = testDao.selectList(null);
        return tests;
    }

    public void insert(Test test) {
        testDao.insert(test);
    }
}
