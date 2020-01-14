package com.company;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	    //List<Integer> linkedList = new LinkedList<>();

        //Set хранит не дублирующиеся(уникальные) элементы
	    Set<String> set = new HashSet<>();
	    set.add("string1");
        set.add("string2");
        set.add("string3");
        set.add("string4");

        System.out.println(set);

        //// После добавление дублирующего элемента
        set.add("string2");
        System.out.println(set);

        set.remove("string2");
        System.out.println(set);

        /////////////  Map  ////////////////////

        //Map хранит элементы по принципу ключ значение

        Map<String, Integer> map = new HashMap<>();
        map.put("Ivanov", 2500);
        map.put("Petrov", 500);
        map.put("Sidorov", 200);
        map.put("Kozlov", 25);

        System.out.println(map);

        int value = map.get("Ivanov");
        System.out.println(map.get("Ivanov"));

        //возвращает множество ключей
        Set<String> keys = map.keySet();
        System.out.println(keys);

        //возвращает множество значений
        System.out.println(map.values());

        // удаление
        map.remove("Sidorov");
        System.out.println(map);

        /////////////////  DATE   ///////////////////

        Date d = new Date();

        d.getTime();   // возвращанет время в милисекундах(01/01/1970)

        System.out.println(d.getTime());

        //  задание времени
        Date d2 = new Date(-54544554);

        if (d.after(d2))
            System.out.println("d > d2");
        if (d.before(d2))
            System.out.println("d < d2");

        //  Форматирование даты
        //   существует таблица для форматирования, значение из которой кладется в конструктор
        SimpleDateFormat df = new SimpleDateFormat("G 'text' yyyy EEEE");

        System.out.println(df.format(d2));

        // задание реальной даты
        SimpleDateFormat df2 = new SimpleDateFormat("d/M/yyyy");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дату: ");

        String date = sc.nextLine();

        try {                                     // метод parse   генерирует исключение
            Date d3 = df2.parse(date);
            System.out.println(d3.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }


        try {
            df2.parse(date);    // парсится в тот формат, который указали в конструкторе
        } catch (ParseException e) {
            e.printStackTrace();
        }

        ////   СALENDAR  ////////////    более удобный для работы

        GregorianCalendar calendar = new GregorianCalendar();  // точка отсчета 1970 г
        GregorianCalendar calendar1 = (GregorianCalendar)GregorianCalendar.getInstance();   //   записывает заданное время

        ///  Получение данных из каландаря

        System.out.println(calendar1.get(Calendar.MONTH));  // по константе выводит что либо
        System.out.println(calendar1.get(Calendar.WEEK_OF_YEAR));  // выводит номер недели

        ///  Замена параметра
        calendar1.set(Calendar.MONTH, Calendar.MAY);
        calendar1.set(Calendar.MINUTE, 25);

        System.out.println(calendar1);

        calendar1.add(Calendar.DAY_OF_MONTH, 28);  // прибавляем  значение  к текущему
        System.out.println(calendar1);

        calendar1.add(Calendar.HOUR, -23);
        System.out.println(calendar1);

        calendar1.roll(Calendar.DAY_OF_MONTH, 30); //   просто прибавим, а остльные  значения не изменятся
        System.out.println(calendar1);

        if (calendar1.isLeapYear(calendar1.get(Calendar.YEAR)))
            System.out.println("год високосный");
        else
            System.out.println("год невисокосный");
    }
}
