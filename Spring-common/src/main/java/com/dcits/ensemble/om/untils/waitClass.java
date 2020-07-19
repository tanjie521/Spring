package com.dcits.ensemble.om.untils;

public class waitClass {


    static Object object = new Object();

    public static void main(String[] args) {
        new Thread(() -> {
            synchronized (object) {
                System.out.println("开始线程A");
                try {
                    object.wait();
                    System.out.println("A 线程重新获得锁，继续进行");
                    Thread.sleep(2000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("线程结束 A");
            }
        }, "线程").start();
        new Thread(() -> {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (object) {
                System.out.println("开始线程 B");
                object.notify();
                System.out.println("B 线程通知完线程 A");
                try {
                    Thread.sleep(2000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("结束线程 B");
            }
        }, "线程B").start();
    }
}
