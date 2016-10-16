package com.company;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Andrej Minenko on 16.10.2016.
 */
public class Task3 {
    /**
     * Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.
     */
    public void task3() {
        System.out.println('\n' + "Введите количество случайных чисел" + '\n');
        Scanner chisla = new Scanner(System.in);
        String k = chisla.nextLine();
        int z = Integer.parseInt(k);

        Random rand = new Random();

        System.out.println('\n' + "Случайные числа в столбик:" + '\n');
        for (int i = 0; i < z; i++) {

            System.out.println(rand.nextInt());
        }
        System.out.println('\n' + "Случайные числа в строку:" + '\n');
        for (int i = 0; i < z; i++) {

            System.out.print(rand.nextInt() + " ");
        }
        System.out.println();
    }
}
