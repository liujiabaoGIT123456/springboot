package com.kafaka.yuqing.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kafaka.yuqing.dto.Test;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TestDao extends BaseMapper<Test> {
    @Select("select * from TEST")
    List<Test> test();
}
