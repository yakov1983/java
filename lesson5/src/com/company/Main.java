package com.company;

public class Main {

    /*
    * Принципы ООП
    * 1. Инкапсуляция
    * 2. Полиморфизм - способность обьекта изменяться под различными факторов
    * а) переопределение методов(перегрузка)
    * б)
    * 3. Наследование
    * */

    public static void main(String[] args) {

        //обьявление обьекта
        Animal animal = new Animal();
        animal.color = "black";
        animal.weight = 12.4f;
        animal.eat();
        animal.sleep();
        animal.sleep(12);
        animal.sleep(10, 45);

        System.out.println(animal.color);
        System.out.println(animal.weight);

        //  ссылочность
        Animal animal2 = animal;
        animal2.color = "blue";
        System.out.println(animal.color);  //blue, если прописать "new"(обьявиться новый блок памяти) и тогда будет "black"
        System.out.println(animal2.color);  //blue
        test(animal);
        System.out.println(animal.color); // red
    }

    public static void test(Animal a) {
        a.color = "red";
    }
}
