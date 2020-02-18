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

                Thread ct = Thread.currentThread();
                synchronized (ct) {
                    try {
                        ct.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    for (int i = 0; i < 100_000; i++) {
                        myClass.calc(1);
                        myClass.calc2(1, "A");
                    }
                }
            }
        });

        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {

                Thread ct = Thread.currentThread();
                System.out.println(ct.getName());

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("\n\n\n\n" + ct.getName() + "wake up\n");

                for(int i = 0; i < 100_000; i++) {
                    if (i == 1000) {
                        synchronized (thread3) {
                            System.out.println(thread3.getState());
                            thread3.notifyAll();
                        }
                    }
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

        ////  currentThread -  возвращает обьект текущего потока

        Thread ct = Thread.currentThread();
        System.out.println(ct.getName());

        ///// sleep - останавливает работу потока на заданное время

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //// wait - приостанвливает работу потока до наступления события о пробуждении

        try {
            // ct.wait(); - не вызывать в основном потоке
        } catch (Exception e) {
            e.printStackTrace();
        }
        ///   чтобы пробудить поток нужно вызвать  notify, notifyAll - они создают для потока событие,
        /// чтобы тот продолжил работать



        /// getState - возвращает текущее состояние потока
        System.out.println(ct.getState());


        ////interrupt - прерывает выполнение потока

        ct.interrupt();

        //// Thread.yield() - завершает квант времени работы потока
        ////  и переключается на следующий
        Thread.yield();

        ///////  setPriority - задает приоритет потока




    }
}
