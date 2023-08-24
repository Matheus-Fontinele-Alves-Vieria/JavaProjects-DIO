package com.math.entities;

import java.util.Set;
import java.util.LinkedHashSet;

import com.math.core.Bootcamp;
import com.math.core.Content;

public class Student {
    private String name;
    private Set<Content> subscribeContents; 
    private Set<Content> completedContents; 

    public Student(String name) {
        this.name = name;
        subscribeContents = new LinkedHashSet<>();
        completedContents = new LinkedHashSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getSubscribeContents() {
        return subscribeContents;
    }

    public void setSubscribeContents(Set<Content> subscribeContents) {
        this.subscribeContents = subscribeContents;
    }

    public void subscribeToBootcamp(Bootcamp bootcamp){
        this.subscribeContents.addAll(bootcamp.getContents());
        bootcamp.getStudents().add(this);
    }

    public void unsubscribeFromContent(Content content) {
        subscribeContents.remove(content);
    }

    public Set<Content> getCompletedContents() {
        return completedContents;
    }

    public void setCompletedContents(Set<Content> completedContents) {
        this.completedContents = completedContents;
    }

    public void completeContent(Content content) {
        completedContents.add(content);
    }

    public void progress() {
        this.subscribeContents.stream()
            .findFirst()
            .ifPresentOrElse(content -> {
                this.completedContents.add(content);
                this.subscribeContents.remove(content);
            }, () -> System.err.println("Não existe conteúdo inscrito!"));
    }

    public double calculateTotalXP() {
        return this.completedContents.stream()
            .mapToDouble(Content::calculateXp)
            .sum();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((subscribeContents == null) ? 0 : subscribeContents.hashCode());
        result = prime * result + ((completedContents == null) ? 0 : completedContents.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (subscribeContents == null) {
            if (other.subscribeContents != null)
                return false;
        } else if (!subscribeContents.equals(other.subscribeContents))
            return false;
        if (completedContents == null) {
            if (other.completedContents != null)
                return false;
        } else if (!completedContents.equals(other.completedContents))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Estudante {" +
                "nome='" + getName() + '\'' +
                '}';
    }
}
