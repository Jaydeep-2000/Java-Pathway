package com.oopinjava.alarm;

import com.oopinjava.alarm.Alarm;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Alarm alarm = new Alarm();
        alarm.turnOn();
        alarm.sendReport();
    }
}