package com.company;

public class Main {

   public static void main(String[] args) {
	System.out.println("Hello world!");

	/*
	    int, uint - занимает 4 байта б только целые числа;
	    short - 2 байта, только целые числа;
	    byte - 1 байт;
	    long - 4 bytes, float;
	    double - 8 bytes, float;
	    boolean - 1 bytes(true  false);
     */

	int x = 1;
	int y = 20;
	// присваивание
       float z = 1.2356f;
       double c = 1.5698;
       boolean b = true;
	System.out.println(x);


       System.out.println(x + y);
       System.out.println(x - y);
       System.out.println(x * y);
       System.out.println((double)x / y); // явное преобразование типов

       System.out.println(x * (y + 1));
    }
}
