package entitties;

import core.No;

public class Stack {
    private No noIn;

    public Stack() {
        this.noIn = null;
    }

    public boolean isEmpty() {
        return noIn == null ? true : false;
    }

    public No top() {
        return noIn;
    }

    public void push(No newData) {
        No refAssistant = noIn;
        noIn = newData;
        noIn.setRefNo(refAssistant);
    }

    public No pop() {
        if(!isEmpty()) {
            No noPoped = noIn;
            noIn = noIn.getRefNo();
            return noPoped;
        }

        return null;
    }

    @Override
    public String toString() {
        String stringReturn = "\n// ------------ //\n";
        stringReturn += "Pilha\n";

        No noAssistant = noIn;

        while(true) {
            if(noAssistant != null) {
                stringReturn += "[No {dado: " + noAssistant.getData() + "}]\n";

                noAssistant = noAssistant.getRefNo();
            } else {
                break;
            }
        }

        return stringReturn;
    }
}
