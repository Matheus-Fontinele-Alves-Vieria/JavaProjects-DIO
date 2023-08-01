package com.math.entrypoint;

import java.util.Arrays;
import java.util.List;

import com.math.entity.Temperature;

public class Main {
    public static void main(String[] args) {
        List<Double> temperatures = Arrays.asList(30.0, 32.0, 28.0, 25.0, 29.0, 31.0);
        Temperature temperature = new Temperature(temperatures);

        System.out.println();

        System.out.println("Todas as temperaturas:");
        System.out.println(temperature);

        System.out.println();

        System.out.println("Média das temperaturas:");
        System.out.printf("%.1f\n", temperature.averageTemperature());

        System.out.println();

        System.out.println("Meses com temperaturas acima da média:");
        temperature.monthsAboveAverage();     
        
        System.out.println();
    }
}
