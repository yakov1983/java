package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ///  FILO - First in last out

        Stack<String> stack = new Stack<>();

        //// добавление элемента в стек

        stack.add("element1");
        stack.add("element2");
        stack.add("element3");
        stack.add("element4");
        stack.add("element5");

        System.out.println(stack);

        /// pop - достает верхний элемент стэка и удаляет его

        System.out.println(stack.pop());
        stack.pop();

        System.out.println(stack);

        stack.push("element5");
        System.out.println(stack);

        //// peek - возвращает верхний элемент стэка без его удаления
        System.out.println(stack.peek());
        System.out.println(stack);

        ///
        System.out.print("Элемент\"element5\" находится по номеру: ");
        System.out.println(stack.search("element5"));

        ///////очистка  коллекции

        stack.clear();

        try {
            System.out.println(stack.pop());   ////  будет ошибка(исключение)
        }
        catch (EmptyStackException e) {
            System.err.println("Ошибка!!! Стек пустой");
        }


        System.out.println();
        System.out.println();
        System.out.println("ОЧЕРЕДИ");
        //////////////////    ОЧЕРЕДИ  ////////

        //// FIFO - First In First Out

        Queue<String> queue = new PriorityQueue<>(5);
        queue.add("element1");
        queue.add("element2");
        queue.add("element3");
        queue.add("element4");
        queue.add("element5");

        System.out.println(queue);

        // poll, remove - достает первый элемент очереди и удаляет
        System.out.println(queue.poll());
        System.out.println(queue);

        //peek, element - возвращает первый элемент очереди без удаления
        System.out.println(queue.peek());

        /*/  для домашнего рассмотрения
        if(queue.offer("element5"))
            System.out.println("элемент добавлен");
        else
            System.out.println("не удалось добавить элемент");



         */

        UserComparator comparator = new UserComparator();
        Queue<User> users = new PriorityQueue<>(comparator);

        Random rand = new Random();

        for(int i = 0; i < 10; i++) {
            User u = new User();
            u.setMoney(rand.nextInt(1000));
            users.add(u);
        }

        while (true){
            User u = users.poll();
            if(u == null)
                break;
            else
                System.out.println(u);
        }

            //////////////  рекурсия  /////////////
        ////////  Нахождение факториала  /////////

        System.out.println( factorial1(5));
        System.out.println(factorial2(6));

     }
     public  static  int factorial1(int n) {
        int f = 1;
        for (;n != 1; n--) {
            f *= n;
        }
        return f;
     }

     public  static int factorial2 (int n) {
        if (n == 0)
            return 1;
        return n * factorial2(n - 1);
     }
}
