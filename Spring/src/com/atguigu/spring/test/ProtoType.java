package com.atguigu.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProtoType {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        // ��ȡmonster[ͨ��id��ȡmonster]
        Object bean = applicationContext.getBean("id01");
        System.out.println("bean" + bean); // ��� "ţħ��" .....

        Object bean2 = applicationContext.getBean("id01");

        System.out.println("bean2" + bean2); //��� "ţħ��" .....

        System.out.println(bean == bean2); // false

        // ConfigurableApplicationContext
    }

}
