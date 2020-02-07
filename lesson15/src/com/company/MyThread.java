package com.company;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 5_000_000; i < 10_000_000; i++) {
            double d = Math.atan(12) * Math.sin(i * 9) * Math.exp(23 - i)* Math.hypot(i, 100);
        }
    }
}
