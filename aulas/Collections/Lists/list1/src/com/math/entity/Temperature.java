package com.math.entity;

import java.util.Iterator;
import java.util.List;

import com.math.core.Interface.ITemperature;

public class Temperature implements ITemperature {
    private List<Double> temperatures;
    
    public Temperature(List<Double> temperatures) {
        this.temperatures = temperatures;
    }

    private double getTemperature(int index) {
        return temperatures.get(index);
    }

    @Override
    public double averageTemperature() {
        double sum = 0;

        for(Double temperature : temperatures) {
            sum += temperature;
        }

        return sum / temperatures.size();
    }

    @Override
    public void monthsAboveAverage() {
        Iterator<Double> iterator = temperatures.iterator();
        double average = averageTemperature();
        Integer count = 0;

        while(iterator.hasNext()) {
            double temperature = iterator.next();

            if(temperature > average) {
                switch(count) {
                    case(0):
                        System.out.println("1 - Janeiro: " + temperature);
                        break;

                    case(1):
                        System.out.println("2 - Fevereiro: " + temperature);
                        break;

                    case(2):
                        System.out.println("3 - Março: " + temperature);
                        break;

                    case(3):
                        System.out.println("4 - Abril: " + temperature);
                        break;

                    case(4):
                        System.out.println("5 - Maio: " + temperature);
                        break;

                    case(5):
                        System.out.println("6 - Junho: " + temperature);
                        break;

                    default:
                        System.out.println("Não houve temperatura acima da média");
                }
            }

            count++;
        }
    }

    @Override
    public String toString() {
        return "[temperaturas = " + temperatures + "]";
    }
}
