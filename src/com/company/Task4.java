package com.company;

import java.util.Scanner;

/**
 * Created by Andrej Minenko on 16.10.2016.
 */
public class Task4 {
    /**
     * Ввести пароль из командной строки и сравнить его со строкой-образцом.
     */
    public void task4(){
        System.out.println('\n'+"Введите пароль и нажмите клавишу <Enter>");
        Scanner password = new Scanner(System.in);

        String password1 = password.nextLine();
        String password2 = "qwerty";

        System.out.println('\n'+"Cравнение паролей: " + (password1 == password2)+'\n'); // String  сравнивать == не стоит 
        System.out.println("Cравнение паролей: " + password1.equals(password2)+'\n');
    }
}
