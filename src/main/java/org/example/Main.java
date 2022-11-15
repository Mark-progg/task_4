package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[8];

        setRandomNumbers(array);
        printArray(array);

        if (isIncreasingSequence(array)){
            System.out.println("Последователность строго возрастающая");
        } else {
            System.out.println("Последователность НЕ строго возрастающая");
        }

        setZero(array);
        printArray(array);

    }

    public static void setRandomNumbers(int[] array){
        Random random = new Random();
        for (int i = 0; i<array.length; i++){
            array[i]= random.nextInt(10)+1;
        }
    }

    public static void printArray(int[] array){
        for (int i = 0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static boolean isIncreasingSequence(int[] array){
        for (int i=0; i<array.length-1; i++){
            if(array[i] > array[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void setZero(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if(i%2 != 0){
                array[i] = 0;
            }
        }
    }
}