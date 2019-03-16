package com.gupao.study.factorypattern;

public class FactoryMethodTest {
    public static void main(String[] args) {
        PythonCourseFactory pythonCourseFactory = new PythonCourseFactory();
        pythonCourseFactory.create().record();

        JavaCourseFactory javaCourseFactory = new JavaCourseFactory();
        ICourse course = javaCourseFactory.create();
        course.record();
    }
}
