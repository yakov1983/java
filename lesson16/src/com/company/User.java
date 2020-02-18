package com.company;

import java.io.Serializable;

public class User implements Serializable {
    public String name;
    public  int age;
    public transient float height;    //// ключевое слово transient несериализует

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
