package com.company;

public class Main {

    public static void main(String[] args) {
	/*
	* логические операторы:
	* >, <, >=, <=, ==, !=
	* && - логическое "и", || - логическое "или"
	* */
	    int age = 12;

    	if (age >= 18) {
	        System.out.println("доступ разрешен");
        } else {
	        System.out.println("доступ запрещен");
        }

    	int a = 10, b = 20, c = 15;

    	if (a > b && a > c) {
			System.out.println(a);
		} else if (b > c && b > a){
			System.out.println(b);
    	} else {
			System.out.println(c);
		}

    	int month = 5;

    	switch (month) {
			case 1:
				System.out.println("январь");
				break;

			case 2:
				System.out.println("февраль");
				break;

			case 3:
				System.out.println("март");
				break;

			case 4:
				System.out.println("апрель");
				break;

			case 5:
				System.out.println("май");
				break;

			case 6:
				System.out.println("июнь");
				break;

			case 7:
				System.out.println("июль");
				break;

			case 8:
				System.out.println("август");
				break;

			case 9:
				System.out.println("сентябрь");
				break;

			case 10:
				System.out.println("октябрь");
				break;

			case 11:
				System.out.println("ноябрь");
				break;

			case 12:
				System.out.println("декабрь");
				break;

			default:
				System.out.println("некорректный ввод");
				break;
		}

		//опереатор % - остаток  от деления
		//5 % 2 = 1
		System.out.println(5 % 3);

    	//строка
		String name = "Vasya";

		switch(name){
			case "Vasya":
				System.out.println("некорректный ввод");
				break;
		}
    }
}
