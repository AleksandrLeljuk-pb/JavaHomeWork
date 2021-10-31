package com.pb.lelyuk.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    static char[] sentence(String sentence3) {
        sentence3 = sentence3.replaceAll("(?U)\\W", ""); //удаляем пробелы и пунктуацию
        char[] sentence = sentence3.toCharArray();                   //преобразуем строку в массив
        Arrays.sort(sentence);                                       //сортируем массив
        return sentence;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введіть речення № 1");
        String sentense1 = scan.nextLine();
        System.out.println("Введіть речення № 2");
        String sentense2 = scan.nextLine();

        char[] sentens11 = sentence(sentense1);                //получаем из метода массив сформированный из 1 предложения

        char[] sentens21 = sentence(sentense2);               //получаем из метода массив сформированный из 2 предложения

        boolean result = Arrays.equals(sentens11, sentens21);   //сравниваем два массива (условие: массив 1 равен массиву 2)
        System.out.println(result);
        if (result) {
            System.out.println("Друге речення є анаграмою першого речення");
        } else {
            System.out.println("Друге речення НЕ Є анаграмою першого речення!");
        }

    }
}
