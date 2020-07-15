package com.thoughtworks.basic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TeacherTest {
    @Test
    public void should_return_introduce_when_given_luna_21() {
        //given
        Teacher teacher = new Teacher ("luna",21,"Teacher");
        //when
        String result = teacher.introduce();
        //then
        assertEquals(result,"My name is luna,I am 21years old. I am a  Teacher");
    }

}
