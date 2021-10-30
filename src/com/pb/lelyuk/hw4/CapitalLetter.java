package com.pb.lelyuk.hw4;

import java.util.Scanner;
import java.util.StringTokenizer;

public class CapitalLetter {

    static String capitalFirst(String word) {
        String word1 = word.substring(0, 1);
        word = word.substring(1);
        word1 = word1.toUpperCase();
        word = word1 + word;
        return word;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentense2 = " ";

        System.out.println("Введіть речення для корегування");
        String sentense = scan.nextLine();
        StringTokenizer sent = new StringTokenizer(sentense);
        while (sent.hasMoreElements()) {
            sentense2 = sentense2 + " " + capitalFirst(sent.nextToken());
        }
        System.out.println("відкореговане речення:");
        System.out.println(sentense2);
    }
}
