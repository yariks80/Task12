package com.company;

/**
 * Created by Andrej Minenko on 16.10.2016.
 */
public class Task5 {
    /**
     *
     * Ввести целые числа как аргументы командной строки, подсчитать их суммы (произведения) и вывести результат на
     * консоль.
     */
    public void task5 (String [] args){
        int sum = 0;
        int proizv = 1;
        for (int i = 0; i < args.length; i++)
        {
            sum += Integer.parseInt(args[i]);
            proizv *= Integer.parseInt(args[i]);
        }
        System.out.println("Сумма чисел: " + sum+'\n');
        System.out.println("Произведение чисел: " + proizv+'\n');
    }
}
