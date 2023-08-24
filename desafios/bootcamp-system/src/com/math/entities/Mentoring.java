package com.math.entities;

import com.math.core.Content;

public class Mentoring extends Content {
    private String mentoringDate;

    @Override
    public double calculateXp() {
        return STANDARD_XP + 20d;
    }

    public String getMentoringDate() {
        return mentoringDate;
    }

    public void setMentoringDate(String mentoringDate) {
        this.mentoringDate = mentoringDate;
    }
    
    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitle() + '\'' +
                ", descricao='" + getDescription() + '\'' +
                ", data=" + mentoringDate +
                '}';
    }
}
