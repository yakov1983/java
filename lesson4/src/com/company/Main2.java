package com.company;

public class Main2 {

    public static void main(String[] args) {
	// бинарные операторы
        // & - бинарное "И"
        System.out.println(5 & 7); // 5
        // | - бинарное "ИЛИ"
        System.out.println(5 | 7); // 7
        // >> - бинарного сдвига вправо
        System.out.println(7 >> 2); // 1
        // >> - бинарного сдвига влево
        System.out.println(5 << 3); // 40
        // пример
        // 4 первых бита - скорость (13)
        // 5-7 биты - напряжение (4)
        // 8-11 биты - сила тока (9)
        //1001 100 1101 = 1229

        int data = 1229;
        // 0000000 1101
        // 1 вариант
        int speed = data << 27;
        speed = speed >> 27;
        System.out.println(speed);
        // 2 вариант
        int  maskSpeed = 15; // так называемая маска
        speed = data & maskSpeed;
        System.out.println(speed);

        // напряжение
        int maskVoltage = 112; //0000 100 0000
        int voltage = (data & maskVoltage) >> 4;
        System.out.println(voltage);

        // сила тока
        int current = data >> 7;
        System.out.println(current);
    }
}
