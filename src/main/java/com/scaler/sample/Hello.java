package com.scaler.sample;

import java.util.Calendar;

public class Hello {

    public static void main(String[] args) {

        Greet greet = new Greet(Calendar.getInstance());
        System.out.println(greet.fetchGreeting() + " World!");
    }
}
