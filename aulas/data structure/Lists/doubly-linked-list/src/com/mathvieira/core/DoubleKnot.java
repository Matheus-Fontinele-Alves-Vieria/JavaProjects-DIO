package com.mathvieira.core;

public class DoubleKnot<T> {
    private T content;
    private DoubleKnot<T> nextNo;
    private DoubleKnot<T> previewNo;

    public DoubleKnot(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public DoubleKnot<T> getNextNo() {
        return nextNo;
    }

    public void setNextNo(DoubleKnot nextNo) {
        this.nextNo = nextNo;
    }

    public DoubleKnot getPreviewNo() {
        return previewNo;
    }

    public void setPreviewNo(DoubleKnot previewNo) {
        this.previewNo = previewNo;
    }

    @Override
    public String toString() {
        return "NoDuplo{" +
               "conteúdo = " + content +
               '}';
    }
}
