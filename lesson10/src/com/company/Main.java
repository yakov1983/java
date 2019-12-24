package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        //абсолютный путь к файлу
	    File f = new File("С:\\Programs\\1.txt");  // путь задается 2 мя способами - относительный и абсолютный
        if (f.exists()) {  // метод возвращает булево значение поэтому == не надо писать
            System.out.println("Файл существует");
        } else {
            System.out.println("Файла не существует");
        }

        // по относительному пути к файлу
        File ff = new File("1.txt");
        if (!ff.exists()) {
            try {
                ff.createNewFile(); // метод создает новый файл
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //проверяем файл на доступность
        //выставлен ли атрибут "только для чтения"
        System.out.println(ff.canWrite());

        //delete - удаляет сразу после метода
        //ff.delete();

        //deleteOnExit - удаляет файл после завершения программы
        //ff.deleteOnExit();

        ff.getAbsoluteFile(); // выводит путь до файла

        //ff.deleteOnExit();

        // работа с папкой

        File dir = new File("C:\\Python27");
        //выводим весь список папок и файлов
        String []files = dir.list();  // создали массив строк , куда записали список папок и файлов
        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i]);// вывели построчно весь список
        }

        File dir2 = new File("D:\\Test\\Hello"); //этих папок нет
        if (!dir2.exists()) {
            // создает только последнюю папку по указанному пути
            dir2.mkdir();
            //dir.mkdirs() - создает все папки по указанному пути
            dir2.mkdirs();
        }

        // Все файлы : текстовые или бинарные
        // Чтение текстовых файлов

        try {
            FileReader fr = new FileReader(ff);  // класс для чтение файла
            int c = fr.read();
            // читаем из файла , пока значение не вернет -1
            while (c != -1) {
                System.out.print((char) c);
                c = fr.read();
            }
            fr.close();  // закрываем файл на чтение
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Запись в файл


        String text = "Hello!\nWorld\nПривет!";
        try {
            FileWriter fw = new FileWriter("2.txt");
            fw.write(text);
            fw.write("Happy");
            fw.close(); // закрываем файл на запись
        } catch (IOException e) {
            e.printStackTrace();
        }

        // преобразование строки в число

        try {
            FileReader fr2 = new FileReader("input.txt");
            //int []numbers = new int[6];
            int c = fr2.read();
            String number = "";

            while (c != -1) {
                if ((char) c == ' ') {
                    int v = Integer.parseInt(number);
                    System.out.println();
                    System.out.print(v * v);
                    System.out.print(" ");
                    number = "";
                } else {
                    number += (char) c;
                }
                    c = fr2.read();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
