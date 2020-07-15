package com.thoughtworks.basic;

public class Teacher extends Person {
    private  String  job;
    public Teacher(String name,int age,String job){
        super(name,age);
        this.job=job;
    }
    @Override
    public void  introduce(){
        System.out.println("My name is "+getName()+",I am "+getAge()+"years old. I am a  "+job);
    }
}
