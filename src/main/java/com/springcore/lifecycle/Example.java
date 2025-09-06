package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {

    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Example() {
    }
    


    @Override
    public String toString() {
        return "Example [subject=" + subject + "]";
    }

    
    @PostConstruct    
    public void init(){
        System.out.println("Inside in Example class for init method");
    }

    @PreDestroy
    public void destory(){
        System.out.println("Inside in Example for destory method");
    }




    
    
}
