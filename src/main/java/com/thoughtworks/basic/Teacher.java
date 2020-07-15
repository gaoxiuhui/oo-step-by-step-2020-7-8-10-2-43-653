package com.thoughtworks.basic;
import java.util.List;

public class Teacher extends Person {
    private  String  job;
    public Teacher(String name,int age){
        super(name,age);
    }
    public Teacher(String name,int age,String job){
        super(name,age);
        this.job=job;
    }
    public Teacher(String name, int age, List<String> messages) {
        super(name,age,messages);
    }
    @Override
    public String introduce(){
        return"My name is "+getName()+",I am "+getAge()+"years old. I am a  "+job;
    }
}
