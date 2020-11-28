package com.sharkbit21.hello;

import com.sharkbit21.greet.Greeter;

public class Hello {
    public static void main(String[] args) {
        Greeter greeter = Greeter.newInstance();
        System.out.println(greeter.greet("Modular World!"));
    }
}