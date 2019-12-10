package com.company;

public class Dog extends Animal {

    public String name;

    //статические свойства располагаются в памяти в единственном экзампляре
    public static int footCount;

    public Dog() {

        super("green", 5);   //  вызывается конструктор родителя (если defalt конструктор) super писать первым , иначе не выделить память под него
        this.name = "hghg";
        Cat cat = new Cat();
    }

    public Dog(String color, int age, String name) {
        super(color, age);
        this.name = name;
    }
    //say - определение абстрактного родительского метода

    public void say(String sound) {
        System.out.println("haw-haw " + sound);  // аргументы допустимо "+" т.к. один тип
    }

    // внутренний класс (inner - класс)
    public static class Cat {

        public String name;

        Cat() {
            this.name = "I am a Cat";
            name = "I am a Dog";
        }
    }

    private class Mouse {   // static не имеет смысла
        Mouse() {
            name = "I am a mouse";
        }
    }

    public static void bark() {
        //this.name = "rfgre"; - ошибка
        //для статических методов нельзя
        //использовать ссылку на экземпляр обьекта (this)
        System.out.println("bark");
        sleep();
    }

    public static void sleep() {
        System.out.println("z-z-z-z-z-z");
    }
}


