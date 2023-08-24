package com.math.entities;

import com.math.core.Content;

public class Course extends Content {
    private int workload;

    @Override
    public double calculateXp() {
        return STANDARD_XP * workload;
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    @Override
    public String toString() {
        return "Course [" +
                "título='" + getTitle() + '\'' +
                ", descrição='" + getDescription() + '\'' +
                ", carga horária=" + workload +
                '}';
    }
}
