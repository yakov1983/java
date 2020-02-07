package com.company;

public class Main {

    public static void main(String[] args) {
	    //////////////   многопоточность  ///////////////

        long t = System.currentTimeMillis();
        for (int i = 0; i < 10_000_000; i++) {
           double d = Math.atan(12) * Math.sin(i * 9) * Math.exp(23 - i)* Math.hypot(i, 100);
        }
        System.out.println(System.currentTimeMillis() - t);

        ////
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5_000_000; i++) {
                    double d = Math.atan(12) * Math.sin(i * 9) * Math.exp(23 - i)* Math.hypot(i, 100);
                }
            }
        });

        MyThread thread2 = new MyThread();

        t = System.currentTimeMillis();
        thread1.start();
        thread2.start();

        try {
            thread2.join();
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println(System.currentTimeMillis() - t);

        MyClass myClass = new MyClass();
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 100_000; i++) {
                    myClass.calc(1);
                    myClass.calc2(1, "A");
                }
            }
        });

        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 100_000; i++) {
                    myClass.calc(-1);
                    myClass.calc2(-1, "B");
                }
            }
        });

        thread3.start();
        thread4.start();

        try {
            thread4.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(myClass.value);
        System.out.println(myClass.value2);
    }
}
