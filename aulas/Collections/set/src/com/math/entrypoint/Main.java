package com.math.entrypoint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.math.entity.Rainbow;

public class Main {
    public static void main(String[] args) {

        System.out.println();
    
        System.out.println("Criando um conjunto de cores do arco-íris...");
        Set<Rainbow> colorsRainbow = new HashSet<>(){{
            add(new Rainbow("Violeta"));
            add(new Rainbow("Azul"));
            add(new Rainbow("Verde"));
            add(new Rainbow("Amarelo"));
            add(new Rainbow("Laranja"));
            add(new Rainbow("Vermelho"));
        }};
        
        System.out.println("Exibindo todas as cores do arco-íris:");
        colorsRainbow.forEach(color -> {
            System.out.println("\t" + color);
        });

        System.out.println();

        System.out.println("A quantidade de cores que o arco-íris tem: " + colorsRainbow.size());

        System.out.println();

        System.out.println("Exibindo as cores do arco-íris em ordem alfabética:");
        Set<Rainbow> colorsRainbow2 = new TreeSet<>(colorsRainbow);
        colorsRainbow2.forEach(color2 -> {
            System.out.println("\t" + color2);
        });

        System.out.println();

        System.out.println("Exibindo as cores na ordem inversa da que foi informada:");
        Set<Rainbow> colorsRainbow3 = new LinkedHashSet<>() {{
            add(new Rainbow("Violeta"));
            add(new Rainbow("Azul"));
            add(new Rainbow("Verde"));
            add(new Rainbow("Amarelo"));
            add(new Rainbow("Laranja"));
            add(new Rainbow("Vermelho"));
        }};
        System.out.println("Antes: " + colorsRainbow3);
        List<Rainbow> colorsRainbowList = new ArrayList<>(colorsRainbow3);
        Collections.reverse(colorsRainbowList);
        System.out.println("Depois: " + colorsRainbowList);

        System.out.println();

        System.out.println("Exibindo todas as cores que começam com a letra ”v”:");
        // for(Rainbow color : colorsRainbow) {
        //     if(color.startsWith("V")) {
        //         System.out.println(color);
        //     }
        // }
        
        colorsRainbow.forEach(color -> {
            if(color.startsWith("V")) 
                System.out.printf("\t%s\n", color);
        });

        System.out.println();

        System.out.println("Removendo todas as cores que não começam com a letra “v”...");
        Iterator<Rainbow> iterator = colorsRainbow.iterator();

        while(iterator.hasNext()) {
            if(!iterator.next().startsWith("V")) 
                iterator.remove();
        }

        System.out.println();

        System.out.println("Exibindo todas as cores do arco-íris:");
        System.out.println("\t" + colorsRainbow);

        System.out.println();

        System.out.println("Limpando o conjunto...");
        colorsRainbow.clear();

        System.out.println();

        String messageIsEmpty = "";

        if(colorsRainbow.isEmpty()) {
            messageIsEmpty = "O conjunto está vazio";
        } else {
            messageIsEmpty = "O conjunto não está vazio";
        }

        System.out.println("Confirindo se o conjunto está vazio: " + messageIsEmpty);

        System.out.println();
    }
}
