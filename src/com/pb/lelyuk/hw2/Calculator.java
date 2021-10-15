package com.pb.lelyuk.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1;
        int operand2;
        String sign;
        // пробую задать переменную result как вещественную (хотя можно и как целую)
        float result;
        String result2;

        result = 1;
        result2 = "0";

        System.out.println("введіть значення першого цілого числа (operand1) ");
        operand1 = scan.nextInt();
        System.out.println("введіть значення другого цілого числа (operand2) ");
        operand2 = scan.nextInt();
        System.out.println("введіть позначку арифметичної операції (логіка: operand1 (символ арифметичної операції) operand2)");
        sign = scan.next();
        System.out.println("x = " + operand1 + " y = " + operand2 + " symbol = " + sign);
             switch (sign) {
                    case "+":
                        result = operand1+operand2;
                        break;
                    case "-":
                        result = operand1-operand2;
                        break;
                    case "*":
                        result = operand1*operand2;
                        break;
                    case "/":
                        if (operand2==0) {
                            System.out.print("На 0 ділити не можна" + "," + " ");
                            result2 = "не існує";
                        } else {
                            result = operand1 / operand2;
                        }
                        break;
                    }
        if (result2=="не існує") {
                 System.out.println("x" + sign + "y" + " = " + result2);
        } else {
                 System.out.println("x" + sign + "y" + " = " + result);
             }

        }
    }
