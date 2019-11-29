package com.company;

public class Main {

    public static void main(String[] args) {
        //массивы
        int [] arr = new int[5];
        arr[0] = 10;
        arr[4] = 20;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        // недопустимая операция
        //arr[5]

        //двумерные массивы

        int [][] m = new int [3][4];
        m[0][1] = 12;
        m[2][3] = 22;

        System.out.println(m[0][1]);
        System.out.println(m[2][3]);
        System.out.println(m[0][0]);
        // определение длины массива
        System.out.println(arr.length);
        System.out.println(m[0].length);

        //статическая инициализация массива

        int[] arr2 = {1,2,2,6,3,9};
        System.out.println(arr2[3]);

        //стат. двумерного массива

        int [][]m2 = {{1,2,3}, {2,6,9}, {8,9,5}};
        System.out.println(m2[1][2]);

        //циклы

    }
}
