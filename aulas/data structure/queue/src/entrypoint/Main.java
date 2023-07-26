package entrypoint;

import entities.Queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();

        System.out.println();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println(queue);

        System.out.println("Saiu da fila: " + queue.dequeue());

        System.out.println(queue);

        System.out.println("O primeiro da fila é: " + queue.first());

        System.out.println();
    }
}
