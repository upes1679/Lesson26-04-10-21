package com.threads;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Writing from main thread");
        Thread thread= new AnotherThread();
        thread.start();

        //Thread.sleep(1000);

        System.out.println("Writing from main again");
    }
}
