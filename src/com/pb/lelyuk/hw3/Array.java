package com.pb.lelyuk.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int counter = 0;
        int[] array = new int[10];
        int x = array.length;
        int arraySum = 0;
        int quantityPosNum = 0;

        System.out.println("Для створення масиву даних введіть 10 значень елементів масива (цілі числа)");

        while (counter<10) {
            System.out.println("число" + (counter+1) );
            array[counter] = scan.nextInt();
            counter++;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            arraySum = arraySum + array[i];
        }
        System.out.println("Cума елементів масиву дорівнює " + arraySum);

        for (int i = 0; i < array.length; i++) {
            if (array[i]>0) {
                quantityPosNum++;
            } else quantityPosNum = quantityPosNum+0;
        }
        System.out.println("Кількість позитивних елементів масиву дорівнює " + quantityPosNum);


        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
