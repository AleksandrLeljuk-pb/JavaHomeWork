package com.pb.lelyuk.hw3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int counter = 0;
        int[] array = new int[10];
        int x = array.length;

        System.out.println("Для створення масиву даних введіть 10 значень елементів масива (цілі числа)");

        while (counter<10) {
            System.out.println("число" + (counter+1) );
            array[counter] = scan.nextInt();
            counter++;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
