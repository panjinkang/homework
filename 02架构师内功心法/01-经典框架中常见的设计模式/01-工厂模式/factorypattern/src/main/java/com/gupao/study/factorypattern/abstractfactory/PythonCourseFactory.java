package com.gupao.study.factorypattern.abstractfactory;

import jdk.nashorn.internal.ir.ReturnNode;

public class PythonCourseFactory implements CourseFactory {
    public INote createNote() {
        return new PythonNote();
    }

    public IVideo createVideo() {
        return new PythonVideo();
    }
}
