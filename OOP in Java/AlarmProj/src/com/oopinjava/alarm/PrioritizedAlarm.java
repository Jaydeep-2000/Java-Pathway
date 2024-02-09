package com.oopinjava.alarm;

public class PrioritizedAlarm extends Alarm{
    private final int priority;

    public PrioritizedAlarm(String message, int priority){
        super(message);
        this.priority = priority;
    }
    public int getPriority(){
        return priority;
    }

    public static void main(String[] args) {
        PrioritizedAlarm alarm = new PrioritizedAlarm("Temperature too high",42);
        alarm.getPriority();
    }
}
