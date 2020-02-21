package com.company;

import java.util.Map;

public class Main {

    public static void main(String[] args) {

        /////////////////  аргументы командной строки  ///////

        int sum = 0;
        for (String arg : args) {
            int d = Integer.parseInt(arg);
            sum += d;
        }
        System.out.print("Сумма чисел = ");
        System.out.println(sum);


        //////////////   Системные переменные  ////////////////

        Map<String, String> envs = System.getenv();    ///   получение списка системных переменных(переменные среды)


        System.out.println("JAVA_HOME = " + envs.get("Path"));
        System.out.println("JAVA_HOME = " + envs.get("JAVA_HOME"));

        ////////  если нужно вызвать одну переменную
        System.out.println(System.getenv("TEMP"));
        System.getenv("TEMP");
    }
}
