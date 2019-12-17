package com.company;

public class User {

    private String name;
    private int age;


    public String getName(){    // геттер
        return this.name;
    }

    public void setName(String name) {    // сеттер
        this.name = name;
    }

    public int getAge() {           //геттер
        return this.age;
    }

    public void setAge(int age) {          //сеттер

        if (age < 0 || age > 120) {
            System.out.println("Недопустимое значение ");
        } else {
            this.age = age;
        }
    }

   /* public User(String name, int age) {
        this.name = name;
        this.age = age;
    }*/

   @Override
   public boolean equals(Object obj) {
       //явно преобразуем obj к типу User
       //если явно преобразование не возможно , то в результате преобразования мы получим
       // значение NULL
       User user = (User) obj;
       // поскольку свойство name String , то его сравнение должно производиться через метод Equals, так разные значения адресов
       return (this.age == user.age && this.name.equals(user.name));
   }
   @Override
   public int hashCode() {
       if (this.age > 18) {
           return 1;
       }
       return 2;
   }

   @Override
    public String toString() {

       return this.name;
   }
}
