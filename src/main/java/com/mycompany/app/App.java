package com.mycompany.app;

/**
 * Hello world!
 * example
 */
public class App {

    private static final String MESSAGE = "Hello world! - Updated by [YourName] for Jenkins Lab!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(MESSAGE);
    }

    public String getMessage() {
        return MESSAGE;
        //change
        //newchangeeeee
    }
}
