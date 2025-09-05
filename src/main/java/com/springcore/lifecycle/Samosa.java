package com.springcore.lifecycle;

public class Samosa {

    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("Property Setting Price");
        this.price = price;
    }

    @Override
    public String toString() {
        return "samosa [price=" + price + "]";
    }

    public void init(){
        System.out.println("Inside in init method");
    }

    
    public void destory(){
        System.out.println("Inside in destory method");
    }

    

    
}
