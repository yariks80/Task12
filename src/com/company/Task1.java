package com.company;

import java.util.Scanner;

/**
 * Created by Andrej Minenko on 16.10.2016.
 */
public class Task1 {
    /**
     * Приветствовать любого пользователя при вводе его имени через командную строку.
     */
    public void task1() {
        System.out.println('\n' + "Введите ваше имя и нажмите клавишу <Enter>" + '\n');
        Scanner name = new Scanner(System.in);

        String x = name.nextLine();
        System.out.println('\n' + x + ", привет!");
    }
}
