package com.math.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
 * Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. 
 * As perguntas são:
 *  1. "Telefonou para a vítima?"
 *  2. "Esteve no local do crime?"
 *  3. "Mora perto da vítima?"
 *  4. "Devia para a vítima?"
 *  5. "Já trabalhou com a vítima?"
 * Se a pessoa responder positivamente a 2 questões ela deve ser classificada como 
 * "Suspeita", entre 3 e 4 como
 * "Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
*/

public class ListExercise {
    public static void main(String[] args) {
        List<String> answers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Perguntas: ");

        System.out.print("\nTelefonou para vítima? ");
        String answer = scanner.next();
        answers.add(answer.toLowerCase());

        System.out.print("Esteve no local do crime? ");
        answer = scanner.next();
        answers.add(answer.toLowerCase());

        System.out.print("Mora perto da vítima? ");
        answer = scanner.next();
        answers.add(answer.toLowerCase());

        System.out.print("Devia para vítima? ");
        answer = scanner.next();
        answers.add(answer.toLowerCase());

        System.out.print("Já trabalhou com a vítima? ");
        answer = scanner.next();
        answers.add(answer.toLowerCase());

        scanner.close();

        System.out.println(answers);

        // answers.forEach(ans -> {
        //     System.out.println("Percorrendo:");
        //     System.out.println("Resposta: " + ans);
        // });

        int count = 0;

        Iterator<String> iterator = answers.iterator();

        while(iterator.hasNext()) {
            String ans = iterator.next();

            if(ans.contains("sim")) {
                count++;
            }
        }

        switch(count) {
            case(2):
                System.out.println("Suspeita");
                break;

            case(3):
            case(4):
                System.out.println("Cúmplice");
                break;

            case(5):
                System.out.println("Assassina");
                break;

            default:
                System.out.println("Inocente");
        }
    }
}
