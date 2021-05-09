package com.statefarm;

public class Application {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide an argument!");
        } else {
            System.out.println(args[0]);
            System.out.println(String.format("Argument provided: %s", args[0]));
        }
    }
}