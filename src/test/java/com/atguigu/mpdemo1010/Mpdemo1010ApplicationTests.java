package com.atguigu.mpdemo1010;

import com.atguigu.mpdemo1010.bean.User;
import com.atguigu.mpdemo1010.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Mpdemo1010ApplicationTests {
    @Autowired
    private UserMapper userMapper;
    //查询User表中所有的数据
    @Test
    void findAll() {
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }

}
