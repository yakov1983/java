package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {
        User u = new User();
        u.language = Language.UA;
        switch (u.language) {
            case EN:
                System.out.println("Пользователь ввел иностранный язык");
                break;
            case RU:
            case BY:
            case UA:
                System.out.println("Пользователь ввел не иностранный язык");
                break;
        }

        System.out.println(u.language);
        u.color = Color.GREEN;
        System.out.println(u.color.getValue());

        Math m = Math.SUM;
        System.out.println(m.action(23, 12));

        m = Math.MULTIPLY;
        System.out.println(m.action(10, 20));

        /////////// STRING /////////////

        String s = "hello";
        String s2 = new String("defew");

        //StringBuilder
        StringBuilder sb = new StringBuilder("wgfewrgf");

        //////////////  append - добавляет значение в конец исходной строки
        sb.append("wwr");
        System.out.println(sb);

        //StringBuffer == StringBuilder , StringBuffer но потокобезопасен

        String str = "     hello world     ";
        str.contains("hello"); // содержится ли подстрока в строке
        str.charAt(8);     // возвращает символ в строке по индексу
        System.out.println(str.charAt(8));
        str.codePointAt(8);   // возвращает код символа в строке по индексу
        //str.compareTo()
        str.getBytes();   /// преобразует строку в массив байт
        byte[] b = str.getBytes(); // используется для отправки байт  на сервер
        for (int i = 0; i < b.length; i++) {
            System.out.print(" " + b[i]);
        }

        // преобразование массива байт в строку

        String strFromBytes = new String(b);
        System.out.println("abCDef".equalsIgnoreCase("ABcdEF"));   // сравнивает две строки между собой без учета регистра
        str.indexOf('2');
        // возвращает индекс символа или строки в исходной строке если совпадение не найдено
        // возвращает -1
        System.out.println(str.indexOf("wor"));

        //lastIndexOf == indexOf, но поиск начинаетяс с конца строки

        System.out.println("hello".indexOf('l'));  // 2
        System.out.println("hello".lastIndexOf('l'));  // 3

        //  replace - заменяет подстроку в исходной строке
        str.replace("hello", "hi");

        //split - разделяет строку по символу  либо строке
        str.split(" ");
        "hello all hi".split(" ");  // вернет массив из трех значений  сам разделитель записан не будет

        String[] chunks = str.split(" ");
        for (int i = 0; i < chunks.length; i++) {
            System.out.println(chunks[i]);
        }

        // substring - выделяет подстроку в строке
        // 8- начальный индекс подстроке
        // 13 -  конечный индекс(не включая)
        System.out.println(str.substring(8, 13));

        // приведение регистров
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

    }
}
