package com.thoughtworks.basic;

import java.util.List;

public class Person {
    private String name;
    private int age;
    private List<String> messages;


    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public Person(String name,int age, List<String> messages) {
        this.age = age;
        this.name = name;
        this.messages = messages;
    }
    public String  introduce(){
        return "My name is "+name+",I am "+age+"years old.";
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public List<String> getMessages() {
        return messages;
    }
    public void setMessages(List<String> messages) {
        this.messages = messages;
    }
    public void addMessage(String message){
        messages.add(message);
    }
}
