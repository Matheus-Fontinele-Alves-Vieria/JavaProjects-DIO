package entrypoint;

import core.No;
import entitties.Stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(new No(1));
        stack.push(new No(2));
        stack.push(new No(3));
        stack.push(new No(4));
        stack.push(new No(5));

        System.out.println(stack);

        System.out.println(stack.pop());

        System.out.println(stack);
    }
}
