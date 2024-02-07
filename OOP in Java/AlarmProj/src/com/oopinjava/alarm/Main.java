package com.oopinjava.alarm;

import com.oopinjava.alarm.Alarm;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Alarm alarm = new Alarm("Temperature too high");
        alarm.turnOn();
        alarm.snooze();
        alarm.sendReport();
    }
}