package com.pb.lelyuk.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float randomNumber;

        System.out.println("введіть значення будь-якого цілого числа ");
        randomNumber = scan.nextInt();
        if (randomNumber<0||randomNumber>100) {
            System.out.println("Значення не входить в жоден з інтервалів");
        } else if (randomNumber>=0&&randomNumber<=14) {
            System.out.println("Значення належить інтервалу чисел [0 - 14]");
            } else if (randomNumber>=15&&randomNumber<=35) {
                  System.out.println("Значення належить інтервалу чисел [15 - 35]");
                   } else if (randomNumber>=36&&randomNumber<=50) {
                           System.out.println("Значення належить інтервалу чисел [36 - 50]");
                           } else if (randomNumber>=51&&randomNumber<=100) {
                                  System.out.println("Значення належить інтервалу чисел [51 - 100]");
                                  }
    }
}
