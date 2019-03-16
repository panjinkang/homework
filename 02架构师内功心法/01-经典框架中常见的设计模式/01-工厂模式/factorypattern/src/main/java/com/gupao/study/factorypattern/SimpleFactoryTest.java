package com.gupao.study.factorypattern;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        SimpleCourseFactory courseFactory = new SimpleCourseFactory();
        //courseFactory.create("com.gupao.study.factorypattern.JavaCourse").record();
        courseFactory.create(JavaCourse.class).record();
    }
}
