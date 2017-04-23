package com.zero4kevin;

import java.io.Console;

/**
 * Created by kevin on 4/23/17.
 */
public class ConsoleExample {
    public static void main(String[] args){
        Console console = System.console();
        System.out.println("Enter your name:");
        String name=console.readLine();
        System.out.println("Hello " + name);
        System.out.println("Enter your password");
        char[] password = console.readPassword();
        System.out.println("Your password is " + password.toString());

    }
}
