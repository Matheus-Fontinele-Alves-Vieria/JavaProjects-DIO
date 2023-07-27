package com.mathvieira.core;

public class No<T> {
    private T content; 
    private No nextNo;

    public No() {
        this.nextNo = null;
    }

    public No(T content) {
        this.content = content;
        this.nextNo = null;
    }

    public No(T content, No nextNo) {
        this.content = content;
        this.nextNo = nextNo;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public No getNextNo() {
        return nextNo;
    }

    public void setNextNo(No nextNo) {
        this.nextNo = nextNo;
    }

    @Override
    public String toString() {
        return "No{" + content + '}';
    }
}
