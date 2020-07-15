package com.thoughtworks.basic;

public class Main {
    public static void main(String[] args) {
        Klass  klass=new Klass(6);
        Student student=new Student("luna",21,klass);
        System.out.println(student.introduce());
        Person person = new Person("luna",21);
        System.out.println(person.introduce());
        Teacher teacher=new Teacher("luna",21,"Teacher");
        System.out.println(teacher.introduce());
    }
}
