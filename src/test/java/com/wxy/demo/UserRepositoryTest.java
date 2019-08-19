package com.wxy.demo;

import com.wxy.demo.dao.UserRepository;
import com.wxy.demo.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Author wxy
 * @Date 19-8-19 上午10:03
 * @Description TODO
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void saveUser(){
        User user = new User();
        user.setUserName("zhangsan");
        user.setHomeAddress("七天连锁酒店");
        user.setHomeTel(100000l);
        User save = userRepository.save(user);
        log.info("保存用户：user = {}",save);
    }

    @Test
    public void findList(){
        List<User> list = userRepository.findAll();
        log.info("查询用户列表：list = {}",list);
    }
}
