package com.thoughtworks.basic;

public class Student extends Person{
    private  ClassNumber classNumber;
    public Student(String name,int age,ClassNumber classNumber){
        super(name,age);
        this.classNumber=classNumber;
    }
    public void  introduce(){
        System.out.println("My name is "+getName()+",I am "+getAge()+"years old. I am a Student of Class "+classNumber.getKlass());
    }
}
