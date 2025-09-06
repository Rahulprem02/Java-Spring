package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {

    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Pepsi() {
    }

    @Override
    public String toString() {
        return "pepsi [price=" + price + "]";
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        // TODO Auto-generated method stub
        System.out.println("Inside init for interface");
        // new UnsupportedOperationException("Unimplemented method 'afterPropertiesSet'");
    }

    @Override
    public void destroy() throws Exception {
        // TODO Auto-generated method stub
                System.out.println("Inside destory for interface");

        //throw new UnsupportedOperationException("Unimplemented method 'destroy'");
    }

    
    
    
}
