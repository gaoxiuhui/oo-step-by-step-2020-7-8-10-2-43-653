package com.thoughtworks.basic;

public class Student {
    private String name;
    private int age;
    private  ClassNumber classNumber;
    public Student(String name,int age,ClassNumber classNumber){
        this.name=name;
        this.age=age;
        this.classNumber=classNumber;
    }
    public void  introduce(){
        System.out.println("My name is "+name+",I am "+age+"years old. I am a Student of Class "+classNumber.getKlass());
    }
}
