package com;

import com.ycy.model.UserAccount;
import com.ycy.service.Userservice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2015/8/13 0013.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/applicationContext.xml","classpath*:spring/spring-mybatis.xml"})
public class TestMybatis {
 @Autowired
 private  Userservice userservice;
    @Test
    public  void  test1(){
       UserAccount u= userservice.getUserAccountById(1l);
        System.out.println(u.getName());
    }

}
