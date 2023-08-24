package com.math.entities;

import java.util.Set;
import java.util.LinkedHashSet;

import com.math.core.Content;

public class Instructor {
    private String name;
    private Set<Content> contents; 

    public Instructor(String name) {
        this.name = name;
        contents = new LinkedHashSet<>();
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getContents() {
        return contents;
    }

    public void addContent(Content content) {
        contents.add(content);
    }

    public void removeContent(Content content) {
        contents.remove(content);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((contents == null) ? 0 : contents.hashCode());
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
        Instructor other = (Instructor) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (contents == null) {
            if (other.contents != null)
                return false;
        } else if (!contents.equals(other.contents))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Instrutor {" +
                "nome='" + getName() + '\'' +
                '}';
    }
}
