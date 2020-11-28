package com.sharkbit21.greet.internal;
import com.sharkbit21.greet.Greeter;

public class GreeterImpl implements Greeter {
    public String greet(String subject) {
        return "Hello, " + subject + "!";
    }
}