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

    public void enqueue(Object object) {
        No newNo = new No(object);

        newNo.setRefNo(refNoIn);
        refNoIn = newNo;
    }

    public Object first() {
        if(!isEmpty()) {
            No firstNo = refNoIn;

            while(true) {
                if(firstNo.getRefNo() != null) {
                    firstNo = firstNo.getRefNo();
                } else {
                    break;
                }
            }

            return firstNo.getObject();
        } else {
            return null;
        }
    }

    public Object dequeue() {
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

            return firsNo.getObject();
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
