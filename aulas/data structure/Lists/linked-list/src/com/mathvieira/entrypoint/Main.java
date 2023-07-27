package com.mathvieira.entrypoint;

import com.mathvieira.entity.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(7);
        linkedList.add(3);
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(6);

        /* 
        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.get(2));
        System.out.println(linkedList.get(3));
        System.out.println(linkedList.get(4));
        System.out.println(linkedList.get(5));
        */

        System.out.println();
        
        System.out.println(linkedList);

        linkedList.remove(3);

        System.out.println();

        System.out.println(linkedList);

        System.out.println();
    }
}
