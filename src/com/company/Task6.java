package com.company;

import java.util.Scanner;

/**
 * Created by Andrej Minenko on 16.10.2016.
 */
public class Task6 {

    /**
     * Ввести с консоли n целых чисел. На консоль вывести:
     * Четные и нечетные числа.
     * Наибольшее и наименьшее число.
     * Числа, которые делятся на 3 или на 9.
     * Числа, которые делятся на 5 и на 7.
     * Все трехзначные числа, в десятичной записи которых нет одинаковых
     * цифр.
     * «Счастливые» числа.
     * Элементы, которые равны полусумме соседних элементов.
     */
    public void task6() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int l = in.nextInt();
        int[] arr = new int[l];// имена лоджны содержать в имене то что они хронят
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < arr.length; i++)
            arr[i] = in.nextInt();

        System.out.println("Все элементы массива: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println('\n' + "Все четные элементы массива: ");
        for (int i = 0; i < arr.length; i++) {
            double a = arr[i] % 2;
            if (a == 0)
                System.out.print(arr[i] + " ");
        }
        System.out.println('\n' + "Все нечетные элементы массива: ");
        for (int i = 0; i < arr.length; i++) {
            double a = arr[i] % 2;
            if (a != 0)
                System.out.print(arr[i] + " ");
        }
        System.out.println('\n' + "Максимальное значение: ");
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > res) res = arr[i];
        }
        System.out.print(res);
        System.out.println('\n' + "Минимальные значение: ");
        res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < res) res = arr[i];
        }
        System.out.print(res);
        System.out.println('\n' + "Все элементы массива, которые делятся на три: ");
        for (int i = 0; i < arr.length; i++) {
            double a = arr[i] % 3;
            if (a == 0)
                System.out.print(arr[i] + " ");
        }
        System.out.println('\n' + "Все элементы массива, которые делятся на девять: ");
        for (int i = 0; i < arr.length; i++) {
            double a = arr[i] % 9;
            if (a == 0)
                System.out.print(arr[i] + " ");

        }
        System.out.println('\n' + "Все элементы массива, которые делятся на 5: ");
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i] % 5;
            if (a == 0)
                System.out.print(arr[i] + " ");
        }
        System.out.println('\n' + "Все элементы массива, которые делятся на 7: ");
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i] % 7;
            if (a == 0)
                System.out.println(arr[i] + " ");
        }

        for (int i = 0; i < arr.length; i++) {
            int z = arr[i] % 10;
            int w = arr[i] / 10;
            int y = w % 10;
            int x = w / 10;
            if (x != y && y != z && x != z && (arr[i] > 99 && arr[i] < 1000)) {
                System.out.println('\n' + "Трехзначные числа, в десятичной записи которых нет одинаковых цифр: " + arr[i]);
            }
        }
        Scanner scanCons = new Scanner(System.in);
        int sum1 = 0, sum2 = 0;

        System.out.println("Введите одно число с кратным кол-вом разрядов:");
        char[] arrCharCon = scanCons.next().toCharArray();


        for (int i = 0; i < arrCharCon.length; i++) {
            if (i < arrCharCon.length / 2) {
                sum1 += Integer.parseInt(String.valueOf(arrCharCon[i]));
            } else {
                sum2 += Integer.parseInt(String.valueOf(arrCharCon[i]));
            }
        }

        if (sum1 == sum2) {
            System.out.println("Введенное число счастливое - " + String.valueOf(arrCharCon));
        } else {
            System.out.println("Введенное число не счастливое - " + String.valueOf(arrCharCon));
        }
    }
}


