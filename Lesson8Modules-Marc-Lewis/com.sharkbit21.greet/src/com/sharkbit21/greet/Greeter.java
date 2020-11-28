package com.sharkbit21.greet;

public interface Greeter {
    static Greeter newInstance() {
        return new com.sharkbit21.greet.internal.GreeterImpl();
    }
    String greet(String subject);
}