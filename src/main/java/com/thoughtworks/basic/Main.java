package com.thoughtworks.basic;

public class Main {
    public static void main(String[] args) {
        ClassNumber  classNumber=new ClassNumber(6);
        Student student=new Student("luna",21,classNumber);
        student.introduce();
        //Person person = new Person("luna",21);
        //person.introduce();


    }
}
