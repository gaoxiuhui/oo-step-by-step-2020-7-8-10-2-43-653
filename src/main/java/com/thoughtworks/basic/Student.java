package com.thoughtworks.basic;

import java.util.List;

public class Student extends Person{
    private  Klass klass;
    public Student(String name,int age){
        super(name,age);
    }
    public Student(String name,int age,Klass klass){
        super(name,age);
        this.klass=klass;
    }
    public Student(String name, int age, List<String> messages, Klass klass) {
        super( name,age, messages);
        this.klass = klass;
    }
    @Override
    public String  introduce(){
        return"My name is "+getName()+",I am "+getAge()+"years old. I am a Student of Class "+klass.getClassNumber();
    }

    public Klass getKlass() {
        return klass;
    }
    public void setKlass(Klass klass) {
        this.klass = klass;
    }
    public void changeName(String name){
        setName(name);
        sendMessageChangeName();
    }
    public void changeKlass(Klass klass){
        sendMessageChangeName();
        getKlass().deleteStudent(new Student(getName(),getAge()));
        setKlass(klass);
        sendMessageChangeName();
    }
    public void sendMessageChangeName(){
        klass.getTeacher().addMessage(introduce());
        for ( Student student : klass.getStudents()){
            if (student.getAge() != getAge()
                    && student.getName().equals(getName()) ){
                addMessage(introduce());}
        }
    }



}
