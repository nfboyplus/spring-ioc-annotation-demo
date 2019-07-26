package com.spring.ioc;

import com.spring.ioc.annotation.ExtClassPathXmlApplicationContext;
import com.spring.ioc.service.impl.UserServiceImpl;

/**
 * 自定义注解：@ExtResource @ExtService 实现 SpringIOC
 */
public class SpringIocAnnotationTest {

    public static void main(String[] args) throws Exception{
        ExtClassPathXmlApplicationContext applicationContext = new ExtClassPathXmlApplicationContext("com.spring.ioc.service");
        UserServiceImpl userService = (UserServiceImpl) applicationContext.getBean("userServiceImpl");
        userService.addUser();
        System.out.println(userService);
    }
}
