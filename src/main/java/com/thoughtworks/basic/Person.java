package com.thoughtworks.basic;

public class Person {
    private String name;
    private int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void  introduce(){
        System.out.println("My name is "+name+",I am "+age+"years old");
    }
}
