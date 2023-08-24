package com.math.core;

import com.math.entities.Student;
import com.math.entities.Instructor;

public interface IBootcamp {
    void addStudent(Student student);
    void removeStudent(Student student);
    
    void addInstructor(Instructor instructor);
    void removeInstructor(Instructor instructor);

    void addContent(Content content);
    void removeContent(Content content);
}
