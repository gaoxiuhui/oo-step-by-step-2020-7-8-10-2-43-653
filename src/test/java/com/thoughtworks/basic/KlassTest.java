package com.thoughtworks.basic;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class KlassTest {
    @Test
    public void should_add_students_when_add_new_students() {
        //given
        List<Student> students = new ArrayList<>();
        Teacher teacher = new Teacher("lulu",21);
        Student student = new Student ("nana",22);
        Klass klass = new Klass(1,students,teacher);
        //when
        klass.addStudent(student);
        //then
        Assert.assertNotEquals(students.size(),0);
    }
}
