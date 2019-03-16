package com.gupao.study.factorypattern.abstractfactory;

public class JavaCourseFactory implements CourseFactory {
    public INote createNote() {
        return new JavaNote();
    }

    public IVideo createVideo() {
        return new JavaVideo();
    }
}
