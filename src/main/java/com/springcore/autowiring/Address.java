package com.springcore.autowiring;

public class Address {

 private String street;
 private String bus;
 public String getStreet() {
    return street;
 }
 public void setStreet(String street) {
    this.street = street;
 }
 public String getBus() {
    return bus;
 }
 public void setBus(String bus) {
    this.bus = bus;
 }
 @Override
 public String toString() {
    return "Address [street=" + street + ", bus=" + bus + "]";
 }

 


 

}
