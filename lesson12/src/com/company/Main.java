package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        User<String, String> user = new User<>();
        User<Date, Object>  user1 = new User<>();
        user.id = "SOME ID";
        System.out.println( user.id.toLowerCase());

        user1.id = new Date();
        System.out.println(user1.id.getTime());

        Car<User> car = new  Car<>();


        /////////////  Коллекции  ///////////////
       // ArrayList  (все элементы располагаются друг за другом, порядок не меняется)
        //возможен случайный доступ к элементам

        List<String> list = new ArrayList<>();

        // этот метод add добавляет элемент всегда в конец
        list.add("hello");
        list.add("world");
        list.add(1,"Java");

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));  // метод get = []
        }

        list.remove("hello");
        System.out.println(list);

        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);

        list1.remove(Integer.valueOf(20));
        System.out.println(list1);

        list1.set(1, 12);  // заменяет по индексу
    }
}
