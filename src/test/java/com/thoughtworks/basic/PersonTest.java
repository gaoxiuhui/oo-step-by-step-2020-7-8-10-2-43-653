package com.thoughtworks.basic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    @Test
    public void should_return_introduce_when_given_luna_21() {
        //given
        Person person = new Person("luna",21);
        //when
        String result = person.introduce();
        //then
        assertEquals(result,"My name is luna,I am 21years old.");
    }
}
