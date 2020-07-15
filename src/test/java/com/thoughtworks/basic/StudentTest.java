package com.thoughtworks.basic;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class StudentTest {
    @Test
    public void should_return_introduce_when_given_luna_21() {
        //given
        List<Student> students = new ArrayList<>();
        Teacher teacher = new Teacher ("luna",21);
        Klass klass = new Klass(1,students,teacher);
        Student student = new Student ("lulu",13);
        //when
        student.setKlass(klass);
        klass.addStudent(student);
        String result = student.introduce();
        //then
        assertEquals(result,"My name is lulu,I am 13years old. I am a Student of Class 1");
    }

}
