package com.momo.test;

import com.momo.action.PersonAction;
import com.momo.dao.UserDao;
import org.junit.Test;
import org.springframework.boot.ApplicationArguments;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.invoke.CallSite;

public class SpringTest {
    @Test
    public void test1() {
       //初始化Spring容器，加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserDao userDaoImpl = (UserDao) applicationContext.getBean(com.momo.daoImpl.UserDaoImpl.class);

        userDaoImpl.save();
    }

    @Test
    public void test4() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonAction personAction = (PersonAction) applicationContext.getBean("personAction");
        personAction.add();
    }
}
