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

        System.out.println("Хочешь поиграть в игру 'Угадай число' ? (y / n) ");
        playerAnsv = scan.next();
        if (playerAnsv.equalsIgnoreCase("y")) {
            randomNum0 = Math.random()*100;
            randomNum = (int)randomNum0; //данная функция позволяет генерить целіе числа от 0 до 99
            if (randomNum > 0) {
                randomNum++;
            }                            //организовываем возможность генерации случайного числа от 0 до 100
//            randomNum = 10;
            System.out.println("Я загадал число, попробуй угадать его - введи свой вариант (целое число от 0 до 100)!");
            playerNum = scan.nextInt();

        } else  return;
        while (true)  {
            attempt++;
            if (playerNum == randomNum) {
               // continue;
               System.out.println("Поздравляю!!! Вы угадали на попытке " + attempt + "!!!");
                break;
            }

             if (playerNum != randomNum) {
                System.out.println("Вы не угадали!");
                if (playerNum < randomNum) {
                    System.out.println("Задуманное число больше Вашего варианта");
                } else System.out.println("Задуманное число меньше Вашего варианта");
                System.out.println("Использовано попыток " + attempt);
                System.out.println("Хотите еще одну попытку? (y/n)");
                playerAnsv = scan.next();
                if (playerAnsv.equalsIgnoreCase("y")) {
                    System.out.println("Введите число");
                    playerNum = scan.nextInt();
                    continue;
                } else break;
            }
        }
        System.out.println("Game over!");

//        randomNum0 = Math.random()*100;
//        randomNum = (int)randomNum0;
//        System.out.println(randomNum0);
        System.out.println("Загаданное число было " + randomNum);

    }
}
