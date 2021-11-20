package com.pb.lelyuk.hw8;

public class Auth {

    String login;
    String password;
    String confirmPassword;


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public void signUp (String login, String password, String confirmPassword) {
        if(login.length()>=5 & login.length()<=20) {
           if(!login.matches("[^0-9a-zA-Z]+")) {
               System.out.println("Логин соответствует требованиям :-)");
           } else {throw new WrongLoginException("Логин может состоять только из латинских буквы и арабских цифры");}
        } else {throw new WrongLoginException("Длина логина должна быть не менее 5 и не более 20 символов");}

        if (password.length()>=5) {
            if (!password.matches("[^0-9a-zA-Z_]+")) {
                System.out.println("Пароль соответствует требованиям :-)");
            } else {throw new WrongPasswordException("Пароль может содержать только латинские буквы, арабские цифры и знак подчеркивания");}
        } else {throw new WrongPasswordException("Длина пароля должна не менее 5 символов");}

        if(!password.matches(confirmPassword)) {
            throw new WrongPasswordException("Введен неверный пароль");
        }

    }

    public void signIn (String login, String password) {
        if(!login.matches(this.login) || !password.matches(this.password)) {
            throw new WrongLoginException("Вы неугадали логин или пароль");
        } else {
            System.out.println("Поздравляем! Вы угадали логин и пароль - добро пожаловать!");
        }
    }
}
