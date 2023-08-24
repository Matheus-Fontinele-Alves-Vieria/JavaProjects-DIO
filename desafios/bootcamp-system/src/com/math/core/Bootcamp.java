package com.math.core;

import java.util.HashSet;
import java.util.Set;

import com.math.entities.Instructor;
import com.math.entities.Student;

public class Bootcamp implements IBootcamp {
    private String name;
    private String description;

    private Set<Student> students = new HashSet<>();
    private Set<Instructor> instructors = new HashSet<>();
    private Set<Content> contents = new HashSet<>();

    public Bootcamp(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public Set<Instructor> getInstructors() {
        return instructors;
    }

    public Set<Content> getContents() {
        return contents;
    }

    @Override
    public void addContent(Content content) {
        contents.add(content);
    }

    @Override
    public void addInstructor(Instructor instructor) {
        instructors.add(instructor);        
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);        
    }

    @Override
    public void removeContent(Content content) {
        contents.remove(content);
    }

    @Override
    public void removeInstructor(Instructor instructor) {
        instructors.remove(instructor);        
    }

    @Override
    public void removeStudent(Student student) {
        students.remove(student);           
    }

    public String getFormattedInstructors() {
        StringBuilder stringBuilder = new StringBuilder(
            "Instrutores do bootcamp " + getName() + ":\n");
        
        for(Instructor instructor : instructors) {
            stringBuilder.append("- ")
                .append(instructor)
                .append("\n");
        }

        return stringBuilder.toString();
    }

    public String getFormattedStudents() {
        StringBuilder stringBuilder = new StringBuilder("Estudantes do bootcamp " + name + ":\n");
        for (Student student : students) {
            stringBuilder.append("- ").append(student).append("\n");
        }
        return stringBuilder.toString();
    }
}
