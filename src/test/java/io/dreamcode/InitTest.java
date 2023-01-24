package io.dreamcode;

import io.dreamcode.mapper.ArticlesMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class InitTest {
    @Autowired
    private ArticlesMapper mapper;

    @Test
    public void initTest() {
        System.out.println(mapper.getAll());
    }
}
