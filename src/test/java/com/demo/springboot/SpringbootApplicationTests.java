package com.demo.springboot;

import com.demo.springboot.controller.HelloController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {

    @Test
    public void contextLoads() {
        assert ("hello Bass!1"== new HelloController().helloBass());
    }
}
