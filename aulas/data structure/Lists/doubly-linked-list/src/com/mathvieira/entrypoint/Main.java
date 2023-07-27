package com.mathvieira.entrypoint;

import com.mathvieira.entity.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<>();

        doublyLinkedList.add("1");
        doublyLinkedList.add(1, "2");
        
        System.out.println();

        System.out.println(doublyLinkedList);

        //doublyLinkedList.remove(3);
        //doublyLinkedList.add(3, "7");

        //System.out.println();

        //System.out.println(doublyLinkedList);
        System.out.println(doublyLinkedList.get(1));

        System.out.println();
    }
}
