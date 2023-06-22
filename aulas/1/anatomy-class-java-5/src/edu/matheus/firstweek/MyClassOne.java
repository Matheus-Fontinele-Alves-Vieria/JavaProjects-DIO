package edu.matheus.firstweek;

public class MyClassOne {
    public static void main(String[] args) {
        int array[] = {8, 1, 2, 7, 9, 5, 3, 6, 4};

        int bubbleSort[] = bubbleSort(array);

        for(int i = 0; i < bubbleSort.length; i++) {
            System.out.println(bubbleSort[i] + " ");
        }
    }

    public static int [] bubbleSort(int[] array) {
        int temp = 0;

        for(int i = 0; i < array.length; i++) {
            for(int j = 1; j < array.length - i; j++) {
                if(array[j] < array[j - 1]) {
                    // swap
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }
}
