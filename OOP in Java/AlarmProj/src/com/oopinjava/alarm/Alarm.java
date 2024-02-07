package com.oopinjava.alarm;

import java.time.LocalDateTime;

public class Alarm {
    private boolean active;
    private final String message;
    private LocalDateTime snoozeUntil;

    //constructor
    public Alarm(String message){
        this.message = message;
    }

    //getters and setters
    public LocalDateTime getSnoozeUntil(){ return snoozeUntil; }
    
    public void snooze(){
        if(active)
            snoozeUntil = LocalDateTime.now().plusMinutes(5);
    }
    public boolean isSnoozing(){
        return snoozeUntil.isAfter(LocalDateTime.now());
    }
    private void stopSnoozing(){
        snoozeUntil = LocalDateTime.now().minusSeconds(1);
    }
    public void turnOn(){
        active = true;
        stopSnoozing();
    }

    public void turnOff(){
        active = false;
    }

    public String getReport(){
        return getReport(false);
    }
    public String getReport(boolean uppercase){
        if(active && !isSnoozing()) {
            if (uppercase) {
                return message.toUpperCase();
            } else {
                return message;
            }
        }else
                return "";
    }

    public void sendReport(){
        System.out.println(getReport(true));
    }
}
