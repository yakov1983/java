package com.company;

public class Main {

    /*
    * Принципы ООП
    * 1. Инкапсуляция
    * 2. Полиморфизм - способность обьекта изменяться под различными факторов
    * а) переопределение методов(перегрузка)
    * б)
    * 3. Наследование
    * 4. Абстракция
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

        Dog dog = new Dog();
        dog.color = "white";
        dog.weight = 10;
        dog.sleep(3);
        dog.breed = "Овчарка";
        dog.bark();
        dog.eat();

        //полиморфизм
        Animal animal3 = new Dog(); // остануться свойства и методы которые есть у Animal и у Dog остаются переопределенные методы
        animal3.eat();
        animal3.sleep(4);
        sleep(animal);
        sleep(dog);
        sleep(animal3);
    }

    public static void test(Animal a) {
        a.color = "red";
    }

    //sleep - это обобщенный метод
    public static void sleep(Animal a) {
        a.sleep(10);
    }
}
