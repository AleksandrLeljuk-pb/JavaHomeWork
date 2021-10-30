package com.pb.lelyuk.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    static char[] sentense(String sentense3) {
        sentense3 = sentense3.replaceAll("\\W", ""); //удаляем пробелы и пунктуацию
        char[] sentense = sentense3.toCharArray();                   //преобразуем строку в массив
        Arrays.sort(sentense);                                       //сортируем массив
            return sentense;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введіть речення № 1");
        String sentense1 = scan.nextLine();
        System.out.println("Введіть речення № 2");
        String sentense2 = scan.nextLine();

        char[] sentens11 = sentense(sentense1);                //получаем из метода массив сформированный из 1 предложения
        System.out.println(sentens11);
        for (int i = 0; i < sentens11.length; i++) {
            System.out.println(sentens11[i]);
        }

        char[] sentens21 = sentense(sentense2);               //получаем из метода массив сформированный из 2 предложения
        System.out.println(sentens21);
        for (int i = 0; i < sentens21.length; i++) {
            System.out.println(sentens21[i]);
        }
        Boolean result = Arrays.equals(sentens11, sentens21);   //сравниваем два массива (условие: массив 1 равен массиву 2)
        System.out.println(result);
        if(result == true) {
            System.out.println("Друге речення є анаграмою першого речення");
        } else System.out.println("Друге речення НЕ Є анаграмою першого речення!");
        //System.out.println("Final");
        }



}
