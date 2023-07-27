package com.mathvieira.entity;

import com.mathvieira.core.DoubleKnot;

public class DoublyLinkedList<T> {
    private DoubleKnot<T> firstNo;
    private DoubleKnot<T> lastNo;

    private int sizeList = 0;

    public int size() {
        return sizeList;
    }

    private DoubleKnot<T> getNo(int index) {
        DoubleKnot<T> noAssistant = firstNo;

        for(int i = 0; (i < index) && (noAssistant != null); i++) {
            noAssistant = noAssistant.getNextNo();
        }

        return noAssistant;
    }

    public T get(int index) {
        return getNo(index).getContent();
    }

    public void add(T content) {
        DoubleKnot<T> newNo = new DoubleKnot<T>(content);

        newNo.setNextNo(null);
        newNo.setPreviewNo(lastNo);

        if(firstNo == null) {
            firstNo = newNo;
        }

        if(lastNo != null) {
            lastNo.setNextNo(newNo);
        }

        lastNo = newNo;
        sizeList++;
    }

    public void add(int index, T content) {
        DoubleKnot<T> noAssistant = getNo(index);

        DoubleKnot newNo = new DoubleKnot<T>(content);

        newNo.setNextNo(noAssistant);

        if(newNo.getNextNo() != null) {
            newNo.setPreviewNo(noAssistant.getPreviewNo());
            newNo.getNextNo().setPreviewNo(newNo);
        } else {
            newNo.setPreviewNo(lastNo);
            lastNo = newNo;
        }

        if(index == 0) {
            firstNo = newNo;
        } else {
            newNo.getPreviewNo().setNextNo(newNo);
        }

        sizeList++;
    }

    public void remove(int index) {
        if(index == 0) {
            firstNo = firstNo.getNextNo();

            if(firstNo != null) {
                firstNo.setPreviewNo(null);
            }
        } else {
            DoubleKnot<T> noAssistant = getNo(index);

            noAssistant.getPreviewNo().setNextNo(noAssistant.getNextNo());

            if(noAssistant != lastNo) {
                noAssistant.getNextNo().setPreviewNo(noAssistant.getPreviewNo());
            } else {
                lastNo = noAssistant;
            }
        }

        sizeList--;
    }

    @Override
    public String toString() {
        String returnString = "";
        DoubleKnot<T> noAssistant = firstNo;

        for(int i = 0; i < size(); i++) {
            returnString += "[No {conteúdo = " + noAssistant.getContent() + "}]---> ";
        }

        returnString += "null";
        return returnString;
    }
}
