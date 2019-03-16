package com.gupao.study.factorypattern.abstractfactory;

public interface CourseFactory {
    INote createNote();
    IVideo createVideo();
}
