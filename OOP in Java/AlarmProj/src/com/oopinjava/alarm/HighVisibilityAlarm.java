package com.oopinjava.alarm;

public class HighVisibilityAlarm extends Alarm{

    public HighVisibilityAlarm(String message){
        super(message);
    }

    @Override
    public String getReport(boolean uppercase){
        String report = super.getReport(uppercase); //get report from superclass
        if(report.isEmpty())
            return report;
        else
            return report + "!";
    }

    public static void main(String[] args) {
        HighVisibilityAlarm alarm = new HighVisibilityAlarm("high visibility message");
        alarm.turnOn();
        alarm.sendReport();
    }
}
