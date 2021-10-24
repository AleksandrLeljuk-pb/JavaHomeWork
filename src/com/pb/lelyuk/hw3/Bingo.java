package com.pb.lelyuk.hw3;

import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int randomNum=0;
        double randomNum0;
        String playerAnsv;
        int playerNum;
        int attempt = 0;

        System.out.println("Хочеш пограти у гру 'Вгадай число' ? (y / n) ");
        playerAnsv = scan.next();
        if (playerAnsv.equalsIgnoreCase("y")) {
            randomNum0 = Math.random()*100;
            randomNum = (int)randomNum0; //ця функція дозволяє генерувати цілі числа від 0 до 99
            if (randomNum > 0) {
                randomNum++;
            }                            //організуємо можливість генерації випадкового числа від 0 до 100
            System.out.println("Я загадав число, спробуй вгадати його - введи свій варіант (ціле число від 0 до 100)!");
            playerNum = scan.nextInt();

        } else  return;
        while (true)  {
            attempt++;
            if (playerNum == randomNum) {
               // continue;
               System.out.println("Вітаю!!! Ви вгадали на спробі " + attempt + "!!!");
                break;
            }

             if (playerNum != randomNum) {
                System.out.println("Ви не вгадали!");
                if (playerNum < randomNum) {
                    System.out.println("Задумане число більше Вашого варіанту");
                } else System.out.println("Задумане число менше Вашого варіанту");
                System.out.println("Використано спроб " + attempt);
                System.out.println("Хочете ще одну спробу? (y/n)");
                playerAnsv = scan.next();
                if (playerAnsv.equalsIgnoreCase("y")) {
                    System.out.println("Введіть число");
                    playerNum = scan.nextInt();
                    continue;
                } else break;
            }
        }
        System.out.println("Game over!");

//        randomNum0 = Math.random()*100;
//        randomNum = (int)randomNum0;
//        System.out.println(randomNum0);
        System.out.println("Задумане число було " + randomNum);

    }
}
