package entities;

import core.No;

public class Queue {
    private No refNoIn;

    public Queue() {
        this.refNoIn = null;
    }

    public boolean isEmpty() {
        return refNoIn == null ? true : false;
    }

    public void enqueue(No newNo) {
        newNo.setRefNo(refNoIn);
        refNoIn = newNo;
    }

    public No first() {
        if(!isEmpty()) {
            No firstNo = refNoIn;

            while(true) {
                if(firstNo.getRefNo() != null) {
                    firstNo = firstNo.getRefNo();
                } else {
                    break;
                }
            }

            return firstNo;
        } else {
            return null;
        }
    }

    public No dequeue() {
        if(!isEmpty()) {
            No firsNo = refNoIn;
            No noAssistant = refNoIn;

            while(true) {
                if(firsNo.getRefNo() != null) {
                    noAssistant = firsNo;
                    firsNo = firsNo.getRefNo();
                } else {
                    noAssistant.setRefNo(null);
                    break;
                }
            }

            return firsNo;
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        String returnString = "";
        No noAssistant = refNoIn;

        if(refNoIn != null) {
            while(true) {
                returnString += "[No {objeto = " + noAssistant.getObject() + "}]---> ";
                if(noAssistant.getRefNo() != null) {
                    noAssistant = noAssistant.getRefNo();
                } else {
                    returnString += "null";
                    break;
                }
            }
        } else {
            returnString = "null";
        }

        return returnString;
    }
}
