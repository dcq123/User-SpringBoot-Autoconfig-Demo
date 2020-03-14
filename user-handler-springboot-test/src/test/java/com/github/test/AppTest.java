package com.github.test;

import cn.github.qing.handler.UserHandler;
import cn.github.qing.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest {
    @Autowired
    UserHandler userHandler;

    @Test
    public void testStarter() {
        // 调用扣减方法
        User user = userHandler.deduction(10);
        System.out.println(user);
    }
}
