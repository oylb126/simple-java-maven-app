package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

    private static final String MESSAGE = "Hello oylb2026!";

    private static final String MESSAGEold = "Hello";

    public App() {}

    public static void main(String[] args) {
        System.out.println(MESSAGE);
    }

    public String getMessage() {
        return MESSAGE;
    }

    public String getMessage2(String name) {
        return  MESSAGEold + name;
    }

}
