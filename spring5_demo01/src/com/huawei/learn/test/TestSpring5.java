package com.huawei.learn.test;

import com.huawei.learn.Book;
import com.huawei.learn.Order;
import com.huawei.learn.User;
import com.huawei.learn.bean.Dept;
import com.huawei.learn.bean.Emp;
import com.huawei.learn.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestSpring5 {


    @Test
    public void testAdd(){
        BeanFactory context =
                new ClassPathXmlApplicationContext("bean01.xml");

        User user = context.getBean("user", User.class);

        System.out.println("user = " + user);

        user.add();
    }

    @Test
    public void testBook(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean01.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
    }

    @Test
    public void testOrder(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean01.xml");
        Order order = context.getBean("order", Order.class);
        System.out.println(order);
    }

    @Test
    public void testBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean02.xml");
        UserService service = context.getBean("userService", UserService.class);
        service.add();
    }

    @Test
    public void testBean1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean03.xml");
        Dept dept = context.getBean("dept", Dept.class);
        System.out.println("dept = " + dept);
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println("emp = " + emp);


    }
}
