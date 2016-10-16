package com.company;

/**
 * Created by Andrej Minenko on 16.10.2016.
 */
public class Task2 {
    /**
     *
     * Отобразить в окне консоли аргументы командной строки в обратном порядке.
     */
    public void task2(String[] args) {
        System.out.println('\n' + "Аргументы командной строки в обратном порядке:" + '\n');
        int i = args.length;
        while (i > 0) {
            i--;
            System.out.println("Аргумент = " + args[i]);
        }
    }
}
