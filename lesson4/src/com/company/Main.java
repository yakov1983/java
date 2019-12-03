package com.company;

public class Main {

    public static void main(String[] args) {
        // функции
        int s = sum(12, 20, 56);
        System.out.println(s);

        float m = max(12.7f, 13.5f, 48.96f);
        System.out.println(m);
        // пример

        int []a = {12,23,4,6,9,0,7};
        s = sumAll(a);
        System.out.println(s);

        float r = sumOdd(12.7f, 3.0f, 0.3f, 5.2f);
        System.out.println(r);

        a = bubbleSort(a);
        System.out.println("-------------");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            System.out.print(" ");
        }
    }
    // объявление функции
    // void - функция не возвращает значение
    public static int sum (int a, int b, int c) {
        // тело функции
        return a + b + c; // return - завершает выполнение функции
    }

    public static float max(float x, float y, float z) {
        if (x > y && x > z) {
            return x;
        }
        if (y > x && y > z) {
            return y;
        }
        return z;
    }

    public static int sumAll (int[] arr) {
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
        }
        return s;
    }

    //функция с переменным числом параметров
    public static float sumOdd(float...a) {
        float s = 0.0f;
        for (int i = 0; i < a.length; i+=2) {
           /* if (i % 2 == 0) {
                continue;
            }*/
            s += a[i];
        }
        return s;
    }

    // сортировка методом пузырька
    public static int[] bubbleSort (int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        return a;
    }
}
