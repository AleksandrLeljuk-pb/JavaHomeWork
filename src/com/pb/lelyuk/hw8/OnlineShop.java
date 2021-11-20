package com.pb.lelyuk.hw8;

import java.util.Scanner;

public class OnlineShop {

    public static void main (String[] args) throws WrongLoginException, WrongPasswordException{

        String login;
        String parol;
        String confirmPassword;

        Scanner person = new Scanner(System.in);

        Auth auth = new Auth();

        System.out.println("Зарегистрируйтесь - введите логин и пароль (логин от 5 до 20 символов, пароль на менее 5 символов, " +
                "допускаются только латинские буквы, арабские цифры, в пароле возможно подчеркивание)");
        try{
            System.out.println("Login: ");
            login = person.nextLine();
            auth.setLogin(login);

            System.out.println("Parol: ");
            parol = person.nextLine();
            auth.setLogin(parol);

            System.out.println("Confirm parol: ");
            confirmPassword = person.nextLine();
            auth.setLogin(confirmPassword);

            auth.signUp(login, parol, confirmPassword);
        } catch (WrongLoginException e) {
            System.out.println("Ошибка при вводе логина: " + e.getMessage());
            System.exit(1);
        } catch (WrongPasswordException e) {
            System.out.println("Ошибка при вводе пароля:" + e.getMessage());
            System.exit(1);
        }

        System.out.println("\n");

        System.out.println("Авторизуйтесь в аккаунте");

        try {
            System.out.println("Login: ");
            login = person.nextLine();
            auth.setLogin(login);

            System.out.println("Parol: ");
            parol = person.nextLine();
            auth.setLogin(parol);

            auth.signIn(login, parol);
        } catch (WrongLoginException e) {
            System.out.println("Ошибка при вводе логина или пароля:" + e.getMessage());
            System.exit(1);
        }
    }
}
