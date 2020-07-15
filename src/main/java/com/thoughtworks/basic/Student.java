package com.thoughtworks.basic;

public class Student extends Person{
    private  Klass klass;
    public Student(String name,int age,Klass klass){
        super(name,age);
        this.klass=klass;
    }
    @Override
    public void  introduce(){
        System.out.println("My name is "+getName()+",I am "+getAge()+"years old. I am a Student of Class "+klass.getClassNumber());
    }
}
