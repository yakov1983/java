package com.company;

public class Animal {
    // свойства обьекта
    public float weight;
    public String color;
    private float height;
    protected int age;

    //методы обьекта
    public void eat() {
        System.out.println("animal eat");
    }

    // Перегрузка метода sleep

    public void sleep() {
        System.out.println("animal sleep");
    }

    public void sleep(int h) {
        System.out.print("animal sleep ");
        System.out.print(h);
        System.out.println(" hours");
    }

    public void sleep(int h, int m) {
        System.out.print("animal sleep ");
        System.out.print(h);
        System.out.print(" hours and ");
        System.out.print(m);
        System.out.println(" minutes");
    }
}
