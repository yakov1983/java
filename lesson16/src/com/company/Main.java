package com.company;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ///////////  Сериализация  ///////////////

        User u = new User("Vasya", 20);
        u.height = 120.3f;

        try {
            FileOutputStream fos = new FileOutputStream("User.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(u);
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        ////////////////  Десериализация   ///////////////////

        try {
            FileInputStream fis = new FileInputStream("User.bin");
            ObjectInputStream oin = new ObjectInputStream(fis);
            User user = (User)oin.readObject();
            oin.close();
            fis.close();
            System.out.println(user.name);
            System.out.println(user.age);
            System.out.println(user.height);
        } catch (Exception e) {
            e.printStackTrace();
        }

        /////////  Сериализация коллекции /////////////////

        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Tom",20));
        users.add(new User("Tim",25));
        users.add(new User("Andrew",30));
        users.add(new User("Kris",35));

        try {
            FileOutputStream fos = new FileOutputStream("Users.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(users);
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream("Users.bin");
            ObjectInputStream oin = new ObjectInputStream(fis);
            ArrayList<User> people = (ArrayList<User>)oin.readObject();
            oin.close();
            fis.close();

            for (User user : people) {
                System.out.print(user.name);
                System.out.println(user.age);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
