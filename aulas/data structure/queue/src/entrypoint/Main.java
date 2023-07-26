package entrypoint;

import core.No;
import entities.Queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();

        System.out.println();

        queue.enqueue(new No(1));
        queue.enqueue(new No(2));
        queue.enqueue(new No(3));
        queue.enqueue(new No(4));
        queue.enqueue(new No(5));

        System.out.println(queue);

        System.out.println("Saiu da fila: " + queue.dequeue());

        System.out.println(queue);

        System.out.println("O primeiro da fila é: " + queue.first());

        System.out.println();
    }
}
