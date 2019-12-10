package com.company;

//  в джава невозможно создать экземпляр обьекта абстрактного класса

public abstract class Animal {

    public String color;
    public int age;

   /* public Animal() {  // конструктор без параметров
        color = "black";
        age = 1;
        System.out.println("animal was created");
    }*/

    public Animal(String color, int age) { // конструктор с параметрами
        this.color = color;  // ссылка на текущий экземпляр обьекта
        this.age = age;
    }

    public abstract void say(String word);
}
