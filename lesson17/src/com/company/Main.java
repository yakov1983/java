package com.company;

public class Main {

    public static void main(String[] args) {

        /////////////////  аргументы командной строки  ///////

        int sum = 0;
        for (String arg : args) {
            int d = Integer.parseInt(arg);
            sum += d;
        }
        System.out.print("Сумма чисел = ");
        System.out.println(sum);
    }
}
