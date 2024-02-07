package com.oopinjava.alarm;

public class Alarm {
    boolean active;
    String message;

    void turnOn(){
        active = true;
    }

    void turnOff(){
        active = false;
    }

    String getReport(boolean uppercase){
        if(active) {
            if (uppercase) {
                return message.toUpperCase();
            } else {
                return message;
            }
        }else
                return "";
    }

    void sendReport(){
        System.out.println(getReport(true));
    }
}
