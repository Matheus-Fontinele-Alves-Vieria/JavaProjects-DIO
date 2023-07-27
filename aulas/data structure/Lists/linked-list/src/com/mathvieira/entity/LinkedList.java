package com.mathvieira.entity;

import com.mathvieira.core.No;

public class LinkedList<T> {
    private No<T> refIn;
    
    public LinkedList() {
        this.refIn = null;
    }

    public No<T> getRefIn() {
        return refIn;
    }

    public void setRefIn(No<T> refIn) {
        this.refIn = refIn;
    }

    public boolean isEmpty() {
        return refIn == null ? true : false;
    }

    public int size() {
        int sizeList = 0;
        No<T> refAssistant = refIn;

        while(true) {
            if(refAssistant != null) {
                sizeList++;

                if(refAssistant.getNextNo() != null) {
                    refAssistant = refAssistant.getNextNo();
                } else {
                    break;
                }
            } else {
                break;
            }
        }

        return sizeList;
    }

    public void add(T content) {
        No<T> newNo = new No(content);

        if(this.isEmpty()) {
            refIn = newNo;
            return;
        }

        No<T> noAssistant = refIn;

        for(int i = 0; i < size() - 1; i++) {
            noAssistant = noAssistant.getNextNo();
        }

        noAssistant.setNextNo(newNo);
    }

    private void validateIndex(int index) {
        if(index >= size()) {
            int lastIndex = size() - 1;
            throw new IndexOutOfBoundsException("Não existe conteúdo no índice: " + index + 
                ". Esta lista só vai até o índice: " + lastIndex);
        }
    }

    private No<T> getNo(int index) {
        validateIndex(index);

        No<T> noAssistant = refIn;
        No<T> returnNo = null;

        for(int i = 0; i <= index; i++) {
            returnNo = noAssistant;
            noAssistant = noAssistant.getNextNo();
        }

        return returnNo;
    }

    public T get(int index) {
        return getNo(index).getContent();
    }

    public T remove(int index) {
        validateIndex(index);

        No<T> pivotNo = getNo(index);

        if(index == 0) {
            refIn = pivotNo.getNextNo();
            return pivotNo.getContent();
        }

        No<T> formerNo = getNo(index - 1);

        formerNo.setNextNo(pivotNo.getNextNo());

        return pivotNo.getContent();
    }

    @Override
    public String toString() {
        String retuString = ""; 
        No<T> noAssistant = refIn;

        for(int i = 0; i < size(); i ++) {
            retuString += "[No {conteúdo = " + noAssistant.getContent() +"}]---> ";
            noAssistant = noAssistant.getNextNo();
        }

        retuString += "null";

        return retuString;
    }
}
