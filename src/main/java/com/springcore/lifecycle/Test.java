package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;



public class Test {

    public static void main(String[] args) {
        

    AbstractApplicationContext context =  new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");

    Samosa samosa1 = (Samosa) context.getBean("samaso1");
    System.out.println(" samosa price "+ samosa1);


    //registing Shutdown Hook
    context.registerShutdownHook();
    }


    
}
