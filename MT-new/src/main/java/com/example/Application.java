package com.example;

import java.util.Scanner;



public class Application {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+" started");

         Thread ioThread=new Thread(Application::io);
        Thread computationThread=new Thread(Application::computation);

        ioThread.start();
        computationThread.start();

    }

    private static void computation() {
        System.out.println(Thread.currentThread().getName()+" started computation");
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
        System.out.println(Thread.currentThread().getName()+" finished computation");
    }

    private static void io() {
        System.out.println(Thread.currentThread().getName()+" started IO");
        Scanner scanner=new Scanner(System.in);
        System.out.println("say name");
        String name= scanner.nextLine();
        System.out.println("hello "+name);
        scanner.close();
        System.out.println(Thread.currentThread().getName()+" finished IO");

    }
}
