package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;



public class Test {

    public static void main(String[] args) {
        

    AbstractApplicationContext context =  new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");


    // Using XML
    Samosa samosa1 = (Samosa) context.getBean("samaso1");
    System.out.println(" samosa price "+ samosa1);
    //registing Shutdown Hook
    context.registerShutdownHook();
    
    System.out.println("+++++++++++++++++++++++++++++++++");
    // Using interface
    Pepsi pepsi = (Pepsi) context.getBean("pepsi1");
    System.out.println(" Pepsi price "+ pepsi);

    System.out.println("+++===================++");

    //Using Annotation
    Example example = (Example) context.getBean("example1");
    System.out.println("  Example "+ example);



    



    }


    
}
